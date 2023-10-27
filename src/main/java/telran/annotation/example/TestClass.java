package telran.annotation.example;

import telran.test.annotation.BeforeEach;
import telran.test.annotation.Test;

public class TestClass {
	private void f1(int b) {
		System.out.println("Test f1 passed" + b);
	}
	private void f1() {
		System.out.println("Test f1 failed");
	}
	@Test
	void test1 () {
		f1(10);
	}
	@Test
	void test2 () {
		f1();
	}
	@BeforeEach
	void test3 (){
		System.out.println("Test3 is running before each methods.");
		
	}
	@BeforeEach
	void test4 (){
		System.out.println("Test4 is running before each methods.");
		
	}

}
