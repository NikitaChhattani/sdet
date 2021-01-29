package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Activity3 {
	WebDriver driver;
	
  @BeforeClass
	  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
	  }
  
  @Test
  public void f() {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
	  driver.findElement(By.xpath("//button[@class='ui button']")).click();
	  
	  String ConfMessage=driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
	  Assert.assertEquals(ConfMessage, "Welcome Back, admin");
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
