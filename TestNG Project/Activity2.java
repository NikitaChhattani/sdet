package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Activity2 {
	
	WebDriver driver;
  @BeforeClass
	  public void beforeMethod() {
	  
	  driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
	  
	  }
	
  @Test
  public void f1() {
	  
	  String Title=driver.getTitle();
	  System.out.println("Title :"+Title);
	  Assert.assertEquals(Title, "Target Practice");
  }
  
  @Test
  public void f2() {
	  WebElement button=driver.findElement(By.xpath("//button[@class='ui black button']"));
	  Assert.assertTrue(button.isDisplayed());
	  Assert.assertEquals(button.getText(), "black");
  }
  
  @Test(enabled=false)
  public void f3() {
	  System.out.println("Skipped Test");
  }
  
  @Test
  public void f4() {
	  throw new SkipException("Skipping Test4");
  }
  

  @AfterClass
  public void afterMethod() {
	  driver.close();
  }

}
