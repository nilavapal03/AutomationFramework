$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to ActiTime Application and Validate Enter Time-Track heading should be available",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.before({
  "duration": 7425344111,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Login to ActiTime Application",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;login-to-actitime-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@SmokeTest"
    },
    {
      "line": 4,
      "name": "@RegrassionTest"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I want Login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Provide valid userName and passWord",
  "rows": [
    {
      "cells": [
        "Admin",
        "manager"
      ],
      "line": 8
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I want to click on \"Login\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I validate \"Enter Time-Track\" Text",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "validate \"Create New Tasks\" Textfield",
  "keyword": "And "
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_want_Login_to_the_application()"
});
formatter.result({
  "duration": 2056775888,
  "status": "passed"
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_Provide_valid_userName_and_passWord(DataTable)"
});
formatter.result({
  "duration": 273956084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 20
    }
  ],
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_want_to_click_on_Login_button(String)"
});
formatter.result({
  "duration": 107907620,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enter Time-Track",
      "offset": 12
    }
  ],
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_validate_Text(String)"
});
formatter.result({
  "duration": 2605133304,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create New Tasks",
      "offset": 10
    }
  ],
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.validate_Textfield(String)"
});
formatter.result({
  "duration": 17899710944,
  "status": "passed"
});
formatter.write("Finished Scenario");
formatter.after({
  "duration": 2576945288,
  "status": "passed"
});
});