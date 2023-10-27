package telran.annotation.example;


import telran.test.*;

public class TestClassAppl {

	public static void main(String[] args) {
		TestClass testObject = new TestClass();
		TestRunner testRunner = new TestRunner(testObject);
		testRunner.run();
		

	}

}
