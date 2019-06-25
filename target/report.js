$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/Addcustdryrun.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "telecom home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepl.telecom_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks Add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepl.clicks_Add_customer_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "filling all details",
  "rows": [
    {
      "cells": [
        "lav",
        "sath",
        "lavs@gmail.com",
        "trichy",
        "6565668"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "clicks submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepl.clicks_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "see customer id",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepl.see_customer_id()"
});
formatter.result({
  "status": "skipped"
});
});