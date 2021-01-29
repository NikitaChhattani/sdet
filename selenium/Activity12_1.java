package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("https://www.training-support.net/selenium/iframes");
		
		String title=driver.getTitle();
		System.out.println("Title page :"+title);
		
		driver.switchTo().frame(0);
		
		String Frame1Head=driver.findElement(By.xpath("//div[@class='ui header']/div[@class='content']")).getText();
		System.out.println("Heading frame1 :"+Frame1Head);
		
		WebElement button=driver.findElement(By.xpath("//button[@id='actionButton']"));
		System.out.println("Button Text in F1 :"+button.getText());
		System.out.println("Button color in F1 :"+button.getCssValue("background-color"));
		button.click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[@id='actionButton']"), "Button Pressed"));
		System.out.println("Button text after clicking :"+button.getText());
		System.out.println("Button color after clicking :"+button.getCssValue("background-color"));
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		
		String Frame2Head=driver.findElement(By.xpath("//div[@class='ui header']/div[@class='content']")).getText();
		System.out.println("Heading frame2 :"+Frame2Head);
		
		WebElement button2=driver.findElement(By.xpath("//button[@id='actionButton']"));
		//wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//button[@id='actionButton']"), "Button Pressed"));
		System.out.println("Button Text in F2 :"+button2.getText());
		System.out.println("Button color in F2 :"+button2.getCssValue("background-color"));
		
		js.executeScript("arguments[0].scrollIntoView();", button2);
		
		button2.click();
		System.out.println("Button text after clicking :"+button2.getText());
		System.out.println("Button color after clicking :"+button2.getCssValue("background-color"));
		
		
		
		
	}

}
