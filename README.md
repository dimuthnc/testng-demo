## Simple Java Project

This simple maven repository is used for the purpose of demonstrating the testNG capabilities. 

To run this Java application, you need to have installed below two applications and they need to be configured as environment variables

1. Java 8 ( refer this[1] document for setting java into path)
2. Maven 3.x.x ( refer this[2] doc for more information)

After installing the above two, please follow the below instructions

1. Go to the home folder of the project and execute <code>mvn clean install</code> in a terminal ( or command prompt)
2. After successful completion of above, go to the <code>org.dimuth.testng.demo</code> class and execute the main method
3. You should be able to see an output like below

<code>
A + B = 6070.0
A - B = -1770.0
A * B = 8428000.0
A / B = 0.548469387755102
Process finished with exit code 0
</code>
[1] - https://www.java.com/en/download/help/path.xml
[2] - https://www.baeldung.com/install-maven-on-windows-linux-mac
