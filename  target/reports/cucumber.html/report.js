$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate manager id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ValidateManagerId"
    }
  ]
});
formatter.step({
  "name": "user launch firefox browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.Steps.user_launch_firefox_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open URL \"https://www.demo.guru99.com/V4/\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.Steps.user_open_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter userId as \"mngr552708\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.Steps.user_enter_userId_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter password as \"EsYmemu\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.Steps.user_enter_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.Steps.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "page title should be \"Guru99 Bank Manager HomePage\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Steps.page_title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Should see a welcome message and the Manager id",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Steps.user_Should_see_a_welcome_message_and_the_Manager_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});