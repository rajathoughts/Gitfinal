package Mavenfinal;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.Landingpage;
import pageObject.Loginpage;
import pageObject.Registrationpage;
import resources.Base;

public class TestRegistration extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	public WebDriver driver;
	
	@Test
	public void Registration() throws IOException
	{
		driver=initializeDriver();
		log.info("driver initiated");
		driver.get(prop.getProperty("url"));
		Landingpage lp=new Landingpage(driver);
		lp.getRegistration().click();
		Registrationpage rp=new Registrationpage(driver);
		rp.getName().sendKeys("siripireddy");
		rp.getEmail().sendKeys("bombay2020@email.com");
		rp.getCreatepassword().sendKeys("mohitha");
		rp.getCheckbox().click();
		Assert.assertTrue(rp.getCheckbox().isSelected());
		System.out.println(rp.getCheckbox().isSelected());
		log.info("checkbox selected");

		rp.getSignUp().click();
		
	}
	
	
	
	
	@AfterTest
	public void teardrops() {
		driver.close();
	}

}
