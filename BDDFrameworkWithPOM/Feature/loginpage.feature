Feature: Login 

Scenario: Login page functionalities test
Given User lunch a browser
When User enter url as "http://admin-demo.nopcommerce.com"
Then User enter Email as "admin@yourstore.com" and Password as "admin"
Then click on login button
Then User click on logout button
Then close the browser