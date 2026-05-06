package com.opencart.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
glue = "com.opencart.stepdef",
tags = "@AddToCart",
//dryRun = true,
plugin= {"pretty", "html:target/index3.html","json:target/myreport3.json"})



public class AddToCartRunner {

}
