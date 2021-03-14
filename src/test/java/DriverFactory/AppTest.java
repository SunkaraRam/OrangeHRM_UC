package DriverFactory;

import org.testng.annotations.Test;

public class AppTest{

		DriverScript ds = new DriverScript();
		
		@Test
		public void now() throws Throwable {
			
			ds.startTest();
		
		}
		
}
