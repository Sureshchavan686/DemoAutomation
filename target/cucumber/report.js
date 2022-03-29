$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/RegisterUser.feature");
formatter.feature({
  "name": "User Registers to Automation Demo Site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User Registers Automation Demo Site with valid data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Automation Demo Site",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Firstname \"\u003cFirstname\u003e\" Last Name \"\u003cLastname\u003e\" and Adress \"\u003cAddress\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters Email \"\u003cEmail\u003e\" Phone \"\u003cPhone\u003e\" and Hobbies",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Lastname",
        "Address",
        "Email",
        "Phone"
      ]
    },
    {
      "cells": [
        "Alex",
        "Chacon",
        "USA",
        "emai@123.com",
        "8545856562"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User Registers Automation Demo Site with valid data",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Automation Demo Site",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinitions.RegisterUser.user_is_on_Automation_Demo_Site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Firstname \"Alex\" Last Name \"Chacon\" and Adress \"USA\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.RegisterUser.user_enters_Firstname_Last_Name_and_Adress(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email \"emai@123.com\" Phone \"8545856562\" and Hobbies",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.RegisterUser.user_enters_Email_Phone_and_Gender_and_Hobbies(java.lang.String,java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@type\u003d\u0027checkbox\u0027 and @value\u003d\u0027Cricket11\u0027]\"}\n  (Session info: chrome\u003d99.0.4844.84)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.2\u0027, revision: \u00279a5a329c5a\u0027\nSystem info: host: \u0027DESKTOP-AFD417S\u0027, ip: \u0027192.168.29.66\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [5632f40845c3b5db6e487d54c1c4eefd, findElement {using\u003dxpath, value\u003d//input[@type\u003d\u0027checkbox\u0027 and @value\u003d\u0027Cricket11\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.84, chrome: {chromedriverVersion: 98.0.4758.102 (273bf7ac8c90..., userDataDir: C:\\Users\\LENOVO\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:59984}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:59984/devtoo..., se:cdpVersion: 99.0.4844.84, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 5632f40845c3b5db6e487d54c1c4eefd\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:558)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:382)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:374)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy24.click(Unknown Source)\r\n\tat com.constants.BaseLibrary.click(BaseLibrary.java:21)\r\n\tat com.pageobjects.RegisterUser_PageObject.enter_user_details2(RegisterUser_PageObject.java:97)\r\n\tat com.stepdefinitions.RegisterUser.user_enters_Email_Phone_and_Gender_and_Hobbies(RegisterUser.java:32)\r\n\tat ✽.User enters Email \"emai@123.com\" Phone \"8545856562\" and Hobbies(file:///H:/Advanced%20Selenium-Appium%20Workspace/Latest_features_of_Selenium/src/test/resources/Features/RegisterUser.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "error_message": "java.io.IOException: The filename, directory name, or volume label syntax is incorrect\r\n\tat java.io.WinNTFileSystem.canonicalize0(Native Method)\r\n\tat java.io.WinNTFileSystem.canonicalize(WinNTFileSystem.java:428)\r\n\tat java.io.File.getCanonicalPath(File.java:624)\r\n\tat org.apache.commons.io.FileUtils.copyFile(FileUtils.java:1064)\r\n\tat org.apache.commons.io.FileUtils.copyFile(FileUtils.java:1028)\r\n\tat com.stepdefinitions.Hooks.tearDown(Hooks.java:48)\r\n",
  "status": "failed"
});
});