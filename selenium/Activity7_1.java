package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.get(" https://training-support.net/selenium/dynamic-attributes");
		
		String Title=driver.getTitle();
		System.out.println("Title of the page is "+Title);
		
		driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]")).sendKeys("admin");
		
		driver.findElement(By.xpath("//input[starts-with(@class, 'password-')]")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='action-confirmation']"), "Welcome Back, admin"));
		
		 String Text=driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("Text of the login button :"+Text);
		
		driver.close();
	}

}
