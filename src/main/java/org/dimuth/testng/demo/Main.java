package org.dimuth.testng.demo;

import org.dimuth.testng.demo.exception.FileReadException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileReadException {

        try {
            String configFileName = "test-config.properties";
            PropertyReader propertyReader = new PropertyReader(configFileName);
            String[] values = propertyReader.getValues();
            String value1 = values[0];
            String value2 = values[1];

            System.out.printf("A + B = " + Operator.addNumbers(value1, value2));
            System.out.println();
            System.out.printf("A - B = " + Operator.subtractNumbers(value1, value2));
            System.out.println();
            System.out.printf("A * B = " + Operator.multiplyNumbers(value1, value2));
            System.out.println();
            System.out.printf("A / B = " + Operator.divideNumbers(value1, value2));
        } catch (IOException e) {
            throw new FileReadException("Failed to read the File Object", e);
        }

    }

}
