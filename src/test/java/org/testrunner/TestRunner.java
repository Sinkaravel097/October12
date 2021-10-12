package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.report.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "org.stepdefinition", monochrome = true, dryRun = false, strict = false,plugin={"pretty","html:target","junit:JUnitReport\\junit.xml","json:JSONReport\\jsonrep.json",   
		                                                                                                                                                           "rerun:src\\test\\resources\\failed.txt"})
public class TestRunner {

	// features ---> mention the feature file path
	// glue --> mention the step definition class path
	// monochrome=true --> we can get the output as readable format
	// dryRun=true --> To get the missing snippets alone

	@AfterClass
	public static void createJvmReport() {
		
		JVMReport.generateJvmReport("D:\\NewMaven\\Cucumber11.30am\\JSONReport\\jsonrep.json");

	}
}
 

 

