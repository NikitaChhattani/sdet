@JobsAlchemy
Feature: JobsAlchemy Scenarios

@LoginTest
Scenario: Create a new user
Given Open a browser and Navigate to "https://alchemy.hguy.co/jobs"
When log in to the page using "root" and "pa$$w0rd"
Then Locate the left hand menu and click the menu item that says Users
And  Locate the Add New button and click it
And Fill in the necessary details
And Click the Add New User button
And Verify that the user was created
And Generate HTML report  

@JobSearch
Scenario: Searching for jobs using XPath

Given Open a browser and Navigate to Alchemy Job site "https://alchemy.hguy.co/jobs"
When Navigate to the jobs page
Then Find the Keywords search input field  
And Type in keywords to search for jobs and change the Job type
And  Find the filter using XPath and filter job type to show only Full Time jobs
And Find a job listing using XPath and it to see job details
And Find the title of the job listing using XPath and print it to the console
And Find and Click on the “Apply for job” button

@PostJob
Scenario: Posting a job using parameterization
Given Open a browser and Navigate "https://alchemy.hguy.co/jobs/"
When Go to Post a Job page
Then Read job information from the Feature file table and fill in the details
|batra6@gmail.com| Tester4 | Pune | Automation Testing |batra6@gmail.com |IBM|
And Click submit
And Go to the Jobs page
And Confirm job listing is shown on page
|batra6@gmail.com| Tester4 | Pune | Automation Testing |batra6@gmail.com |IBM|
And Generate HTML report

Scenario: Using Examples table to post a job

Given Open a browser and Navigate to "https://alchemy.hguy.co/jobs/wp-admin​"
When Go to Post a Job page
Then Read job information from the Examples table and fill in the details
And Click submit
And Go to the Jobs page
And Confirm job listing is shown on page
And Generate HTML report

