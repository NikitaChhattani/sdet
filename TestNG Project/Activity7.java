package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity7 {
	WebDriver driver;
	
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
	  }
	 
  @DataProvider (name="Authentication")
  public static Object[][] credentials(){
	return new Object[][] {{"admin","password"}};
	  
  }
  
  @Test(dataProvider="Authentication")
  public void f(String username,String password) {
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	  driver.findElement(By.xpath("//button[@class='ui button']")).click();
	  
  }
 

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
