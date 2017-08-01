package br.com.empresa.silkintegration.execution;

import java.io.StringReader;
import java.util.HashMap;

import javax.xml.transform.stream.StreamSource;

import br.com.empresa.silkintegration.helper.Constants;
import br.com.empresa.silkintegration.helper.LerArquivo;
import br.com.empresa.silkintegration.helper.SoapHelper;
import br.com.empresa.silkintegration.helper.Utils;

public class Login {

	private String endpoint = Constants.ENDPOINT + Constants.SCCSYSTEM;
	private String[] defaultUserPass = new String[]{"admin","admin"};
	
	/**
	 * 
	 * @return Long SESSIONID
	 * @throws Exception
	 * @author gabriel.fraga
	 * @since 27/07/2017 - 11:22
	 * @Company Yaman
	 */
	public long login() throws Exception{

		StringBuilder sb = new LerArquivo()
				.lerArquivo(Utils.carregarLinks()
						.getProperty(Constants.Properties.LAYOUTS_PATH)
						+ "sccsystem_logonUser" 
						+ Constants.Properties.XML_EXTENSION);
		
		String template = sb.toString();
		
		HashMap<String, String> valoresMassa = new HashMap<String, String>();
		String response = "";
		String request = "";
		
		valoresMassa.put(Constants.USER_LABEL, defaultUserPass[0]);
		valoresMassa.put(Constants.PASSWORD_LABEL, defaultUserPass[1]);
		
		String content = SoapHelper.mergeTemplate(template, valoresMassa);
		request = SoapHelper.format(content);
		
		response = SoapHelper.executarTransacao(
				new StreamSource(
						new StringReader(request)),
						endpoint,
						false,
						Constants.SOAPACTION_CALCPRAZO,
						this.getClass().getSimpleName());

		String tagValue = SoapHelper.getTagValueByText(response, "<logonUserReturn xsi:type=\"xsd:long\">", "</logonUserReturn>");
		
		return Long.parseLong(tagValue);
	}

}
