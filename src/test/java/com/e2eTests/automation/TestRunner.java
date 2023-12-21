package com.e2eTests.automation; // à la place de automation le nom du projet

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/specs/features"},
    plugin = {"pretty", "html:target/cucumber-html-report"},
    snippets = SnippetType.CAMELCASE,
    tags =  {"@authentification"}
)
public class TestRunner {

}
