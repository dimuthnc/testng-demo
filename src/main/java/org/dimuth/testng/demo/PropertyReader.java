package org.dimuth.testng.demo;

import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    Properties properties;

    public PropertyReader(String configFileName) throws IOException {
        properties = new Properties();
        this.properties.load(PropertyReader.class.getClassLoader().getResourceAsStream(configFileName));

    }

    public String[] getValues() throws IOException {

        String value1 = readProperty("value1");
        String value2 = readProperty("value2");
        return new String[]{value1, value2};
    }

    public String readProperty(String key) {

        return properties.getProperty(key);
    }

}
