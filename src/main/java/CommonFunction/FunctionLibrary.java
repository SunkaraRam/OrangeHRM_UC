package CommonFunction;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilities.PropertyFileUtil;
public class FunctionLibrary {

	public static WebDriver startBrowser(WebDriver driver) throws Throwable {
		
		if(PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("chrome")) {

			System.out.println(PropertyFileUtil.getValueForKey("Browser"));
			
			//System.out.println(PropertyFileUtil.getValueFroKey("URL"));
			
			System.setProperty("webdriver.chrome.driver", "F:\\ChromeDrivers\\v89\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
		}
		
		else if(PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("firefox")) {
		
			System.setProperty("webdriver.gecko.driver", "F:\\Stock_Accounting\\CommonJars\\geckodriver.exe");
						
			driver = new FirefoxDriver();
			
		}
		
		else if(PropertyFileUtil.getValueForKey("Browser").equalsIgnoreCase("ie")) {
			
			System.setProperty("webdriver.gecko.driver", "F:\\Stock_Accounting\\CommonJars\\IEdriver.exe");
		}
		
		return driver;

	}
	
	public static void openApplication(WebDriver driver) throws IOException, Throwable{
		
		driver.get(PropertyFileUtil.getValueForKey("URL"));
		
		driver.manage().window().maximize();
		
		
	}
	
	public static void typeAction(WebDriver driver,String locatortype,String locatorvalue,String testdata) {
		
		if (locatortype.equalsIgnoreCase("id")) {
			
			driver.findElement(By.id(locatorvalue)).clear();
			
			driver.findElement(By.id(locatorvalue)).sendKeys(testdata);
				
		}
		else if (locatortype.equalsIgnoreCase("xpath")) {
			
			driver.findElement(By.xpath(locatorvalue)).clear();
			
			driver.findElement(By.xpath(locatorvalue)).sendKeys(testdata);
				
		}
		
		else if (locatortype.equalsIgnoreCase("name")) {
			
			driver.findElement(By.name(locatorvalue)).clear();
			
			driver.findElement(By.name(locatorvalue)).sendKeys(testdata);
				
		}
	}
	
	public static void moveOnElement(WebDriver driver,String locatortype,String locatorvalue) {
		
if (locatortype.equalsIgnoreCase("id")) {
			
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.id(locatorvalue))).build().perform();;
				
		}
		else if (locatortype.equalsIgnoreCase("xpath")) {
			
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath(locatorvalue))).build().perform();;
				
		}
		
		else if (locatortype.equalsIgnoreCase("name")) {
			
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.name(locatorvalue))).build().perform();;
			
		}
		
		
		
	}

	public static void closeBrowser(WebDriver driver) {
		
		driver.close();
	}
	
	public static void clickAction(WebDriver driver,String locatortype,String locatorvalue) {
		
		if (locatortype.equalsIgnoreCase("xpath")) {
		
			driver.findElement(By.xpath(locatorvalue)).click();
			
		}
		else if (locatortype.equalsIgnoreCase("id")) {
			
			driver.findElement(By.id(locatorvalue)).sendKeys(Keys.ENTER);
		}	
		else if (locatortype.equalsIgnoreCase("name")) {
			
			driver.findElement(By.name(locatorvalue)).sendKeys(Keys.ENTER);
			
		}
	}
	
//	 public static void clickAction(WebDriver driver,String locatortype,String locatorvalue)throws Throwable
//	 {
//		 if(locatortype.equalsIgnoreCase("name"))
//		 {
//			 driver.findElement(By.name(locatorvalue)).click();
//		 }
//		 else if(locatortype.equalsIgnoreCase("id"))
//		 {
//			 driver.findElement(By.id(locatorvalue)).sendKeys(Keys.ENTER);
//		 }
//		 else if(locatortype.equalsIgnoreCase("xpath"))
//		 {
//			 driver.findElement(By.xpath(locatorvalue)).click();
//
//		 }
//	 }
	
	
	public static void waitForElement(WebDriver driver,String locatortype,String locatorvalue,String timetoWait) {
		
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(timetoWait));
		
				if (locatortype.equalsIgnoreCase("id")) {
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorvalue)));
				}
				else if (locatortype.equalsIgnoreCase("xpath")) {
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorvalue)));
				}				
				
				else if (locatortype.equalsIgnoreCase("name")) {
					
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locatorvalue)));
				}
				
	}
	
public static void selectOption(WebDriver driver,String locatortype,String locatorvalue,String testdata) {
	
	
				if (locatortype.equalsIgnoreCase("id")) {
		
					Select sl = new Select(driver.findElement(By.id("systemUser_userType")));
					
					sl.selectByVisibleText(testdata);
		
					Select sl1 = new Select(driver.findElement(By.id("systemUser_status")));
					
					sl1.selectByVisibleText(testdata);
				}
				else if (locatortype.equalsIgnoreCase("xpath")) {
	
					Select sl = new Select(driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
					
					sl.selectByVisibleText(testdata);
		
					Select sl1 = new Select(driver.findElement(By.xpath("//select[@id='systemUser_status']")));
					
					sl1.selectByVisibleText(testdata);
				
				}				
				
				else if (locatortype.equalsIgnoreCase("name")) {
					
					Select sl = new Select(driver.findElement(By.name("systemUser[userType]")));
					
					sl.selectByVisibleText(testdata);
		
					Select sl1 = new Select(driver.findElement(By.name(" ]")));
					
					sl1.selectByVisibleText(testdata);
				}
				
	}
	
	
	
	
public static void titleValidation(WebDriver driver,String exp_title){
		
		String act_title = driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title);
		
		
		
	}
	
	public static String CaptureDate() {
		
		Date date = new Date();
		
		DateFormat sdf = new SimpleDateFormat("mm_dd_yyyy_a");
		
		return sdf.format(date);
	}
	
	public static void Registration(WebDriver driver,String locatortype,String locatorvalue,String timetoWait) {
		
		
		
		
		
	}
	
	
}