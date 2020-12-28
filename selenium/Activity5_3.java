package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		
		String title=driver.getTitle();
		System.out.println("Title :"+ title);
		
		WebElement TextInput=driver.findElement(By.xpath("//input[@id='input-text']"));
		
		System.out.println("TextInput is selected :"+TextInput.isEnabled());
		
		driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
		
		System.out.println("TextInput is selected :"+TextInput.isEnabled());
		
		driver.close();
	}

}
