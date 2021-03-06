package br.com.empresa.silkintegration.execution;

import java.io.StringReader;
import java.util.HashMap;

import javax.xml.transform.stream.StreamSource;

import org.json.JSONObject;
import org.json.XML;

import com.google.gson.Gson;

import br.com.empresa.silkintegration.execution.modelExecutionRootNode.ExecutionRootNode;
import br.com.empresa.silkintegration.execution.modelTestContainer.TestContainer;
import br.com.empresa.silkintegration.helper.Constants;
import br.com.empresa.silkintegration.helper.LerArquivo;
import br.com.empresa.silkintegration.helper.SoapHelper;
import br.com.empresa.silkintegration.helper.Utils;

public class GetTestContainers {

	private String endpoint = Constants.ENDPOINT + Constants.TMPLANNING;
	private TestContainer tc;
	
	/**
	 * 
	 * @return TestContainer tc
	 * @throws Exception
	 * @author gabriel.fraga
	 * @since 27/07/2017 - 14:14
	 * @Company Yaman
	 */
	public TestContainer getTestContainers(long sessionId, int projectId) throws Exception{

		StringBuilder sb = new LerArquivo()
				.lerArquivo(Utils.carregarLinks()
						.getProperty(Constants.Properties.LAYOUTS_PATH)
						+ "tmplanning_getTestContainers" 
						+ Constants.Properties.XML_EXTENSION);
		
		String template = sb.toString();
		
		HashMap<String, String> valoresMassa = new HashMap<String, String>();
		String response = "";
		String request = "";
		
		valoresMassa.put(Constants.SESSION_ID_LABEL, String.valueOf(sessionId));
		valoresMassa.put(Constants.PROJECT_ID_LABEL, String.valueOf(projectId));
		
		String content = SoapHelper.mergeTemplate(template, valoresMassa);
		request = SoapHelper.format(content);
		
		response = SoapHelper.executarTransacao(
				new StreamSource(
						new StringReader(request)),
						endpoint,
						false,
						Constants.SOAPACTION_CALCPRAZO,
						this.getClass().getSimpleName());

		tc = new Gson().fromJson(XML.toJSONObject(response).toString(), TestContainer.class);
		
		return tc;
	}

}
