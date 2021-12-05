package Mavenfinal;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObject.Landingpage;
import pageObject.Loginpage;
import pageObject.Practisepage;
import pageObject.Registrationpage;
import resources.Base;

public class TestPractisepage extends Base {
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	public WebDriver driver;
	
	@Test
	public void Practise2() throws IOException
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
		pp.getPractise2().click();
		///driver.switchTo().alert().dismiss();*/
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Practisepage pp=new Practisepage(driver);
		pp.getRadio2().click();
		System.out.println(pp.getRadio2().isSelected());
		pp.getSuggessionclass().sendKeys("ind");
		pp.getSuggessionclass().sendKeys(Keys.DOWN);
		pp.getSuggessionclass().sendKeys(Keys.DOWN);
		pp.getSuggessionclass().sendKeys(Keys.ENTER);
		WebElement staticdropdown=pp.getDropdown();
		Select dropdown= new Select(staticdropdown);
		dropdown.selectByIndex(2);
		pp.getCheckBox2().click();
		pp.getWindow().click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
        System.out.println(pp.getChildwindowtext().getText());
		driver.switchTo().window(parentid);
		pp.getTabopen().click();
		driver.switchTo().window(childid);
		driver.switchTo().window(parentid);
		pp.getAlerttext().sendKeys("Raja siripireddy");
		pp.getAlertbutton().click();
		//Actions a=new Actions(driver);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		pp.getconfirmbutton().click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		pp.getDispalayandHidetext().sendKeys("The text will hide");
		pp.getHidetext().click();
		Assert.assertFalse(pp.getDispalayandHidetext().isDisplayed());
		pp.getShowtext().click();
		Assert.assertTrue(pp.getDispalayandHidetext().isDisplayed());
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");
		//our theme is total sum of table 4th column is equals to totalamountcollected
		System.out.println(pp.getAmounts().size());
		List<WebElement> Listamount=pp.getAmounts();
		int sum=0;
		for(int i=0;i<Listamount.size();i++)
		{
			int number=Integer.parseInt(Listamount.get(i).getText());
			sum=sum+number;
		}
		
	    System.out.println(sum);
    	int count=Integer.parseInt(pp.getTotalamountcollected().getText().split(":")[1].trim());
		Assert.assertEquals(sum, count);
		Actions a=new Actions(driver);
		a.moveToElement(pp.getMousehandling()).build().perform();
		pp.getMousereload().click();
		//In webtable our goal is to take the text in third row and size if rows and columns
		//WebElement tabledriver=pp.getWebtable();
		System.out.println(pp.getRows().size());
		System.out.println(pp.getColumns().size());
		List<WebElement> text=pp.getRowsecond();
		System.out.println(text.get(0).getText());
		System.out.println(text.get(1).getText());
		System.out.println(text.get(2).getText());
		//driver.switchTo().frame(pp.getFrame());
		//brokenliinks
		

		List<WebElement> links= pp.getBrokenlinkss(); 
		SoftAssert sa=new SoftAssert();
		
		for(WebElement link:links)
		{
			String urls=link.getAttribute("href");
			
			HttpURLConnection conn=(HttpURLConnection)new URL(urls).openConnection();
		    conn.setRequestMethod("HEAD");
		    conn.connect();
		    int respcode= conn.getResponseCode();
		    System.out.println(respcode);
		    sa.assertTrue(respcode<400, "The link with text"+link.getText()+"is broken with code"+respcode);
		    
		     	
		}
		log.info("All links are checked");
		sa.assertAll();
	
	}
	

	
	
	
	
	@Test
	public void Practise1() throws IOException
	{   //Vegetables
		driver=initializeDriver();
		/*driver.get(prop.getProperty("url"));
		Landingpage lp=new Landingpage(driver);
		lp.getPractce().click();
		Practisepage pp=new Practisepage(driver);
		pp.getUsername().sendKeys("raja");
		pp.getUseremail().sendKeys("raja.siripireddy@gmail.com");
		pp.getSubmit().click();
		pp.getPractise1().click();*/
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Practisepage pp=new Practisepage(driver);
		String[] reqveg={"Brocolli", "Cucumber", "Apple"};
		List<WebElement> veggy=pp.getVeggies();
		int j=0;
		for(int i=0;i<veggy.size();i++)
		{
			String[] veg=veggy.get(i).getText().split("-");
			String a1= veg[0].trim();
			List a2=Arrays.asList(reqveg);
			if(a2.contains(a1))
			{
				j++;
				pp.getAddtocartbutton().get(i).click();
				if(j==3);
			}
		}
	}
	
	
	@AfterTest
	public void teardrops() {
		driver.close();
	}


}
