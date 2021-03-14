package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import CommonFunction.FunctionLibrary;
import Utilities.DataPass;
public class DriverScript {
	
	WebDriver driver;
	
	@Test
	public void startTest() throws Throwable {
		
		DataPass excel = new DataPass();
		
		for (int i = 1; i <= excel.rowCount("MasterTestCases"); i++) {
			
			String moduleStatus="";
			
			if (excel.getData("MasterTestCases", i, 2).equalsIgnoreCase("y")) {

				String TCModule = excel.getData("MasterTestCases", i, 1);
				
				int rc = excel.rowCount(TCModule);
				
				for (int j = 1; j <=rc; j++) {
					
					String Description = excel.getData(TCModule,j,0);
					
					String objecttype = excel.getData(TCModule,j,1);
					
					String locatortype = excel.getData(TCModule,j,2);
					
					String locatorvalue = excel.getData(TCModule,j,3);
					
					String testdata = excel.getData(TCModule,j,4);
					
					try {
						
					if (objecttype.equalsIgnoreCase("startBrowser")) {
	
						//FunctionLibrary.startBrowser(driver);\\PreviousError
						
						driver = FunctionLibrary.startBrowser(driver);
					}
					
					else if (objecttype.equalsIgnoreCase("openApplication")) {
						
						FunctionLibrary.openApplication(driver);
						
					}
					
					else if (objecttype.equalsIgnoreCase("waitForElement")) {
						
						FunctionLibrary.waitForElement(driver, locatortype, locatorvalue, testdata);
					}
					
					
					else if (objecttype.equalsIgnoreCase("titleValidation")) {
						
						FunctionLibrary.titleValidation(driver, testdata);
					}
					
					else if (objecttype.equalsIgnoreCase("typeAction")) {
						
						FunctionLibrary.typeAction(driver, locatortype, locatorvalue, testdata);
						
						System.out.println(testdata);
						
					}
					
					else if (objecttype.equalsIgnoreCase("moveOnElement")) {
						
						FunctionLibrary.moveOnElement(driver, locatortype, locatorvalue);
						
					}
					
					else if (objecttype.equalsIgnoreCase("clickAction")) {
						
						//FunctionLibrary.clickAction(driver, locatorvalue, locatorvalue);//Second Mistake
					
						FunctionLibrary.clickAction(driver, locatortype, locatorvalue);
					
					}
					
					else if (objecttype.equalsIgnoreCase("closeBrowser")) {
						
						FunctionLibrary.closeBrowser(driver);
						
					}
					
					excel.setData(TCModule, j, 5, "Pass");
					
					moduleStatus = "true";
				
					} catch (Exception e) {
						
						excel.setData(TCModule, j, 5, "Fail");
						moduleStatus="false";
					}
					
					if (moduleStatus.equalsIgnoreCase("true")) {
						
						excel.setData("MasterTestCases", i, 3, "Pass");
						
					}
					if (moduleStatus.equalsIgnoreCase("false")) {
						
						excel.setData("MasterTestCases", i, 3, "Fail");
						
					}
					
					
					}
					
					//excel.setData("MasterTestCases", i, 3, "Pass");
						
					} 
					else {
		
						excel.setData("MasterTestCases", i, 3, "Not Executed");
					
				}
			
		 }
	
		
		
	}
	

}
