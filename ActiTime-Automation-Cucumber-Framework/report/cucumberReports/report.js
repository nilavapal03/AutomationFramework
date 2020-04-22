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
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_want_Login_to_the_application()"
});
formatter.result({
  "duration": 5973105994,
  "status": "passed"
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_Provide_valid_userName_and_passWord(DataTable)"
});
formatter.result({
  "duration": 153916415,
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
  "duration": 89658790,
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
  "duration": 596875694,
  "status": "passed"
});
});