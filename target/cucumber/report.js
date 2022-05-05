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
        "7676945707"
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
  "name": "User enters Username \"sureshrc06@gmail.com\" password \"7676945707\"",
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
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});