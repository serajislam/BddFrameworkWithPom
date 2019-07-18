Feature: Customers 

Scenario: Add a new Customer
Given User lunch a browser
When User enter url as "http://admin-demo.nopcommerce.com"
Then User enter Email as "admin@yourstore.com" and Password as "admin"
Then click on login button
Then user click on Customers menu
Then user click on customers item
Then user click on Add new button
When user enter new customer info
Then user click on Save button
Then User click on logout button
Then close the browser
