package com.epam.reportportal.example.cucumber3.logging;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportsTestWithParameters {

	private static final Logger LOGGER = LoggerFactory.getLogger(ReportAttachmentsTest.class);

	@Given("It is test with parameters")
	public void infoLevel() {
		LOGGER.info("It is test with parameters");
	}

	@Then("I emit number {int} on level info")
	public void infoLevel(int parameters) {
		LOGGER.info("Test with parameters: " + parameters);
	}
}
