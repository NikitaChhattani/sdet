package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		Actions action=new Actions(driver);
		driver.get("https://www.training-support.net/selenium/input-events");
		
		String title=driver.getTitle();
		System.out.println("Title :"+title);
		
		WebElement visible=driver.findElement(By.xpath("//div[starts-with(@id, 'side')]/h1"));
		WebElement Cube=driver.findElement(By.xpath("//div[@id='wrapD3Cube']"));
		Cube.click();
		System.out.println("Left click done, number is :"+visible.getText());
		
		action.doubleClick(Cube).build().perform();
		System.out.println("Double click done, number is :"+visible.getText());
		
		action.contextClick(Cube).build().perform();
		System.out.println("Right click done, number is :"+visible.getText());
		
		driver.close();
		
		
	}

}
