package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Registrationpage extends Base {
	
	public WebDriver driver;
	    By name=By.id("user_name");
	    By email=By.id("user_email");
	    By createpassword=By.id("password");
	    By checkbox=By.xpath("//input[@type='checkbox']");
	    By signUp=By.cssSelector("input[type='submit']");
	    
		
		
		public Registrationpage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		public WebElement getName() {
			return driver.findElement(name);
		}
		public WebElement getEmail() {
			return driver.findElement(email);
		}
		public WebElement getCreatepassword() {
			return driver.findElement(createpassword);
		}
		public WebElement getCheckbox() {
			return driver.findElement(checkbox);
		}
		public WebElement getSignUp() {
			return driver.findElement(signUp);
		}

	   

}
