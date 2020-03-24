package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\main\\resources\\features\\TestCase.feature",
plugin = {"pretty", "html:reports/cucumber-html-report"},
tags = {"@tc02_jobalert"},
glue = {"steps"},
monochrome = true
)
public class JobAlert_runner {

}