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
  "duration": 5225618207,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Login to ActiTime Application",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;login-to-actitime-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@SmokeTest"
    },
    {
      "line": 6,
      "name": "@RegrassionTest"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I want Login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I Provide valid userName and passWord",
  "rows": [
    {
      "cells": [
        "Admin",
        "manager"
      ],
      "line": 10
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I want to click on \"Login\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I validate \"Enter Time-Track\" Text",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "validate \"Create New Tasks\" Textfield",
  "keyword": "And "
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_want_Login_to_the_application()"
});
formatter.result({
  "duration": 1140818112,
  "status": "passed"
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_Provide_valid_userName_and_passWord(DataTable)"
});
formatter.result({
  "duration": 203877214,
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
  "duration": 104203927,
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
  "duration": 2583828482,
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
  "duration": 6008268280,
  "status": "passed"
});
formatter.write("Finished Scenario");
formatter.after({
  "duration": 1289315577,
  "status": "passed"
});
});