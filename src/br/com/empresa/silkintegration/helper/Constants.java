package br.com.empresa.silkintegration.helper;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * Yaman<BR>
 *
 * @author Gabriel Aguido Fraga<BR>
 *         Yaman<BR>
 * 
 *         automation
 */
public class Constants {

	//==============================HOST VALUES===============================
	
	public static final String HOST = "http://localhost";
	public static final String PORT = "19120";
	public static final String EXECUTION_SERVER_PORT = "19124";
	public static final String DOUBLE_POINTS = ":";
	public static final String BARRA = "/";
	public static final String SERVICES_VERSION = "Services1.0";
	public static final String SERVICES = "services";
	public static final String ENDPOINT = HOST + DOUBLE_POINTS + PORT + BARRA + SERVICES_VERSION + BARRA + SERVICES + BARRA;
	
	//=============================WSDLs======================================
	
	public static final String SCCSYSTEM = "sccsystem";
	public static final String TMEXECUTION = "tmexecution";
	public static final String TMPLANNING = "tmplanning";
	
	//==============================CHARS VALUES===============================
	
	public static final String TIMESTAMP = "dd-MM-yyyy";
	public static final String DATA_BARRA = "dd/MM/yyyy";
	public static final String HORA_MINUTO = "hh-mm";
	public static final String DATA_HORA="yyyyMMdd-HHmmss";
	public static final String OUTPUT_DIR_BASE = ".\\";
	public static final String OUTPUT_DIR_BASE_CONF = "./";
	public static final String TRACO = "-";
	public static final String UNDERLINE = "_";
	public static final String PONTO = ".";
	public static final String PNG_EXTENSION = "png";
	public static final String PNG = "png";
	public static final String PDF_EXTENSION = ".PDF";
	public static final String EXCEL_EXTENSION = ".xlsx";
	public static final String XML_EXTENSION = ".XML";
	public static final String CSV_EXTENSION = ".CSV";
	public static final String HEADERNAMECT = "NOME-CT";
	public static final String CT = "CT-";
	public static final String ARQUIVOMASSA = "massa.csv";
	public static final String ROTULO_EVIDENCIA_TESTE = "Evidencia de Teste";
	public static final String ROTULO_RESULTADO_ESPERADO = "Resultado Esperado";
	public static final String ROTULO_RESULTADO = "Resultado";
	public static final String ROTULO_ACAO = "Acao";
	public static final String ROTULO_STEP = "Step";
	public static final String ROTULO_CENARIO = "Cenario";
	public static final String ROTULO_DATA = "Data";
	public static final String ROTULO_YAMAN = "Yaman";
	public static final String ROTULO_FABRICA = "Fabrica";
	public static final String ERRO = "ERRO";
	public static final String UPDATE = "UPDATE";
	
	
	//==============================VALUES DEFAULT==========================

	public static final String CD_SERVICO = "04014";
	public static final String CEP_ORIGEM = "06472-001";
	public static final String CEP_DESTINO = "06220-060";

	public static final String USER_LABEL = "\\[USER]";
	public static final String PASSWORD_LABEL = "\\[PASSWORD]";
	public static final String SESSION_ID_LABEL = "\\[SESSION_ID]";
	public static final String PROJECT_ID_LABEL = "\\[PROJECT_ID]";
	public static final String EXECUTION_DEF_ID_LABEL = "\\[EXECUTION_DEF_ID]";
	public static final String VERSION_LABEL = "\\[VERSION]";
	public static final String BUILD_LABEL = "\\[BUILD]";
	public static final String EXEC_SERVER_HOST_NAME_LABEL = "\\[EXEC_SERVER_HOST_NAME]";
	public static final String EXEC_SERVER_PORT_LABEL = "\\[EXEC_SERVER_PORT]";
	
	//==============================SOAPAction==============================

	public static final String SOAPACTION_CALCPRAZO = "http://tempuri.org/CalcPrazo";
	
	//==============================PACKAGES================================

	public static String pacote = "br.com.yaman.treinamento";
	public static String classe = "br.com.yaman.treinamento.ui.splash.SplashActivity";

	//======================================================================

	public static String configProperties = "./utilitarios/properties/config.properties";
	public static String servicosProperties = "./utilitarios/properties/servicos.properties";

	public static Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

	public static String CHROMEDRIVER_EXE = "./utilitarios/drivers/chromedriver_win32/chromedriver.exe";
	public static String APP_PATH = "./calculadora.apk";

	public static int NUMERO_TENTATIVAS = 5;

	public static class Commands {

		public static final String ADB_PATH = "adb_path";
		public static final String EMULATOR_PATH = "emulator_path";
	}

	public static class Properties {

		public static final String CONFIG_PATH = "C:/Developer/projects/Treinamento1/utilitarios/properties/xpath.properties";
		public static final String CONFIG_LINKS = "C:/Developer/projects/Treinamento1/utilitarios/properties/config.properties";
		public static final String CONFIG_SERVICOS = "C:/Developer/projects/Treinamento1/utilitarios/properties/servicos.properties";
		public static final String LAYOUTS_PATH = "layouts_path";
		public static final String XML_EXTENSION = ".xml";
		public static final String APP_PATH = "app_path";

		public static class ConfigProperties {

			public static final String URL_HOME_PAGE = "url_home_page";
		}

		public static class ServicosProperties {

			public static final String URL_SERVICO_CALCPRAZO = "url_servico_calcprazo";
			public static final String URL_SERVICO_CORREIOS = "url_servico_correrios";

		}

	}


}
