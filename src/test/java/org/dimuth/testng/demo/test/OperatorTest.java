package org.dimuth.testng.demo.test;

import org.dimuth.testng.demo.Operator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class OperatorTest {

    @BeforeClass
    public void Setup() {

        System.out.println("Setting up test class");
    }

    @DataProvider(name = "dataProviderAddition")
    public Object[][] dataProviderAddition() {

        return new Object[][]{{"123", "234", 357}, {"500", "500", 1000}};
    }

    @DataProvider(name = "dataProviderSubtraction")
    public Object[][] dataProviderSubtraction() {

        return new Object[][]{{"123", "234", -111}, {"500", "500", 0}};
    }

    @Test
    public void testAddNumbers() {

        Assert.assertEquals(Operator.addNumbers("1", "2"), 3);

    }

    @Test(dataProvider = "dataProviderAddition")
    public void testAddNumbersWithDataProvider(String value1, String value2, double value3) {

        Assert.assertEquals(Operator.addNumbers(value1, value2), value3);

    }

    @Test(dataProvider = "dataProviderSubtraction")
    public void testSubtractWithDataProvider(String value1, String value2, double value3){
        Assert.assertEquals(Operator.subtractNumbers(value1,value2),value3);
    }

    @Test (timeOut = 500, expectedExceptions = ThreadTimeoutException.class)
    public void testAddNumbersPlus() throws InterruptedException {
        Operator.addNumbersPlus("1","3");
    }

    @Test (timeOut = 1500, groups = {"fast"})
    public void testAddNumbersPlusPlus() throws InterruptedException {
        Operator.addNumbersPlus("1","3");
    }

    @Test (dependsOnMethods = { "testDependencyTest2" }, groups = {"fast"})
    public void testDependencyTest(){

        System.out.println("World!");
    }

    @Test (groups = {"fast"})
    public void testDependencyTest2(){

        System.out.println("Hello");
    }

}
