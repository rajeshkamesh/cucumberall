$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/tv.feature");
formatter.feature({
  "name": "Tv",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user login to flipkart",
  "keyword": "Given "
});
formatter.match({
  "location": "Mobilesteps.user_login_to_flipkart()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Tv",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tv"
    }
  ]
});
formatter.step({
  "name": "user search tv",
  "keyword": "When "
});
formatter.match({
  "location": "Tvpurchase.user_search_tv()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose the tv",
  "keyword": "And "
});
formatter.match({
  "location": "Tvpurchase.user_choose_the_tv()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user doing payment by using UPI",
  "keyword": "And "
});
formatter.match({
  "location": "Mobilesteps.user_doing_payment_by_using_UPI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user receiving confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "Mobilesteps.user_receiving_confirmation_message()"
});
formatter.result({
  "status": "passed"
});
});