package Mavenfinal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageObject.Flightbookingpage;
import pageObject.Landingpage;
import pageObject.Loginpage;
import pageObject.Practisepage;
import pageObject.Registrationpage;
import resources.Base;

public class TestFlighttcketbooking extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	public WebDriver driver;
	
	@Test
	public void FlightTicketbook() throws IOException
	{
		driver=initializeDriver();
		log.info("driver initiated");
		/*driver.get(prop.getProperty("url"));
		Landingpage lp=new Landingpage(driver);
		lp.getPractce().click();
		Practisepage pp=new Practisepage(driver);
		pp.getUsername().sendKeys("raja");
		pp.getUseremail().sendKeys("raja.siripireddy@gmail.com");
		pp.getSubmit().click();
		pp.getPractise1().click();
		pp.getFlightBooking().click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);*/
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Flightbookingpage ft=new Flightbookingpage(driver);
		ft.getRoundtrip().click();
		ft.getOneway().click();
		ft.getFromaddress().click();
		ft.getVijayawada().click();
		ft.getHyderabad().click();
		String month=ft.getMonthpicker().getText();
		while(!month.contains("December"))
		{
			ft.getNextbutton().click();
		}
		log.info("month selected");
		ft.getDatepaicker().click();
		
		ft.getPassengersbox().click();
		WebElement adult= ft.getAdultplus();
		for(int i=0;i<3;i++)
		{
			adult.click();
		}
		ft.getPassengerdonebtn().click();
		WebElement staticdropdown=ft.getCurrencyboxDD();
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByVisibleText("INR");
		ft.getCheckbox1().click();
		ft.getSearchbtn();
		
		
		
		
	}
	
	
	
	
	@AfterTest
	public void teardrops() {
		driver.close();
	}

}
