package MyRunner;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilities.DataPass;

public class DemoProgram extends DataPass {

	public DemoProgram() throws Throwable {
		super();
		// TODO Auto-generated constructor stub
	}
	
	int k=0;

	@BeforeSuite
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\ChromeDrivers\\v89\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
			
	}
	

	@Test(dataProvider = "getDataSets")
	public void Login(String keyword1,String keyword2) throws Throwable {
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("txtUsername")).sendKeys(keyword1);
		
		driver.findElement(By.id("txtPassword")).sendKeys(keyword2);
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	
		String exp = "validateCredentials";
		
		DataPass dp1 = new DataPass();
		
		if (driver.getCurrentUrl().toLowerCase().contains(exp.toLowerCase())) {
			
				dp1.setData("OrangeHRMLoginInfo",k , 2, "fail");
	
				k++;
		}
		else {
				dp1.setData("OrangeHRMLoginInfo",k , 2, "pass");
			k++;
		}
		
		System.out.println("K value from before method : " + k);

		System.out.println("Username : "+keyword1 + " Password :"+keyword2);
		
	}
	
	@DataProvider(name="getDataSets")
	public Object[][] getData() throws Throwable{
		
		DataPass dp = new DataPass();
		
	
		int rc = DataPass.rowCount("OrangeHRMLoginInfo");
	
		System.out.println(rc);
		
		int cc=DataPass.colCount("OrangeHRMLoginInfo", rc);
		
		System.out.println("rc :" + rc + "cc :" + cc) ;
		
		Object[][] ob = new Object[7][2];
		
		for (int i = 0; i <7; i++) {
			
			
			for (int j = 0; j < 2; j++) {
			
				ob[i][j] = DataPass.getData("OrangeHRMLoginInfo", i, j);
				
			}			
				//ob[i][j] = DataPass.getData("OrangeHRMLoginInfo", i, 1);
		}
		return ob;
		
	 

	}
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();
	}

}
