package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private Properties prop;

    public Properties initializeProperty() {
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src\\test\\java\\config\\config.properties");
            prop.load(fis);
        } catch (Exception e){
            e.printStackTrace();
        }
        return prop;
    }
}
