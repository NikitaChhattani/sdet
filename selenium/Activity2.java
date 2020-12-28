package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title=driver.getTitle();
		System.out.println("Title of the page is :"+title);
		
		String Text=driver.findElement(By.id("about-link")).getText();
		
		driver.findElement(By.className("green"));
		
		driver.findElement(By.linkText("About Us"));
		
		driver.findElement(By.cssSelector(".green"));
		
		System.out.println("Text of the element :"+Text);
		
		driver.close();
		
	}

}
