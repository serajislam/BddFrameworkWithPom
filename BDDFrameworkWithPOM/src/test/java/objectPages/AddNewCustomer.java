package objectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddNewCustomer {
	
	public WebDriver driver;
	
	public AddNewCustomer(WebDriver driver)
	{
		this.driver=driver;
	}
	By customerMenu = By.xpath("(//span[text()='Customers'])[1]");
	By customerItem = By.xpath("(//span[text()='Customers'])[2]");
	By addNewButton = By.xpath("//a[@class='btn bg-blue']");
	By newCusEmail = By.id("Email");
	By newCusPwd = By.id("Password");
	By newCusFName = By.id("FirstName");
	By newCusLName = By.id("LastName");
	By newCusGender = By.id("Gender_Male");
	By newCusDOB = By.id("DateOfBirth");
	By newCusComName = By.id("Company");
	
	
	By newCusRole = By.xpath("//input[@class='k-input']");
	By regRole = By.xpath("//li[@class='k-button']//span[contains(text(),'Registered')]");
	By adminRole = By.xpath("//span[contains(text(),'Administrators')]");
	By guestRole = By.xpath("//span[text()='Guests']");
	By vendorsRole = By.xpath("//li[@class='k-button']//span[contains(text(),'Vendors')]");
	
	
	By newCusMOV = By.id("VendorId");
	By newCusAdminCmnt = By.id("AdminComment");
	By saveButton = By.xpath("//button[@name='save']");
	
	
	public void clickCusMenu() throws InterruptedException
	{
		driver.findElement(customerMenu).click();
		Thread.sleep(3000);
	}
	
	public void clickCusItem() throws InterruptedException
	{
		driver.findElement(customerItem).click();
		Thread.sleep(3000);
	}
	
	public void clickAddNewButton()
	{
		driver.findElement(addNewButton).click();
	}
	
	public void setEmail(String email)
	{
		driver.findElement(newCusEmail).sendKeys(email);
	}
	
	public void setPwd()
	{
		driver.findElement(newCusPwd).sendKeys("Test@123");
	}
	
	public void setFirstName()
	{
		driver.findElement(newCusFName).sendKeys("Seraj");
	}

	public void setLastName()
	{
		driver.findElement(newCusLName).sendKeys("Islam");
	}
	
	public void setGender()
	{
		driver.findElement(newCusGender).click();
	}
	
	public void setDOB()
	{
		driver.findElement(newCusDOB).sendKeys("01/11/1990");
	}
	
	public void comName()
	{
		driver.findElement(newCusComName).sendKeys("ABC.com");
	}
	
	public void cusRole() throws InterruptedException
	{
		driver.findElement(newCusRole).click();
		driver.findElement(By.xpath("//li[contains(text(),'Administrators')]")).click();
		Thread.sleep(3000);
//		Select selCusRole = new Select(driver.findElement(newCusRole));
//		selCusRole.deselectByValue("1");
//		driver.findElement(adminRole).click();
////		if(!cusRole.equals("Vendors"))
//		{
//			driver.findElement(By.xpath("//ul[@id='SelectedCustomerRoleIds_taglist']"));
//		}
//		driver.findElement(newCusRole).click();
//		WebElement listItems;
//		
//		if(cusRole.equals("Administrators"))
//		{
//			listItems = driver.findElement(adminRole);
//		}
//		else if(cusRole.equals("Registered"))
//		{
//			listItems = driver.findElement(regRole);
//		}
//		else if(cusRole.equals("Guests"))
//		{
//			listItems = driver.findElement(guestRole);
//		}
//		
//		else
//		{
//			listItems = driver.findElement(vendorsRole);
//		}
//		listItems.click();
		
		
	}
	
	public void cusManageOfVendor()
	{
		Select selCusMOV = new Select(driver.findElement(newCusMOV));
		selCusMOV.selectByVisibleText("Not a vendor");
	}
	
	public void adminComnt() throws InterruptedException
	{
		driver.findElement(newCusAdminCmnt).sendKeys("This is for testing");
		
	}
	
	public void saveButton() throws InterruptedException
	{
		driver.findElement(saveButton).click();
		Thread.sleep(3000);
	}
}
