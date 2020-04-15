@echo off

rem java -cp "C:\Users\alex\.m2\repository\org\testng\testng\7.1.0\testng-7.1.0.jar;src/main/java/*" org.testng.TestNG C:\Users\alex\Desktop\TestJenkins\testng.xml
rem javac C:\Users\alex\Desktop\TestJenkins\src\main\java\Calculator.java -d C:\Users\alex\Desktop\TestJenkins\bin
javac C:\Users\alex\Desktop\TestJenkins\src\main\java\Calculator.java -d C:\Users\alex\Desktop\TestJenkins\bin
javac -cp bin;jars/* C:\Users\alex\Desktop\TestJenkins\src\test\java\CalculatorTest.java -d C:\Users\alex\Desktop\TestJenkins\bin
javac -cp bin;jars/* C:\Users\alex\Desktop\TestJenkins\src\test\java\SeleniumTest.java -d C:\Users\alex\Desktop\TestJenkins\bin
java -cp bin;jars/* org.testng.TestNG testng.xml