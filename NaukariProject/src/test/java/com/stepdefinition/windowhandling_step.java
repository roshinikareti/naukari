package com.stepdefinition;

import com.pages.Windowhandling_Main;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class windowhandling_step {
	Windowhandling_Main wh=new Windowhandling_Main();
	@Given("^user has launched the  chrome browser$")
	public void user_has_launched_the_chrome_browser() throws Throwable {
	   wh.launchApplication("chrome");//Accessing launchapplication method for launching browser
	}

	@When("^user has opens naukri homepage$")
	public void user_has_opens_naukri_homepage() throws Throwable {
       wh.url();//Accessing url method for opening website
       wh.loginn();//Accessing login method for login to the application
	}

	@Then("^click on govtjobs and choose defence/govt jobs$")
	public void click_on_govtjobs_and_choose_defence_govt_jobs() throws Throwable {
      wh.clickongovtjobs();//calling clickongovtjobs method
	}

	@Then("^click on one of option based on requirement$")
	public void click_on_one_of_option_based_on_requirement() throws Throwable {
		wh.selectreqoption();//accessing selectreqoption method to filter the data
	}
}
