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
formatter.scenarioOutline({
  "line": 5,
  "name": "Login to ActiTime Application",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;login-to-actitime-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
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
  "name": "I Provide valid \u003cuserName\u003e and \u003cpassWord\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I want to click on \"Login\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I validate \"Enter Time-Track\" Text",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "validate \"Create New Tasks\" Textfield",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;login-to-actitime-application;",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord"
      ],
      "line": 13,
      "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;login-to-actitime-application;;1"
    },
    {
      "cells": [
        "Admin",
        "manager"
      ],
      "line": 14,
      "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;login-to-actitime-application;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5465463443,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login to ActiTime Application",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;login-to-actitime-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    },
    {
      "line": 4,
      "name": "@RegrassionTest"
    },
    {
      "line": 4,
      "name": "@SmokeTest"
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
  "name": "I Provide valid Admin and manager",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I want to click on \"Login\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I validate \"Enter Time-Track\" Text",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "validate \"Create New Tasks\" Textfield",
  "keyword": "And "
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_want_Login_to_the_application()"
});
formatter.result({
  "duration": 4109321916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 16
    },
    {
      "val": "manager",
      "offset": 26
    }
  ],
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_provide_valid_and(String,String)"
});
formatter.result({
  "duration": 292336793,
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
  "duration": 103187119,
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
  "duration": 2117144158,
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
  "duration": 6710697449,
  "status": "passed"
});
formatter.write("Finished Scenario");
formatter.after({
  "duration": 1522596951,
  "status": "passed"
});
});