package anotationTest;

import org.testng.annotations.Test;

public class Test4 {

	@Test
	public void WebLoginHome() {
       System.out.println("WebLoginHome");
	}
    @Test
	public void ApiLoginHome() {
      System.out.println("ApiLoginHome");
	}
   @Test(groups = "Smoke")
	public void MobileLoginHome() {
     System.out.println("MobileLoginHome");
	}
}
