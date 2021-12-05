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

public class TestLogin extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	public WebDriver driver;
	

	
	@Test
	public void Validatelogin() throws IOException
	{
		driver=initializeDriver();
		log.info("driver initiated");
		driver.get(prop.getProperty("url"));
		Landingpage lp=new Landingpage(driver);
		lp.getLogin().click();
		Loginpage login= new Loginpage(driver);
		login.getEmailid().sendKeys("skfenflfl");
		login.getPassword().sendKeys("qldjqofjqdp");
		login.getRemembercheckbox().click();
		login.getLogin();
		log.info("successfully login");
	}
	
	@AfterTest
	public void teardrops() {
		driver.close();
	}

}
