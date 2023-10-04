package anotationTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test1 {
	@AfterTest
	public void lastExecute() {
		System.out.println("I Will Execute Last");
	}
	
	@Test(groups = "Smoke")
	public void Demo() {
		
		System.out.println("Test First");
	}
	@Test
	public void demo2() {
		System.out.println("Test Seconds");
	}

}
