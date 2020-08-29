package org.dimuth.testng.demo;

import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    String configFileName;

    public PropertyReader(String configFileName){
        this.configFileName = configFileName;
    }

    public static Properties getProperties(String fileName) throws IOException {

        Properties properties = new Properties();
        properties.load(PropertyReader.class.getClassLoader().getResourceAsStream(fileName));
        return properties;

    }

    public static String getProperty(Properties properties, String key) {

        return properties.getProperty(key);
    }

    public String[] getValues() throws IOException {

        Properties properties = PropertyReader.getProperties(configFileName);
        String value1 = PropertyReader.getProperty(properties, "value1");
        String value2 = PropertyReader.getProperty(properties, "value2");
        return new String[]{value1, value2};
    }

}
