package anotationTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	@BeforeClass
	public void bfClass() {
		System.out.println("Before Executing All The Methods In The Class Will Execute First");
	}
	@AfterClass
	public void afClass() {
		System.out.println("After Executing All The Methods In The Class Will Execute last");
	}

	@Test
	public void WebLoginCar() {
       System.out.println("WebLoginCar");
	}
    @Test(groups = "Smoke")
	public void ApiLoginCar() {
      System.out.println("ApiLoginCar");
	}
    @Test
	public void ApiLoginCar1() {
      System.out.println("ApiLoginCar");
	}
    @Test
	public void ApiLoginCar2() {
      System.out.println("ApiLoginCar");
	}
   @Test
	public void MobileLoginCar() {
     System.out.println("MobileLoginCar");
	}
   @BeforeTest
   public void prequsit() {
	   System.out.println("I Will Execute First");
   }
   @BeforeMethod
	public void bfmethods() {
		System.out.println("I Will Execute After All The Methods Define in ");
	}
   @AfterMethod
   public void afMethods() {
	   System.out.println("After Methdos");
   }

}
