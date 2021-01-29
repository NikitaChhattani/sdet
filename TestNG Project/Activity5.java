package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class Activity5 {
	
	WebDriver driver;
	
  @BeforeTest(alwaysRun=true)
	  public void beforeClass() {
	  
	  driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
	  }

  @Test (groups={"TitleTests"})
  public void titleCheck() {
	  
	 String Title=driver.getTitle();
	  //String title=driver.findElement(By.xpath("//div[@class='content']")).getText();
	  Assert.assertEquals(Title, "Target Practice");
  }
  
  @Test (dependsOnMethods={"titleCheck"},groups={"HeaderTests"})
  public void HeaderTest(){
	  
	  String Header=driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
	  Assert.assertEquals(Header, "Third header");
	  
	  String h5color=driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("background-color");
	  Assert.assertEquals(h5color, "rgba(0, 0, 0, 0)");
	  
  }
  
  @Test (dependsOnMethods={"titleCheck"},groups={"ButtonTests"})
  public void ButtonTest(){
	  
	  String buttonText=driver.findElement(By.xpath("//button[@class='ui olive button']")).getText();
	  Assert.assertEquals(buttonText, "Olive");
	  
	  String b3color=driver.findElement(By.xpath("//button[@class='ui yellow button']")).getCssValue("background-color");
	  Assert.assertEquals(b3color, "rgb(251, 189, 8)");
  }
  
  @AfterTest
  public void afterClass() {
	  driver.close();
  }

}
