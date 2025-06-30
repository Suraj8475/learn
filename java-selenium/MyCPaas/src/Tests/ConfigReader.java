package Tests;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
	private static Properties props;

    static {
        try {
            props = new Properties();
            InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config.properties");
            props.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }

}
