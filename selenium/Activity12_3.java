package SeleniumActivities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Activity12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Actions a=new Actions(driver);
		driver.get("https://www.training-support.net/selenium/popups");
		
		String title=driver.getTitle();
		System.out.println("Title :"+title);
		
		WebElement button=driver.findElement(By.xpath("//button[contains(@class,'orange button')]"));
		a.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
		String popuptext=button.getAttribute("data-tooltip");
		System.out.println("Popup text :"+popuptext);
		
		button.click();
		
		WebElement signInModal=driver.findElement(By.xpath("//div[@id='signInModal']"));
		a.moveToElement(signInModal).build().perform();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		
		WebElement LoginButton=driver.findElement(By.xpath("//button[contains(@onclick,'signIn')]"));
		js.executeScript("arguments[0].scrollIntoView();", LoginButton);
		LoginButton.click();
		
		
		//driver.switchTo().activeElement();
		
		String finaltext=driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("Text on final page after signin :"+finaltext);
	
		
	}

}
