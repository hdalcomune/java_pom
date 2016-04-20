package com.testerstories;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Importing page objects
import com.testerstories.pages.LoginPage;
import com.testerstories.pages.NavigationPage;

public class LoginSteps {
  WebDriver driver;
  LoginPage login;
  NavigationPage nav;

  @Given("^the Symbiote home page$")
  public void the_Symbiote_home_page() throws Throwable {
    login = new LoginPage(driver);
    login.navigateTo();
  }

  @When("^logging in as an admin$")
  public void logging_in_as_an_admin() throws Throwable {
    login.loginAsAdmin();
  }

  @Then("^the home page navigation is available$")
  public void the_home_page_navigation_is_available() throws Throwable {
    nav = new NavigationPage(driver);
    nav.checkForNavigationList();
  }

  @Before
  public void startUp() {
    driver = new FirefoxDriver();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
