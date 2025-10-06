package demotest;

import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Demo {
	@DisplayName("junitTest")
	@RepeatedTest(2)
	@Test
	public void show() {
		System.out.println("This is show method");
	
	}
	@Ignore
	void hii() {
		System.out.println("This is hii method");
	}
	@Test
	void hello() {
		System.out.println("This is hello method");
	}

}
