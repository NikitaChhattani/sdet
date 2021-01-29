package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;

public class BaseClass {

	WebDriver driver=new FirefoxDriver();
	WebDriverWait Wait=new WebDriverWait(driver,20);
	Actions a=new Actions(driver);
	
	
	
}
