$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Checking.feature");
formatter.feature({
  "line": 1,
  "name": "I want to use a banking app",
  "description": "",
  "id": "i-want-to-use-a-banking-app",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Banking with ATM card",
  "description": "",
  "id": "i-want-to-use-a-banking-app;banking-with-atm-card",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@checking"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I want to write a step with \u003cname\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I check for the \u003cvalue\u003e in step",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify the \u003cstatus\u003e in step",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "i-want-to-use-a-banking-app;banking-with-atm-card;",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "status"
      ],
      "line": 10,
      "id": "i-want-to-use-a-banking-app;banking-with-atm-card;;1"
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ],
      "line": 11,
      "id": "i-want-to-use-a-banking-app;banking-with-atm-card;;2"
    },
    {
      "cells": [
        "name2",
        "7",
        "Fail"
      ],
      "line": 12,
      "id": "i-want-to-use-a-banking-app;banking-with-atm-card;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Banking with ATM card",
  "description": "",
  "id": "i-want-to-use-a-banking-app;banking-with-atm-card;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@checking"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I want to write a step with name1",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I check for the 5 in step",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify the success in step",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 12,
  "name": "Banking with ATM card",
  "description": "",
  "id": "i-want-to-use-a-banking-app;banking-with-atm-card;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@checking"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I want to write a step with name2",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I check for the 7 in step",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify the Fail in step",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("GoogleSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Google Search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Title of your scenario",
  "description": "",
  "id": "google-search;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoketest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch PrimusBankURL in Google Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter Username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I validate title",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.i_launch_PrimusBankURL_in_Google_Chrome()"
});
formatter.result({
  "duration": 29199333577,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "stepDefinitions.i_click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.i_validate_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.i_click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("PrimusBankLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login Search",
  "description": "",
  "id": "login-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Title of your scenario",
  "description": "",
  "id": "login-search;title-of-your-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@primus1234"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch PrimusBankURL in Google Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter username \u003cusername\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I validate title",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-search;title-of-your-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "login-search;title-of-your-scenario;;1"
    },
    {
      "cells": [
        "Admin",
        "Admin"
      ],
      "line": 15,
      "id": "login-search;title-of-your-scenario;;2"
    },
    {
      "cells": [
        "Admin",
        "RamSunkara"
      ],
      "line": 16,
      "id": "login-search;title-of-your-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Title of your scenario",
  "description": "",
  "id": "login-search;title-of-your-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@primus1234"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch PrimusBankURL in Google Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter username Admin",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter password Admin",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I validate title",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.i_launch_PrimusBankURL_in_Google_Chrome()"
});
formatter.result({
  "duration": 21967609309,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d78.0.3904.97)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027RAMSUNKARA\u0027, ip: \u0027192.168.1.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.97, chrome: {chromedriverVersion: 77.0.3865.40 (f484704e052e0..., userDataDir: C:\\Users\\SUNKAR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:50898}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3bb54e22e1d0214d00fa609852484dbc\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:276)\r\n\tat stepDefinitions.stepDefinitions.i_launch_PrimusBankURL_in_Google_Chrome(stepDefinitions.java:178)\r\n\tat ✽.Given I launch PrimusBankURL in Google Chrome(PrimusBankLogin.feature:5)\r\n",
  "status": "failed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "stepDefinitions.i_click_on_Login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.i_validate_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.i_click_on_Logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "Title of your scenario",
  "description": "",
  "id": "login-search;title-of-your-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@primus1234"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch PrimusBankURL in Google Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter username Admin",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter password RamSunkara",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I validate title",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.i_launch_PrimusBankURL_in_Google_Chrome()"
});
