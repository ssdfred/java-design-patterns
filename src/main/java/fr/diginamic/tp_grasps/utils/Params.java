package fr.diginamic.tp_grasps.utils;

import java.util.ResourceBundle;

public class Params {
	
	private static ResourceBundle bundle = ResourceBundle.getBundle("data");

	public static String getParam(String paramName) {
		return bundle.getString(paramName);
	}
}
