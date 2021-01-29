package StepDefinitions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobsAlchemy extends BaseClass {

@Given("^Open a browser and Navigate to \"(.*)\"$")
public void OpenBrowser(String url) {
	driver.get(url);
}

@When("^log in to the page using \"(.*)\" and \"(.*)\"$")
public void LoginPage(String user, String password) {
	
	driver.findElement(By.xpath("//a[contains(@href,'job-dashboard')]")).click();
	
	driver.findElement(By.xpath("//a[@class='button']")).click();
	 
	Wait.until(ExpectedConditions.urlContains("https://alchemy.hguy.co/jobs/wp-login.php?"));
	
	WebElement Username=driver.findElement(By.xpath("//input[@id='user_login']"));
	WebElement Password=driver.findElement(By.xpath("//input[@id='user_pass']"));
	
	
	Username.sendKeys(user);
	Password.sendKeys(password);
	
	driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
	
}

@Then("^Locate the left hand menu and click the menu item that says Users$")
public void locate_the_left_hand_menu_and_click_the_menu_item_that_says_users() {
    // Write code here that turns the phrase above into concrete actions
	WebElement AlchemyJobs=driver.findElement(By.xpath("(//a[@class='ab-item'])[7]"));
	AlchemyJobs.click();
	
}

@And("^Locate the Add New button and click it$")
public void locate_the_add_new_button_and_click_it() {
    // Write code here that turns the phrase above into concrete actions
    
    WebElement Users=driver.findElement(By.xpath("//li[@id='menu-users']"));
	//Wait.until(ExpectedConditions.visibilityOf(Users));
	//Users.click();
	a.moveToElement(Users).build().perform();;
	
	WebElement AddNew=driver.findElement(By.xpath("//a[@href='user-new.php']"));
	Wait.until(ExpectedConditions.elementToBeClickable(AddNew));
	
	AddNew.click();
}

@And("^Fill in the necessary details$")
public void fill_in_the_necessary_details() throws InterruptedException {
    
	driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Nikita59");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Chhattani59@gmail.com");
	Thread.sleep(3000);
	
   
}
@And("^Click the Add New User button$")
public void click_the_add_new_user_button() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//button[contains(@class,'button wp-generate')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='createusersub']")).click();
 
}
@And("^Verify that the user was created$")
public void verify_that_the_user_was_created() {
    // Write code here that turns the phrase above into concrete actions
	List<WebElement> userlist=new ArrayList<WebElement>();
	userlist=driver.findElements(By.xpath("//strong/a"));
	
	//Wait.until(ExpectedConditions.visibilityOfAllElements(userlist));
	
	//ArrayList<String> list = new ArrayList<String>();
	//List<WebElement> userlist=driver.findElements(By.xpath("//tbody[@id='the-list']//strong"));
	WebElement next=driver.findElement(By.xpath("//a[@class='next-page button']"));
	
	outerloop:
	do{
		
		userlist=driver.findElements(By.xpath("//strong/a"));
		//WebElement next1=driver.findElement(By.xpath("//a[@class='next-page button']"));
		
	for(WebElement a:userlist) {
		
		userlist=driver.findElements(By.xpath("//strong/a"));
		String b=a.getText();
		
		if(b.contains("Nikita")) {
		
			System.out.println("User Found-added successfully");
			System.out.println(b);
			break outerloop;
			}
		}
	
	if(driver.findElement(By.xpath("//a[@class='next-page button']")).isEnabled()) {
		WebElement next2=driver.findElement(By.xpath("//a[@class='next-page button']"));
		next2.click();
	}
	else {
		break;
	}
			}while(true);
}



@And("^Generate HTML report$")
public void generate_html_report() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Reports are available under: test-reports/JobAlchemyTest-reports");
   
}






}
