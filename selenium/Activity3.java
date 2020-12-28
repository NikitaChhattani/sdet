package SeleniumActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		
		String Title=driver.getTitle();
        System.out.println("Title of the page is :"+Title);
        
        driver.findElement(By.id("firstName")).sendKeys("Nikita");
        Thread.sleep(100);
        
        driver.findElement(By.id("lastName")).sendKeys("Chhattani");
        Thread.sleep(100);
        
        driver.findElement(By.id("email")).sendKeys("chhattani2@gmail.com");
        Thread.sleep(100);
        
        driver.findElement(By.id("number")).sendKeys("8336812061");
        Thread.sleep(100);
        
        driver.findElement(By.className("green")).click();
        Thread.sleep(100);
        
        driver.close();
        
	}

}
