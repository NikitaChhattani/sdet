@OrangeHRM
Feature: OrangeHRM Scenarios


Scenario: Creating a job vacancy

Given Open the ​OrangeHRM​ page and login with credentials provided
When  Navigate to the Recruitment page
Then  Click on the Vacancies menu item to navigate to the vacancies page
And Click on the Add button to navigate to the Add Job Vacancy form
And Fill out the necessary details
And Click the Save button to save the vacancy
And Verify that the vacancy was created
And Close the browser

Scenario:  Adding a candidate for recruitment

Given Open the ​OrangeHRM​ page and login with credentials provided
When  Navigate to the Recruitment page and click on the Add button to add candidate information
Then On the next page fill in the details of the candidate
And Upload a resume (docx or pdf) to the form
And Click Save
And Navigate back to the Recruitments page to confirm candidate entry
And Close the browser

Scenario: Add multiple employees

Given Open the ​OrangeHRM​ page and login with credentials provided
When  Find the PIM option in the menu and click it
Then Click the Add button to add a new Employee
And Make sure the “Create Login Details” checkbox is checked
And Fill in the required fields using the data from the Examples table and click Save
And Repeat this until all the employees and their accounts have been created
And Verify that the employees have been created
And Close the browser

Scenario: Creating multiple vacancies

Given Open the ​OrangeHRM​ page and login with credentials provided
When Navigate to the Recruitment page
Then Click on the Vacancies menu item to navigate to the vacancies page
And  Click on the Add button to navigate to the Add Job Vacancy form
And Fill out the necessary details using data from the Examples tables
And Click the Save button to save the vacancy
And Repeat until all the vacancies have been created
And Verify that all the vacancies have been successfully created
And Close the browser
