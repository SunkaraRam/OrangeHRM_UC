package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {
	
	WebDriver driver;
	
	@When("^I Launch OrangeHRM on FireFox$")
	public void i_Launch_OrangeHRM_on_FireFox() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver", "D://LatestDrivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		
	
	}

	@And("^I Enter Username <username1> in UsernameField$")
	public void i_Enter_Username_in_UsernameField(String username1) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys();
		
	}

	@And("^I enter password <password1> in PasswordField$")
	public void i_enter_password_in_PasswordField(String password1) throws Throwable {
		driver.findElement(By.name("txtPassword")).sendKeys(password1);
	}

	@When("^I click on LoginButton$")
	public void i_click_on_LoginButton() throws Throwable {
	    
		driver.findElement(By.name("Submit")).click();
	}

	@Then("^I validate title of the page$")
	public void i_validate_title_of_the_page() throws Throwable {
	    
		String act = driver.getTitle();
		
		String exp="OrangeHRM";
		
		Assert.assertEquals(act, exp,"Login success");
		
		
	}

	@When("^I move mouse on Admin$")
	public void i_move_mouse_on_Admin() throws Throwable {
	    
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//b[contains(text(),'Admin')]"))).build().perform();;
		//b[contains(text(),'Admin')]
		
	}

	@Then("^I click on Usermanagement$")
	public void i_click_on_Usermanagement() throws Throwable {
		
		driver.findElement(By.id("menu_admin_UserManagement")).click();
	}

	@Then("^I Click Users$")
	public void i_Click_Users() throws Throwable {
	    
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
	}

	@Then("^I Click Addbutton$")
	public void i_Click_Addbutton() throws Throwable {
	   
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		
	}

	@Then("^I Select User Role$")
	public void i_Select_User_Role() throws Throwable {
	    
		Select sl = new Select(driver.findElement(By.xpath("//select[@id='systemUser_userType']")));
		
		sl.selectByVisibleText("Admin");

		
	}

	@Then("^I Enter EmployeeName$")
	public void i_Enter_EmployeeName() throws Throwable {
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Ram Sunkara");
	
	}

	@Then("^I Enter Username$")
	public void i_Enter_Username() throws Throwable {
	    
		driver.findElement(By.id("systemUser_userName")).sendKeys("Raghu123");
		
	}

	@Then("^I select status of the Employee$")
	public void i_select_status_of_the_Employee() throws Throwable {
	   
		Select sl1 = new Select(driver.findElement(By.id("systemUser_status")));
		
		sl1.selectByVisibleText("Enabled");
		
		
	}

	@Then("^I Enter passwored$")
	public void i_Enter_passwored() throws Throwable {
	    driver.findElement(By.id("systemUser_password")).sendKeys("Ramu@S6699");
	}

	@Then("^I Enter ConfirmPassword$")
	public void i_Enter_ConfirmPassword() throws Throwable {
		
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Ramu@S6699");
	}

	@When("^I wait For Password matching$")
	public void i_wait_For_Password_matching() throws Throwable {
	   
		Thread.sleep(2000);
	}
	@When("^I click On Save button$")
	public void i_click_On_Save_button() throws Throwable {
	    
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
	}
	
	@Then("^I am Close The Browser$")
	public void i_am_Close_The_Browser() throws Throwable {
	
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	//				This is for Primusbank
	
	
	


	@Given("^I launch PrimusBankURL in Google Chrome$")
	public void i_launch_PrimusBankURL_in_Google_Chrome() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
	}
String uid="",pwd="";
	@When("^I enter username \"(.*)\" and \"(.*)\"$")
	public void i_enter_Username(String username) throws Throwable {
		//uid = primUsername;
		driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys(username);
	}

	@When("^I enter password \"(.*)\" and \"(.*)\"$")
	public void i_enter_Password(String password) throws Throwable {
		//pwd=primPassword;
		driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys(password);
		}

	@When("^I click on Login button$")
	public boolean i_click_on_Login_button() throws Throwable {
	
		try {
			
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		String al = driver.switchTo().alert().getText();
		
		System.out.println(al);
		
		if (al.contains("Password")) {
		
			
			driver.switchTo().alert().accept();
	
			System.out.println("Login Falid with "+uid+" "+pwd);
			
		}
	
		return true;
	
		} catch (Exception e) {
				
			return false;
		}
		
	
	}

	@Then("^I validate title$")
	public boolean i_validate_title() throws Throwable {
		
		try {
			
		String title = driver.getTitle();
		
		Assert.assertEquals(title,"Primus BANK");
		
		System.out.println("Login Passed");
		
		return true;
		} catch (Exception e) {
			
			//System.out.println("Login Failed");
			e.printStackTrace();
		
			return false;
		}
		
	}

	@Then("^I click on Logout$")
	public boolean i_click_on_Logout() throws Throwable {
	  
		try {
			
		
		driver.findElement(By.xpath("//td[3]//a[1]//img[1]")).click();
		return true;
		
		} catch (Exception e) {
		
			e.printStackTrace();
			
			return false;
		}
		
	}

	@Then("^Close the browser$")
	public boolean close_the_browser() throws Throwable {
		try {
			
			
			driver.close();
			return true;
			
			} catch (Exception e) {
			
				e.printStackTrace();
				
				return false;
			}
			
	}


	
	

}
