$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Authentification - OrangeHRM",
  "description": "ETQ utilisateur je souhaite m_authentifier",
  "id": "authentification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@authentification"
    }
  ]
});
formatter.before({
  "duration": 2531097000,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Authentification - OrangeHRM",
  "description": "",
  "id": "authentification---orangehrm;authentification---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@authentification"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I open OrangeHRM application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I set username",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I set password",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I check the admin account is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationPageStepDef.iOpenOrangeHRMApplication()"
});
formatter.result({
  "duration": 13845367600,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationPageStepDef.iSetUsername()"
});
formatter.result({
  "duration": 189800,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationPageStepDef.iSetPassword()"
});
formatter.result({
  "duration": 180500,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationPageStepDef.iClickOnLoginButton()"
});
formatter.result({
  "duration": 320400,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationPageStepDef.iCheckTheAdminAccountIsDisplayed()"
});
formatter.result({
  "duration": 114200,
  "status": "passed"
});
formatter.after({
  "duration": 1513744400,
  "status": "passed"
});
});