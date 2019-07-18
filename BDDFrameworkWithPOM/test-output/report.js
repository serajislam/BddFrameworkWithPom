$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addnewcustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Customers",
  "description": "",
  "id": "customers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add a new Customer",
  "description": "",
  "id": "customers;add-a-new-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User lunch a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter url as \"http://admin-demo.nopcommerce.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click on Customers menu",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on customers item",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user click on Add new button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enter new customer info",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user click on Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on logout button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_lunch_a_browser()"
});
formatter.result({
  "duration": 4158691719,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com",
      "offset": 19
    }
  ],
  "location": "LoginPageSteps.user_enter_url_as(String)"
});
formatter.result({
  "duration": 8512478261,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 59
    }
  ],
  "location": "LoginPageSteps.user_enter_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 163688256,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.click_on_login_button()"
});
formatter.result({
  "duration": 16073051973,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_Customers_menu()"
});
formatter.result({
  "duration": 3095767648,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_customers_item()"
});
formatter.result({
  "duration": 5379041163,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_Add_new_button()"
});
formatter.result({
  "duration": 6947719245,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_enter_new_customer_info()"
});
formatter.result({
  "duration": 4148769752,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_Save_button()"
});
formatter.result({
  "duration": 4772479729,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_logout_button()"
});
formatter.result({
  "duration": 961116544,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "duration": 56866557,
  "status": "passed"
});
formatter.uri("loginpage.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login page functionalities test",
  "description": "",
  "id": "login;login-page-functionalities-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User lunch a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enter url as \"http://admin-demo.nopcommerce.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enter Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User click on logout button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_lunch_a_browser()"
});
formatter.result({
  "duration": 3259467282,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://admin-demo.nopcommerce.com",
      "offset": 19
    }
  ],
  "location": "LoginPageSteps.user_enter_url_as(String)"
});
formatter.result({
  "duration": 1776511435,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 21
    },
    {
      "val": "admin",
      "offset": 59
    }
  ],
  "location": "LoginPageSteps.user_enter_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 158561443,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.click_on_login_button()"
});
formatter.result({
  "duration": 4804578633,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_click_on_logout_button()"
});
formatter.result({
  "duration": 993898683,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "duration": 61818153,
  "status": "passed"
});
});