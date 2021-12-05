package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Flightbookingpage extends Base {
	
	public WebDriver driver;
	    By oneway=By.id("ctl00_mainContent_rbtnl_Trip_0");
	    By roundtrip=By.id("ctl00_mainContent_rbtnl_Trip_1");
	    By fromaddress=By.id("ctl00_mainContent_ddl_originStation1_CTXT");
	    By Vijayawada=By.cssSelector("a[value='VGA']");
	    By Hyderabad=By.xpath("(//a[@value='HYD'])[2]");
	    By monthpicker=By.xpath("//span[@class='ui-datepicker-month']");
	    By nextbutton=By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']");
	    By datepaicker=By.cssSelector("a[class='ui-state-default ui-state-highlight']");
	    By Passengersbox=By.id("divpaxinfo");
	    By Adultplus=By.id("hrefIncAdt");
	    By passengerdonebtn=By.id("btnclosepaxoption");
	    By currencyboxDD=By.id("ctl00_mainContent_DropDownListCurrency");
	    By checkbox1=By.id("familyandfriend");
	    By searchbtn=By.id("ctl00_mainContent_btn_FindFlights");
	     ////div/div/div/span[text()='December']
	    
		
		public Flightbookingpage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		
		public WebElement getOneway() {
			return driver.findElement(oneway);
		}
		public WebElement getRoundtrip() {
			return driver.findElement(roundtrip);
		}
		public WebElement getFromaddress() {
			return driver.findElement(fromaddress);
		}
		public WebElement getVijayawada() {
			return driver.findElement(Vijayawada);
		}
		public WebElement getHyderabad() {
			return driver.findElement(Hyderabad);
		}
		public WebElement getMonthpicker() {
			return driver.findElement(monthpicker);
		}
		public WebElement getNextbutton() {
			return driver.findElement(nextbutton);
		}
		public WebElement getDatepaicker() {
			return driver.findElement(datepaicker);
		}
		public WebElement getPassengersbox() {
			return driver.findElement(Passengersbox);
		}
		public WebElement getAdultplus() {
			return driver.findElement(Adultplus);
		}
		public WebElement getPassengerdonebtn() {
			return driver.findElement(passengerdonebtn);
		}
		public WebElement getCurrencyboxDD() {
			return driver.findElement(currencyboxDD);
		}
		public WebElement getCheckbox1() {
			return driver.findElement(checkbox1);
		}
		public WebElement getSearchbtn() {
			return driver.findElement(searchbtn);
		}

		

}