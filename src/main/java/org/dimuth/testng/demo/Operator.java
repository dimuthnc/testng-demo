package org.dimuth.testng.demo;

public class Operator {

    public static double addNumbers(String value1, String value2) {

        double double1 = Double.parseDouble(value1);
        double double2 = Double.parseDouble(value2);
        return double1 + double2;
    }

    public static double subtractNumbers(String value1, String value2) {

        double double1 = Double.parseDouble(value1);
        double double2 = Double.parseDouble(value2);
        return double1 - double2;
    }

    public static double multiplyNumbers(String value1, String value2) {

        double double1 = Double.parseDouble(value1);
        double double2 = Double.parseDouble(value2);
        return double1 * double2;
    }

    public static double divideNumbers(String value1, String value2) {

        double double1 = Double.parseDouble(value1);
        double double2 = Double.parseDouble(value2);
        return double1 / double2;
    }

    public static double addNumbersPlus(String value1, String value2) throws InterruptedException {
        double double1 = Double.parseDouble(value1);
        double double2 = Double.parseDouble(value2);
        Thread.sleep(1000);
        return double1 + double2;
    }

}
