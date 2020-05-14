$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to ActiTime Application and Validate Enter Time-Track heading should be available",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15219873396,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login to ActiTime Application",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;login-to-actitime-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    },
    {
      "line": 3,
      "name": "@RegrassionTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I want Login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Provide valid userName and passWord",
  "rows": [
    {
      "cells": [
        "Admin",
        "manager"
      ],
      "line": 7
    }
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
formatter.step({
  "line": 11,
  "name": "Click on close task",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Logout from ActiTime application",
  "keyword": "And "
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_want_Login_to_the_application()"
});
formatter.result({
  "duration": 11350593289,
  "status": "passed"
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_provide_valid_username_and_password(DataTable)"
});
formatter.result({
  "duration": 187710511,
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
  "duration": 95408691,
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
  "duration": 1239917471,
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
  "duration": 5482696295,
  "status": "passed"
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.click_on_close_task()"
});
formatter.result({
  "duration": 83777759,
  "status": "passed"
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.logout_from_actitime_application()"
});
formatter.result({
  "duration": 184425620,
  "status": "passed"
});
formatter.write("Finished Scenario");
formatter.after({
  "duration": 1773917599,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Select four Customer and  four Project to Add Tasks for",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;select-four-customer-and--four-project-to-add-tasks-for",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@FunctionalTest"
    },
    {
      "line": 14,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I want Login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I Provide valid userName and passWord",
  "rows": [
    {
      "cells": [
        "Admin",
        "manager"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I want to click on \"Login\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I validate \"Enter Time-Track\" Text",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "validate \"Create New Tasks\" Textfield",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Validate \"Select Customer and Project to Add Tasks for\" Text",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Create \u003cCustomer\u003e , \u003cCustomerName\u003e , \u003cProjectName\u003e, \u003cTaskName1\u003e and \u003cTaskName2\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;select-four-customer-and--four-project-to-add-tasks-for;",
  "rows": [
    {
      "cells": [
        "Customer",
        "CustomerName",
        "ProjectName",
        "TaskName1",
        "TaskName2"
      ],
      "line": 26,
      "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;select-four-customer-and--four-project-to-add-tasks-for;;1"
    },
    {
      "cells": [
        "- New Customer -",
        "MLBProject56",
        "Foundation",
        "SmokeTest",
        "RegressionTest"
      ],
      "line": 27,
      "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;select-four-customer-and--four-project-to-add-tasks-for;;2"
    },
    {
      "cells": [
        "- New Customer -",
        "Q\u0026EProject78",
        "OA2Project",
        "SanityTest",
        "FunctionalTest"
      ],
      "line": 28,
      "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;select-four-customer-and--four-project-to-add-tasks-for;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5028404325,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Select four Customer and  four Project to Add Tasks for",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;select-four-customer-and--four-project-to-add-tasks-for;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@FunctionalTest"
    },
    {
      "line": 14,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I want Login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I Provide valid userName and passWord",
  "rows": [
    {
      "cells": [
        "Admin",
        "manager"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I want to click on \"Login\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I validate \"Enter Time-Track\" Text",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "validate \"Create New Tasks\" Textfield",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Validate \"Select Customer and Project to Add Tasks for\" Text",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Create - New Customer - , MLBProject56 , Foundation, SmokeTest and RegressionTest",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_want_Login_to_the_application()"
});
formatter.result({
  "duration": 476419792,
  "status": "passed"
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_provide_valid_username_and_password(DataTable)"
});
formatter.result({
  "duration": 165141388,
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
  "duration": 98829762,
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
  "duration": 797667735,
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
  "duration": 5457657780,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Select Customer and Project to Add Tasks for",
      "offset": 10
    }
  ],
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.validate_something_text(String)"
});
formatter.result({
  "duration": 45416526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "- New Customer -",
      "offset": 7
    },
    {
      "val": "MLBProject56",
      "offset": 26
    },
    {
      "val": "Foundation",
      "offset": 41
    },
    {
      "val": "SmokeTest",
      "offset": 53
    },
    {
      "val": "RegressionTest",
      "offset": 67
    }
  ],
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.create_and(String,String,String,String,String)"
});
formatter.result({
  "duration": 9493045164,
  "status": "passed"
});
formatter.write("Finished Scenario");
formatter.after({
  "duration": 1390765516,
  "status": "passed"
});
formatter.before({
  "duration": 3762804939,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Select four Customer and  four Project to Add Tasks for",
  "description": "",
  "id": "login-to-actitime-application-and-validate-enter-time-track-heading-should-be-available;select-four-customer-and--four-project-to-add-tasks-for;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@FunctionalTest"
    },
    {
      "line": 14,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "I want Login to the application",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "I Provide valid userName and passWord",
  "rows": [
    {
      "cells": [
        "Admin",
        "manager"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I want to click on \"Login\" button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I validate \"Enter Time-Track\" Text",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "validate \"Create New Tasks\" Textfield",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Validate \"Select Customer and Project to Add Tasks for\" Text",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Create - New Customer - , Q\u0026EProject78 , OA2Project, SanityTest and FunctionalTest",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_want_Login_to_the_application()"
});
formatter.result({
  "duration": 541057789,
  "status": "passed"
});
formatter.match({
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.i_provide_valid_username_and_password(DataTable)"
});
formatter.result({
  "duration": 146483978,
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
  "duration": 95461584,
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
  "duration": 801717601,
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
  "duration": 5514640503,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Select Customer and Project to Add Tasks for",
      "offset": 10
    }
  ],
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.validate_something_text(String)"
});
formatter.result({
  "duration": 58405703,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "- New Customer -",
      "offset": 7
    },
    {
      "val": "Q\u0026EProject78",
      "offset": 26
    },
    {
      "val": "OA2Project",
      "offset": 41
    },
    {
      "val": "SanityTest",
      "offset": 53
    },
    {
      "val": "FunctionalTest",
      "offset": 68
    }
  ],
  "location": "Login_ActiTime_And_Validate_EnterTimeTrackStep.create_and(String,String,String,String,String)"
});
formatter.result({
  "duration": 9436880309,
  "status": "passed"
});
formatter.write("Finished Scenario");
formatter.after({
  "duration": 762960066,
  "status": "passed"
});
});