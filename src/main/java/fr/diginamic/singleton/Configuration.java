package fr.diginamic.singleton;

import java.io.File;
import java.util.ResourceBundle;

public class Configuration {

	private static Configuration instance = new Configuration();
	private ResourceBundle configuration;
	
	private Configuration() {
		configuration = ResourceBundle.getBundle("configuration");
	}
	public static Configuration getInstance() {
		return instance;
	}
	public String getValue(String Key) {
		

		return configuration.getString(Key);
	}

}
