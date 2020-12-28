package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		String Title=driver.getTitle();
		System.out.println("Title of the current page :"+Title);
		
		driver.findElement(By.xpath("//a[@id='about-link']")).click();
		Thread.sleep(2000);
		
		String NewTitle=driver.getTitle();
		System.out.println("Title of new page :"+NewTitle);
		
		driver.close();
	}

}
