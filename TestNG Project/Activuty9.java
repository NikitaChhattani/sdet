package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class Activuty9 {
	
	WebDriver driver;
	
  @BeforeTest
	  public void beforeTest() {
	  driver=new FirefoxDriver();
	  Reporter.log("URL entered");
	  driver.get("https://www.training-support.net/selenium/javascript-alerts");
	  Reporter.log("Page opened");
	  }
	
  @BeforeMethod
	  public void beforeMethod() {
	  Reporter.log("Page Set-up done");
	  }
  
  
  @Test
  public void simpleAlertTestCase() {
	  WebElement button1=driver.findElement(By.xpath("//button[@id='simple']"));
	  Reporter.log("Found Simple Alert Button");
	  button1.click();
	  Reporter.log("Simple Alert Button : Clicked");
	  
	  
	  driver.switchTo().alert().accept();
	  Reporter.log("Simple Alert Button :Accepted Alert");
	  
  }
  
  @Test
  public void confirmAlertTestCase() {
	  driver.switchTo().defaultContent();
	  WebElement button2=driver.findElement(By.xpath("//button[@id='confirm']"));
	  Reporter.log("Found Confirm Alert Button");
	  button2.click();
	  Reporter.log("confirm Alert Button : Clicked");
	  
	 String text= driver.switchTo().alert().getText();
	  Reporter.log("Confirm Alert Button :"+text);
	  Reporter.log("Focus on Alert button");
	  driver.switchTo().alert().dismiss();
	  Reporter.log("Alert dismissed");
	  
  }

  @Test
  public void promptAlertTestCase() {
	  driver.switchTo().defaultContent();
	  WebElement button3=driver.findElement(By.xpath("//button[@id='prompt']"));
	  Reporter.log("Found prompt Alert Button");
	  button3.click();
	  Reporter.log("prompt Alert Button : Clicked");
	  
	 String text= driver.switchTo().alert().getText();
	  Reporter.log("prompt Alert Button :"+text);
	  Reporter.log("Focus on Alert button");
	  driver.switchTo().alert().dismiss();
	  Reporter.log("Alert dismissed");
  }
  @AfterTest
  public void afterTest() {
	  
	  driver.close();
  }

}
