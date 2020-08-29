package org.dimuth.testng.demo.test;

import org.dimuth.testng.demo.Operator;
import org.dimuth.testng.demo.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.UUID;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PropertyFileReaderTest {

    @BeforeClass
    public void Setup() {

        System.out.println("Setting up test class");
    }

    @Test(groups = {"fast"})
    public void readConfigFileTest() throws IOException {

        Properties properties = PropertyReader.getProperties("test-config.properties");
        Assert.assertNotNull(properties);
        Assert.assertNotNull(properties.getProperty("value1"));

    }

    @Test(expectedExceptions = NullPointerException.class)
    public void readConfigFileTestWithIncorrectName() throws IOException {

        PropertyReader.getProperties("test-config12321.properties");

    }

    @Test
    public void testGetValues() throws IOException {
        PropertyReader propertyReader = mock(PropertyReader.class);
        when(propertyReader.getValues()).thenReturn(new String[]{"125","250"});

        Assert.assertEquals(Operator.addNumbers(propertyReader.getValues()[0], propertyReader.getValues()[1]),375);
    }

}
