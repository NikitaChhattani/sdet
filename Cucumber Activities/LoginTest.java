package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	WebDriver driver;
	WebDriverWait wait;
	
	@Given("^User is on Login page$")
	public void Login() {
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
	}
	
	@When("^User enters username and password$")
	public void userDetails() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
		
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void UserDetails(String username, String password) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@class='ui button']")).click();
	}
	
	@Then("^Read the page title and confirmation message$")
	public void PageConfirm() {
		String confirmation=driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println("confirmation message :"+confirmation);
		
		String title=driver.getTitle();
		System.out.println("Title of the page :"+title);
	}
	
	@And("^Close the Browser$")
	public void Close() {
		driver.close();
		
	}
}
