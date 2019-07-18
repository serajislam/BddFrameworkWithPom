package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By email = By.id("Email");
	By password = By.id("Password");
	By loginButton = By.xpath("//input[@class='button-1 login-button']");
	By logoutButton = By.xpath("//a[contains(text(),'Logout')]");
	
	
	
	public void setUserName(String uName)
	{
		driver.findElement(email).sendKeys(uName);
	}
	
	public void setPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
	public void clickLogoutButton()
	{
		driver.findElement(logoutButton).click();
	}
	

}
