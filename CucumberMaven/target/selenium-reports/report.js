$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/win/eclipse-workspace/CucumberMaven/src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "Verifying adactin hotel details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "verifying login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters invalid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "user click login button",
  "keyword": "When "
});
formatter.step({
  "name": "user enters valid PIN",
  "keyword": "When "
});
formatter.step({
  "name": "user click validate button",
  "keyword": "When "
});
formatter.step({
  "name": "user click fund transfer link",
  "keyword": "When "
});
formatter.step({
  "name": "user enter details",
  "keyword": "Then "
});
formatter.step({
  "name": "user signoff",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "1234556666",
        "MavDemo@02"
      ]
    },
    {
      "cells": [
        "1234556666",
        "MavDemo@01"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verifying login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid \"1234556666\" and \"MavDemo@02\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid PIN",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_valid_PIN()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"*[name\u003d\u0027accpin\u0027]\"}\n  (Session info: chrome\u003d85.0.4183.102)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-90JP9BQ\u0027, ip: \u0027192.168.43.163\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.102, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\win\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:54525}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: bdb618f68b968df5b5ade23babbac580\n*** Element info: {Using\u003dname, value\u003daccpin}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:404)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:284)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.StepDefinition.LoginPageSteps.user_enters_valid_PIN(LoginPageSteps.java:70)\r\n\tat ✽.user enters valid PIN(C:/Users/win/eclipse-workspace/CucumberMaven/src/test/resources/Feature/Login.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click validate button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_validate_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click fund transfer link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_fund_transfer_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter details",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_enter_details()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user signoff",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_signoff()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "verifying login details with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid \"1234556666\" and \"MavDemo@01\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid PIN",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_enters_valid_PIN()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click validate button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_validate_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click fund transfer link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_click_fund_transfer_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter details",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_enter_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user signoff",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_signoff()"
});
formatter.result({
  "status": "passed"
});
});