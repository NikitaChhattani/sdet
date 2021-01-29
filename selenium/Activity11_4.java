package SeleniumActivities;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://www.training-support.net/selenium/tab-opener");
		
		String PageTitle=driver.getTitle();
		System.out.println("Page Title :"+PageTitle);
		
		String HandleName=driver.getWindowHandle();
		System.out.println("Page Title :"+HandleName);
		
		driver.findElement(By.xpath("//a[@id='launcher']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println("On second window");
		
		Set<String> handleList=driver.getWindowHandles();
		for(String handles:handleList){
			System.out.println("handle name"+handles);
		}
		
		driver.switchTo().activeElement();
		String newTitle=driver.getTitle();
		String Heading=driver.findElement(By.xpath("//div[@class='sub header']")).getText();
		System.out.println("New Heading :"+Heading);
		System.out.println("New window title :"+newTitle);
	
		driver.switchTo().activeElement();
		driver.findElement(By.xpath("//*[@id='actionButton']")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		driver.switchTo().activeElement();
		String newTitle2=driver.getTitle();
		
		String Heading2=driver.findElement(By.xpath("//div[@class='content']")).getText();
		System.out.println("New window title :"+newTitle2);
		System.out.println("New Heading :"+Heading2);
		
		
	}
}
