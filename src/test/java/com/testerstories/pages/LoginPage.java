package com.testerstories.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
  private final By openSelector = By.id("open");
  private final By usernameSelector = By.id("username");
  private final By passwordSelector = By.id("password");
  private final By loginSelector = By.id("login-button");

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public LoginPage loginAsAdmin() {
    WebElement open = driver.findElement(openSelector);
    WebElement username = driver.findElement(usernameSelector);
    WebElement password = driver.findElement(passwordSelector);
    WebElement login = driver.findElement(loginSelector);

    open.click();
    username.sendKeys("admin");
    password.sendKeys("admin");
    login.submit();

    return new LoginPage(driver);
  }
}
