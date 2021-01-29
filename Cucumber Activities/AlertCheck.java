package StepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlertCheck {

	WebDriver driver;
	WebDriverWait Wait;
	Alert alert;
	
	@Given("^User is on the page$")
	public void UserPage() {
		
		driver=new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
	}
	
	@When("^User clicks the Simple Alert button$")
	public void SimpleAlert() {
		driver.findElement(By.xpath("//button[@id='simple']")).click();
		
	}
	
	@When("^User clicks the Confirm Alert button$")
	public void ConfirmAlert() {
		driver.findElement(By.xpath("//button[@id='confirm']")).click();
	}
	
	@When("^User clicks the Prompt Alert button$")
	public void PromptAlert() {
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
	}
	
	@Then("^Alert opens$")
	public void AlertOpen() {
		alert = driver.switchTo().alert();
	}
	
	@And("^Read the text from it and print it$")
	public void ReadAndPrint(){
		
		System.out.println("Text on the Alert :"+alert.getText());
		
	}
	
	@And("^Write a custom message in it$")
	public void WriteText() {
		alert.sendKeys("AlertText");
	}
	
	@And("^Close the alert$")
	public void CloseAlert() {
		alert.accept();
	}
	
	@And("^Close the alert with Cancel$")
	public void CloseBrowser() {
		alert.dismiss();
	}
	
	
	@And("^Close Browser$")
	public void closeBrowser() {
		driver.close();
	}
}
