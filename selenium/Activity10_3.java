package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		Actions a=new Actions(driver);
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/drag-drop");
		
		String title=driver.getTitle();
		System.out.println("Title :"+title);
		
		WebElement ball=driver.findElement(By.xpath("//img[@id='draggable']"));
		WebElement drop1=driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement drop2=driver.findElement(By.xpath("//div[@id='dropzone2']"));

		a.dragAndDrop(ball, drop1).build().perform();;
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='droppable']/p"), "Dropped!"));
		System.out.println("Ball dropped in zone1");
		
		a.dragAndDrop(ball, drop2).build().perform();;
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@id='dropzone2']/p"), "Dropped!"));
		System.out.println("Ball dropped in zone2");
	}

}
