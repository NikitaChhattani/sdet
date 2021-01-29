package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		Actions action=new Actions(driver);
		
		driver.get("https://www.training-support.net/selenium/input-events");
		
		String Title=driver.getTitle();
		System.out.println("Title :"+Title);
		WebElement KeyPressed=driver.findElement(By.xpath("//div[@id='keyPressed']"));
		action.sendKeys("N").build().perform();
		System.out.println("KeyPressed :"+KeyPressed.getText());
		
		action.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		
		
		
		

	}

}
