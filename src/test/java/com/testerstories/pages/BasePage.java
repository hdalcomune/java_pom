package com.testerstories.pages;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class BasePage {
  protected WebDriver driver;

  public BasePage(WebDriver driver) {
    this.driver = driver;
  }

  public LoginPage navigateTo() {
    driver.navigate().to("https://symbiote-app.herokuapp.com");
    assertEquals("Symbiote", driver.getTitle());
    return new LoginPage(driver);
  }
}
