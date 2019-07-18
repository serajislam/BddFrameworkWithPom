package stepDefination;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import objectPages.AddNewCustomer;
import objectPages.LoginPage;

public class LoginPageSteps extends BaseClass{

	
	
	@Given("^User lunch a browser$")
	public void user_lunch_a_browser(){
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    
	}

	@When("^User enter url as \"(.*?)\"$")
	public void user_enter_url_as(String url){
		lp = new LoginPage(driver);
		driver.get(url);
	   
	}

	@Then("^User enter Email as \"(.*?)\" and Password as \"(.*?)\"$")
	public void user_enter_Email_as_and_Password_as(String uName, String pwd){
		lp.setUserName(uName);
		lp.setPassword(pwd);
	    
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws InterruptedException{
	    lp.clickLoginButton();
	    
	    Thread.sleep(3000);
	}

	@Then("^User click on logout button$")
	public void user_click_on_logout_button(){
		lp.clickLogoutButton();
	    
	}

	@Then("^close the browser$")
	public void close_the_browser(){
	   driver.close();
	}
	
	
	//Add New Customer steps definition..................................
	@Then("^user click on Customers menu$")
	public void user_click_on_Customers_menu() throws InterruptedException{
		
		addCus = new AddNewCustomer(driver);
		addCus.clickCusMenu();
	    
	}

	@Then("^user click on customers item$")
	public void user_click_on_customers_item() throws InterruptedException{
		addCus.clickCusItem();
	    
	}

	@Then("^user click on Add new button$")
	public void user_click_on_Add_new_button() throws InterruptedException{
		addCus.clickAddNewButton();
		Thread.sleep(2000);
	   
	}

	@When("^user enter new customer info$")
	public void user_enter_new_customer_info() throws InterruptedException{
		String email = randomString()+"@gmail.com";
		addCus.setEmail(email);
		addCus.setPwd();
		addCus.setFirstName();
		addCus.setLastName();
		addCus.setGender();
		addCus.setDOB();
		addCus.comName();
		addCus.cusRole();
		addCus.cusManageOfVendor();
		addCus.adminComnt();
		
	    
	}

	@Then("^user click on Save button$")
	public void user_click_on_Save_button() throws InterruptedException{
		addCus.saveButton();
	   
	}

}
