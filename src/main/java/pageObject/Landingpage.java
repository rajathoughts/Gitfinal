package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Landingpage extends Base {
	
	public WebDriver driver;
	    By registration=By.xpath("//a[contains(@href, '/sign_up')]");
		By login=By.cssSelector(".theme-btn.register-btn");
		By practice=By.xpath("//a[text()='Practice']");
		By validatetitle=By.xpath("//app-home/div/div/div/div/div/div/div/div/h2/span");
		
	
		
		public Landingpage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		public WebElement getRegistration() {
			return driver.findElement(registration);
		}
		public WebElement getLogin() {
			return driver.findElement(login);
		}
		
		public WebElement getPractce() {
			return driver.findElement(practice);
		}
		public WebElement getValidatetitle() {
			return driver.findElement(validatetitle);
		}


	   

}
