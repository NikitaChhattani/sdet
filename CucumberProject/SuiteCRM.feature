@SuiteCRM
Feature: SuiteCRM Scenarios

Scenario: Counting Dashlets 

Given Open the browser to the ​Alchemy CRM​ site and login
When Count the number of Dashlets on the homepage
Then Print the number and title of each Dashlet into the console
And Close the browser

Scenario: Create leads using parameterization

Given Open the browser to the ​Alchemy CRM​ site and login
When Navigate to Sales to Leads to Create Lead
Then Fill in the necessary details to create lead accounts using the values passed from  the Feature file
And Click Save to finish
And Navigate to the View Leads page to see results 
And Close the browser

Scenario: Schedule a meeting and invite members  

Given Open the browser to the ​Alchemy CRM​ site and login
When Navigate to Activities to Meetings to Schedule a Meeting
Then Enter the details of the meeting
And Search for members and add them to the meeting
And The names to be searched will be written in the Feature file in a Examples table
And Click Save
And Navigate to View Meetings page and confirm creation of the meeting
And Close the browser

Scenario: Creating a Product

Given Open the browser to the ​Alchemy CRM​ site and login
When Navigate to All to Products to Create Product
Then Retrieve information about the product from an Examples table in the Feature file
And  Using the data from the table enter the details of the product
And Click Save
And Go to the View Products page to see all products listed
And Close the browser



