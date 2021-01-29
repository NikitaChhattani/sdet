package SeleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		String title=driver.getTitle();
		System.out.println("Title :"+title);
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		Alert al=driver.switchTo().alert();
		System.out.println("Confirm Alert text :"+al.getText());
		al.sendKeys("Yes, you are!");
		al.accept();
	}

}
