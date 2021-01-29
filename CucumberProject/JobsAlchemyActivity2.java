package StepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobsAlchemyActivity2 extends BaseClass{

	
	@Given("^Open a browser and Navigate to Alchemy Job site \"(.*)\"$")
	public void OpenAlchemyJob(String url) {
		driver.get(url);
	}
	
	@When("^Navigate to the jobs page$")
	public void JobPage() {
		driver.findElement(By.linkText("Jobs")).click();
	}
	
	@Then("^Find the Keywords search input field$")
	public void Search_Keyword() {
		WebElement KeySearch=driver.findElement(By.xpath("//input[@id='search_keywords']"));
		}

	@And("^Type in keywords to search for jobs and change the Job type$")
	public void type_in_keywords_to_search_for_jobs_and_change_the_job_type() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement KeySearch=driver.findElement(By.xpath("//input[@id='search_keywords']"));
		KeySearch.sendKeys("test");
		
	    //throw new io.cucumber.java.PendingException();
	}
	@And("^Find the filter using XPath and filter job type to show only Full Time jobs$")
	public void find_the_filter_using_x_path_and_filter_job_type_to_show_only_full_time_jobs() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@id='job_type_freelance']")).click();
		driver.findElement(By.xpath("//input[@id='job_type_internship']")).click();
		driver.findElement(By.xpath("//input[@id='job_type_part-time']")).click();
		driver.findElement(By.xpath("//input[@id='job_type_temporary']")).click();
		
	    //throw new io.cucumber.java.PendingException();
	}
		
	@And("^Find a job listing using XPath and it to see job details$")
	public void find_a_job_listing_using_x_path_and_it_to_see_job_details() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		List<WebElement> jobList=new ArrayList<WebElement>();
		jobList=driver.findElements(By.xpath("//ul[@class='job_listings']/li"));
		Thread.sleep(1000);
		System.out.println("Total Jobs filtered :"+jobList.size());
			
	}

	@And("Find the title of the job listing using XPath and print it to the console")
	public void find_the_title_of_the_job_listing_using_x_path_and_print_it_to_the_console() {
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		
		WebElement jobtitle=driver.findElement(By.xpath("//a/div/h3"));
		System.out.println("Title of the job Listing is :"+jobtitle.getText());
	}

	@And("Find and Click on the “Apply for job” button")
	public void find_and_click_on_the_apply_for_job_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement jobtitle=driver.findElement(By.xpath("(//a/div/h3)[1]"));
		jobtitle.click();
		driver.findElement(By.xpath("//input[@class='application_button button']")).click();
	}
	
	/*@And("^Close the browser$")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.close();
	    
	   
	}
	@And("^Generate HTML report$")
	public void generate_html_report() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Reports are available under: test-reports/JobAlchemyTest-reports");
	   
	}*/



}
