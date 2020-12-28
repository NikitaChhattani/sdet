package SeleniumActivities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/selects");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='single-select']"));
		Select s=new Select(dropdown);
		
		s.selectByVisibleText("Option 2");
		s.selectByIndex(3);
		s.selectByValue("4");
		
		List<WebElement> dropAll=s.getOptions();
	
		for(WebElement options:dropAll){
			System.out.println(options.getText());
	
		
			
		}
	
		
	}

}
