package com.opencart.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
glue = "com.opencart.stepdef",
tags = "@Login",
//dryRun = true,
plugin= {"pretty", "html:target/index2.html","json:target/myreport2.json"})


public class LoginRunner {
	
	

}
