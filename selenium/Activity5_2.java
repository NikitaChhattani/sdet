package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/dynamic-controls");
		
		String title=driver.getTitle();
		System.out.println("Title :"+ title);
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		
		Boolean val=checkbox.isSelected();
		
		if(val==true){
			System.out.println("Checkbox is selected");
		}
		else{
			System.out.println("Check box not selected");
		}
		
		checkbox.click();
		
		Boolean val1=checkbox.isSelected();
		
		if(val1==true){
			System.out.println("Checkbox is selected");
		}
		else{
			System.out.println("Check box not selected");
		}
		
		driver.close();	
	}
	}


