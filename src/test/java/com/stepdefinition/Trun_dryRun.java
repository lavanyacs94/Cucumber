package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/feature/Addcustdryrun.feature",glue="com.stepdefinition",plugin="html:target",dryRun=true)

public class Trun_dryRun {
	

}
