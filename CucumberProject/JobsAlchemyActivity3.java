package StepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobsAlchemyActivity3 extends BaseClass {

	@Given("^Open a browser and Navigate \"(.*)\"$")
	public void open_a_browser_and_navigate(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.get(url);
	}
	@When("^Go to Post a Job page$")
	public void go_to_post_a_job_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Post a Job")).click();;
	    //throw new io.cucumber.java.PendingException();

	}
	
	@Then("Read job information from the Feature file table and fill in the details")
	public void read_job_information_from_the_feature_file_table_and_fill_in_the_details(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
		Select s=new Select(driver.findElement(By.xpath("//select[@id='job_type']")));
		driver.findElement(By.xpath("//input[@id='create_account_email']")).sendKeys(dataTable.cell(0, 0));
		driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys(dataTable.cell(0, 1));
		driver.findElement(By.xpath("//input[@id='job_location']")).sendKeys(dataTable.cell(0, 2));
		s.selectByVisibleText("Freelance");
		driver.findElement(By.xpath("//iframe[@id='job_description_ifr']")).sendKeys(dataTable.cell(0, 3));
		driver.findElement(By.xpath("//input[@id='application']")).sendKeys(dataTable.cell(0, 4));
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(dataTable.cell(0, 5));
		
	   // throw new io.cucumber.java.PendingException();
	}
	
	@Then("Click submit")
	public void click_submit() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='save_draft']")).click();
	   // throw new io.cucumber.java.PendingException();
	}
	
	@Then("Go to the Jobs page")
	public void go_to_the_jobs_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("job dashboard")).click();
	    //throw new io.cucumber.java.PendingException();
	}
	
	@Then("Confirm job listing is shown on page")
	public void confirm_job_listing_is_shown_on_page(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	    
	    List<WebElement> userlist=new ArrayList<WebElement>();
	    
	    outerloop:
	    for(WebElement a:userlist) {
	    	if(a.getText().contains(dataTable.cell(0, 1))) {
	    		System.out.println("data found-added successfully");
	    		break outerloop;
	    	}
	    	else
	    		{
	    		System.out.println("job not found");
	    		}
	    }
	}
	
	
}
