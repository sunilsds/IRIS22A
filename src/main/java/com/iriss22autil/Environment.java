package com.iriss22autil;

public class Environment {

	private static String filepath = "/src/main/resources/Environment.properties";

	public static String URL;
	
	public static String appUser1;
	

	static {

		PropUtil prop = new PropUtil();

		String baseDir = System.getProperty("user.dir");

		URL = prop.getValue(baseDir + filepath, "app_url");
		
		appUser1= prop.getValue(baseDir+filepath,"app_user1");

	}

}
