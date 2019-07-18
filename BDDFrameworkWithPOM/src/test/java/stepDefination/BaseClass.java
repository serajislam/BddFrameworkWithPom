package stepDefination;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import objectPages.AddNewCustomer;
import objectPages.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	LoginPage lp;
	public AddNewCustomer addCus;
	
	
	//Creating random unique email id 
	public static String randomString()
	{
		String genString  = RandomStringUtils.randomAlphabetic(10);
		return (genString);
	}

}


