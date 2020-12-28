package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		
		String title=driver.getTitle();
		System.out.println("Title :"+ title);
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		Boolean val=checkbox.isDisplayed();
		
		if(val==true){
			System.out.println("Checkbox is available");
		}
		else{
			System.out.println("Check box not available");
		}
		
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		
		Boolean val1=checkbox.isDisplayed();
		
		if(val1==true){
			System.out.println("Checkbox is available");
		}
		else{
			System.out.println("Check box not available");
		}
		
		driver.close();	
	}
	

}
