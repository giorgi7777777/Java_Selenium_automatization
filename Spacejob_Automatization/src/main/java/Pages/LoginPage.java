package Pages;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {

    WebDriver driver;
    public LoginPage (WebDriver driver) {this.driver = driver;}



    By next_Btn = By.xpath("//*[@id='identifierNext']/div/button");
    By emailField = By.xpath("//*[@id=\"__next\"]/main/section/div/form/div[1]/input");
    By passwordField = By.xpath("//*[@id=\"__next\"]/main/section/div/form/div[2]/div/input");
    By loginBtn = By.className("Login_defBtn__fjL5Y");
    By loginFormModal = By.className("Login_logForm__AeX2G");





    @Step
    @Description("enter email address")
    public void EnterEmailAddress (String email) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys(email);
    }

    @Step
    @Description("enter password")
    public void EnterPassword (String password) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(passwordField).sendKeys(password);
    }

    @Step
    @Description("click login button")
    public void ClickLoginButton () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
        driver.findElement(loginBtn).click();
    }

    @Step
    @Description("Check login modal")
    public void CheckLoginModal () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginFormModal));
        Assert.assertTrue(driver.findElement(loginFormModal).isDisplayed());
    }





}
