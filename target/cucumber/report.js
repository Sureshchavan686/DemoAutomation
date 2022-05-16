$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/UpdateNaukriProfile.feature");
formatter.feature({
  "name": "Automatic update of Naukri Profile",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Update Naukri.com Profile",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on Naukri Site",
  "keyword": "When "
});
formatter.step({
  "name": "User enters Username \"\u003cUsername\u003e\" password \"\u003cPassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User updates profile by making changes",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "sureshrc06@gmail.com",
        "766945707"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Update Naukri.com Profile",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Naukri Site",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepdefinitions.UpdateNaukriProfile.user_is_on_Naukri_Site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Username \"sureshrc06@gmail.com\" password \"766945707\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.UpdateNaukriProfile.user_enters_Username_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User updates profile by making changes",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepdefinitions.UpdateNaukriProfile.user_updates_profile_by_making_changes()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027user-name roboto-bold-text\u0027]\"}\n  (Session info: chrome\u003d101.0.4951.67)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.2\u0027, revision: \u00279a5a329c5a\u0027\nSystem info: host: \u0027DESKTOP-AFD417S\u0027, ip: \u0027192.168.29.66\u0027, os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_321\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [2971facd63503591b45e73689b93d657, findElement {using\u003dxpath, value\u003d//div[@class\u003d\u0027user-name roboto-bold-text\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 101.0.4951.67, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\Users\\LENOVO\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:56749}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:56749/devtoo..., se:cdpVersion: 101.0.4951.67, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 2971facd63503591b45e73689b93d657\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:558)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:382)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:374)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy25.click(Unknown Source)\r\n\tat com.constants.BaseLibrary.click(BaseLibrary.java:23)\r\n\tat com.pageobjects.NaukriProfile_PageObjects.updateProfile(NaukriProfile_PageObjects.java:59)\r\n\tat com.stepdefinitions.UpdateNaukriProfile.user_updates_profile_by_making_changes(UpdateNaukriProfile.java:32)\r\n\tat ✽.User updates profile by making changes(file:///H:/Advanced%20Selenium-Appium%20Workspace/Latest_features_of_Selenium/src/test/resources/Features/UpdateNaukriProfile.feature:6)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});