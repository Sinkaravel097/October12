package org.testrerunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@D:\\NewMaven\\Cucumber11.30am\\src\\test\\resources\\failed.txt" , glue = "org.stepdefinition" , monochrome=true)
public class TestReRunner {

}
