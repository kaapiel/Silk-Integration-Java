package br.com.empresa.silkintegration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.URISyntaxException;
import java.util.Properties;

/**
 * @author Gabriel Fraga
 * 
 * Essa classe tem como finalidade ser uma classe helper,
 * contendo vários métodos que podem ser usados por diversas classes de forma genérica
 * 
 * 
 */
public class Utils {

	/**
	 * @author Gabriel Fraga
	 * 
	 * Método responsável por carregar os linls de configuração dentro do arquivo properties
	 * 
	 * 
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static Properties carregarLinks() throws FileNotFoundException, IOException, URISyntaxException {
		Properties ids = new Properties();

		if(!Inet4Address.getLocalHost().getHostName().toUpperCase().contains("local")){ //máquina local
			File file = new File(Constants.configProperties);
			ids.load(new FileInputStream(file));
		} else {
			File file = new File(Constants.Properties.CONFIG_LINKS);
			ids.load(new FileInputStream(file));
		}

		return ids;
	}

	/**
	 * @author Gabriel Aguido Fraga
	 * 
	 * Método responsável por carregar os links de configuração dentro do arquivo servico.properties
	 * 
	 * 
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public static Properties carregarUrlsServicos() throws FileNotFoundException, IOException, URISyntaxException {

		Properties ids = new Properties();

		if(!Inet4Address.getLocalHost().getHostName().toUpperCase().contains("VININM701LIV")){ //máquina local
			File file = new File(Constants.servicosProperties);
			ids.load(new FileInputStream(file));
		} else {
			File file = new File(Constants.Properties.CONFIG_SERVICOS);
			ids.load(new FileInputStream(file));
		}

		return ids;
	}

}