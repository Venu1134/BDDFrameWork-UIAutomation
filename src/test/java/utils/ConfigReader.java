package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	static Properties prop;

	public static String get(String key) throws Exception {
//		String env = System.getProperty("env", "qa");
//
//		FileInputStream fis = new FileInputStream("src\\main\\java\\configs\\" + env + ".properties");
//
//		prop = new Properties();
//		prop.load(fis);
//
//		return prop.getProperty(key);

		try {
			String env = System.getProperty("env", "qa");
			InputStream is = ConfigReader.class.getClassLoader().getResourceAsStream("configs\\" + env + ".properties");
			prop = new Properties();
			prop.load(is);

			return prop.getProperty(key);

		} catch (Exception e) {
			throw new RuntimeException("Config file not found", e);
		}
	}
}
