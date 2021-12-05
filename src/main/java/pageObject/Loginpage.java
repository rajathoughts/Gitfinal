package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Loginpage extends Base{
	
	public WebDriver driver;
	By emailid=By.id("email");
    By password=By.id("password");
    By remembercheckbox=By.id("remember_me");
    By login=By.xpath("//input[@type='submit']");

    
    public Loginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}
	public WebElement getEmailid() {
		return driver.findElement(emailid);
	}
    public WebElement getPassword() {
		return driver.findElement(password);
	}
    public WebElement getRemembercheckbox() {
		return driver.findElement(remembercheckbox);
	}
    public WebElement getLogin() {
		return driver.findElement(login);
    }

}
