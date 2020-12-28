package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		WebDriverWait wait=new WebDriverWait(driver,10);
		driver.get("https://training-support.net/selenium/dynamic-controls");
		
		String Title=driver.getTitle();
		WebElement Checkbox=driver.findElement(By.xpath("//input[@class='willDisappear']"));
		WebElement ToggleCheckboxButton=driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
		ToggleCheckboxButton.click();
		
		wait.until(ExpectedConditions.invisibilityOf(Checkbox));
		
		ToggleCheckboxButton.click();
		
		wait.until(ExpectedConditions.visibilityOf(Checkbox));
		
		driver.close();
	}

}
