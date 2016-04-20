$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Authentication",
  "description": "",
  "id": "authentication",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18064796490,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Successfully logging in",
  "description": "",
  "id": "authentication;successfully-logging-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the Symbiote home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "logging in as an admin",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the home page navigation is available",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.the_Symbiote_home_page()"
});
formatter.result({
  "duration": 13199448239,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.logging_in_as_an_admin()"
});
formatter.result({
  "duration": 7433099839,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.the_home_page_navigation_is_available()"
});
formatter.result({
  "duration": 119133624,
  "status": "passed"
});
formatter.after({
  "duration": 207561774,
  "status": "passed"
});
});