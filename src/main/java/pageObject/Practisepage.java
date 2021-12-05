package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class Practisepage extends Base{
	
	public WebDriver driver;
	
	public Practisepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
    	this.driver=driver;
	}
	
	 By username=By.id("name");
	 By useremail=By.id("email");
	 By agreecheckbox=By.id("agreeTerms");
	 By submit=By.id("form-submit");
	 
	 public WebElement getUsername() {
			return driver.findElement(username);
		}
	 public WebElement getUseremail() {
			return driver.findElement(useremail);
		}
	 public WebElement getAgreecheckbox() {
			return driver.findElement(agreecheckbox);
		}
	 public WebElement getSubmit() {
			return driver.findElement(submit);
		}
	 

	
    By practise1=By.xpath("//a[contains (@href, 'seleniumPractise/#/')]");
    By veggies=By.xpath("//div[@class='products']/div/h4");
    By Addtocartbutton=By.xpath("//button[text()='ADD TO CART']");
    By flightBooking=By.cssSelector("a[href*='dropdownsPractise']");
    
    public WebElement getPractise1() {
		return driver.findElement(practise1);
	}
    public List<WebElement> getVeggies() {
		return driver.findElements(veggies);
	}
    public List<WebElement> getAddtocartbutton() {
		return driver.findElements(Addtocartbutton);
	}
    public WebElement getFlightBooking() {
		return driver.findElement(flightBooking);
	}
    //
    
    By practise2=By.xpath("//a[contains (@href, 'AutomationPractice')]");
    By radio2=By.xpath("//input[@value='radio2']");
    By suggessionclass=By.id("autocomplete");
    By dropdown=By.cssSelector("#dropdown-class-example");
    By checkBox2=By.cssSelector("#checkBoxOption2");
    By window=By.id("openwindow");
    By childwindowtext=By.xpath("//div[@class='col-sm-6 col-md-8 hidden-xs video-banner']/h3");
    By Tabopen=By.id("opentab");
    By alerttext=By.id("name");
    By alertbutton=By.id("alertbtn");
    By confirmbutton=By.id("confirmbtn");
    By dispalayandHidetext=By.id("displayed-text");
    By hidetext=By.id("hide-textbox");
    By showtext=By.id("show-textbox");
    //By tablesmall=By.xpath("//fieldset/div[@class='tableFixHead']/table[@id='product']");
    By Amounts=By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]");
    By totalamountcollected=By.cssSelector("div[class='totalAmount']");
    By mousehandling=By.id("mousehover");
    By mousereload=By.xpath("//a[text()='Reload']");
    By webtable=By.xpath("//table[@class='table-display']");
    By rows=By.xpath("//table[@class='table-display']/tbody/tr");
    By columns=By.xpath("//table[@class='table-display']/tbody/tr/th");
    By rowsecond=By.xpath("//table[@class='table-display']/tbody/tr[3]/td");
    By frame=By.xpath("//iframe[@id='courses-iframe']");
    By Brokenlinkss=By.xpath("//li[@class='gf-li'] /a");
    
    
	public WebElement getPractise2() {
		return driver.findElement(practise2);
	}
	public WebElement getRadio2() {
		return driver.findElement(radio2);
	}
	public WebElement getSuggessionclass() {
		return driver.findElement(suggessionclass);
	}
	public WebElement getDropdown() {
		return driver.findElement(dropdown);
	}
	
	public WebElement getCheckBox2() {
		return driver.findElement(checkBox2);
	}
	public WebElement getWindow() {
		return driver.findElement(window);
	}
	public WebElement getChildwindowtext() {
		return driver.findElement(childwindowtext);
	}
	public WebElement getTabopen() {
		return driver.findElement(Tabopen);
	}
	public WebElement getAlerttext() {
		return driver.findElement(alerttext);
	}
	public WebElement getAlertbutton() {
		return driver.findElement(alertbutton);
	}
	public WebElement getconfirmbutton() {
		return driver.findElement(confirmbutton);
	}
	public WebElement getDispalayandHidetext() {
		return driver.findElement(dispalayandHidetext);
	}
	public WebElement getHidetext() {
		return driver.findElement(hidetext);
	}
	public WebElement getShowtext() {
		return driver.findElement(showtext);
	}
	/*public WebElement tablesmall() {
		return driver.findElement(tablesmall);
	}*/
	public List<WebElement> getAmounts() {
		return driver.findElements(Amounts);
	}
	public WebElement getTotalamountcollected() {
		return driver.findElement(totalamountcollected);
	}
	public WebElement getMousehandling() {
		return driver.findElement(mousehandling);
	}
	public WebElement getMousereload() {
		return driver.findElement(mousereload);
	}
	public WebElement getWebtable() {
		return driver.findElement(webtable);
	}
	public List<WebElement> getRows() {
		return driver.findElements(rows);
	}
	public List<WebElement> getColumns() {
		return driver.findElements(columns);
	}
	public List<WebElement> getRowsecond() {
		return driver.findElements(rowsecond);
	}
	public WebElement getFrame() {
		return driver.findElement(frame);
	}
	public List<WebElement> getBrokenlinkss() {
		return driver.findElements(Brokenlinkss);
	}



	


  
	By practise3=By.xpath("//a[contains (@href,  'angularpractice/')]");
	public WebElement getPractise3() {
		return driver.findElement(practise3);
	}
    
    

}
