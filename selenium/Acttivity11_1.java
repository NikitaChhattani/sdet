package SeleniumActivities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Acttivity11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		
		String title=driver.getTitle();
		System.out.println("Title :"+title);
		
		driver.findElement(By.xpath("//button[@id='simple']")).click();
		
		Alert al=driver.switchTo().alert();
		String AlertText=al.getText();
		
		System.out.println("AlertText:"+AlertText);
		
		al.accept();
		
		
	}

}
