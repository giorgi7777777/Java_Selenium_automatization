package Pages;


import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationPage {

    WebDriver driver;
    public RegistrationPage (WebDriver driver) {this.driver = driver;}


    By physical_button = By.xpath("//*[@id='__next']//*//button[2]");
    By company_Name = By.xpath("//*[@id='__next']/main/section/div[2]/form/div[1]/input");
    By ID = By.xpath("//*[@id='__next']/main/section/div[2]/form/div[2]/input");
    By user_name = By.xpath("//*[@id='__next']/main/section/div[2]/form/div[3]/input");
    By user_surname = By. xpath("//*[@id='__next']/main/section/div[2]/form/div[4]/input");
    By mobile_num = By. xpath("//*[@id='__next']/main/section/div[2]/form/div[5]/input");
    By email = By. xpath("//*[@id='__next']/main/section/div[2]/form/div[6]/input");
    By password = By. xpath("//*[@id='__next']/main/section/div[2]/form/div[7]/input");
    By repeated_passw = By. xpath("//*[@id='__next']/main/section/div[2]/form/div[8]/input");
    By checkbox = By. xpath("//*[@id='__next']/main/section/div[2]/form/label/input");

    By registratio_btn = By. xpath("//*[@id='__next']/main/section/div[2]/form/button");
    By moove_Btn = By.xpath("//*[@id='__next']/main/section/div[2]/div[2]/button");
    By legalEntityRegistrationButton = By.xpath("//*[@id=\"__next\"]/main/section/div[2]/div[1]/button[2]");



    @Step
    @Description("click login button")
    public void ClickloginButton () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(physical_button));
        driver.findElement(physical_button).click();
    }



    @Step
    @Description("Enter company name")
    public void EnterUserName (String userName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(company_Name));
        driver.findElement(company_Name).sendKeys(userName);

    }



    @Step
    @Description("Enter company ID")
    public void Enter_Id (String userName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ID));
        driver.findElement(ID).sendKeys(userName);

    }

    @Step
    @Description("Enter user name")
    public void Enter_use_name (String userName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(user_name));
        driver.findElement(user_name).sendKeys(userName);

    }

    @Step
    @Description("Enter surname")
    public void Enter_use_surname(String userName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(user_surname));
        driver.findElement(user_surname).sendKeys(userName);

    }

    @Step
    @Description("Enter mobile num")
    public void Enter_mobile_num(String userName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(mobile_num));
        driver.findElement(mobile_num).sendKeys(userName);

    }

    @Step
    @Description("Enter email address")
    public void Enter_email(String userName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(email));
        driver.findElement(email).sendKeys(userName);

    }

    @Step
    @Description("Enter password")
    public void Enter_password(String userName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(password));
        driver.findElement(password).sendKeys(userName);

    }


    @Step
    @Description("Enter repeated password")
    public void Enter_repeated_passw(String userName) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(repeated_passw));
        driver.findElement(repeated_passw).sendKeys(userName);

    }



    @Step
    @Description("click on check box")
    public void ClickonChekbox () {
        Wait<WebDriver> wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(checkbox));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build().perform();
    }




    @Step
    @Description("click on registration btn")
    public void ClickonRegistrationBtn () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(registratio_btn));
        driver.findElement(registratio_btn).click();
    }






    @Step
    @Description("to scroll web page")
    public void scrollPageByPixels(WebDriver driver, int pixelsToScroll) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        String script = "window.scrollBy(0, " + pixelsToScroll +");";
        jsExecutor.executeScript(script);
    }







    @Step
    @Description("click on moove button")
    public void ClickonMooveBtn () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(moove_Btn));
        driver.findElement(moove_Btn).click();
    }

    @Step
    @Description("click on legal entity button")
    public void ClickLegalEntityButton () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(legalEntityRegistrationButton));
        driver.findElement(legalEntityRegistrationButton).click();
    }


    @Step
    @Description("print three user's names")
    public void printUsersnames(String number,String name) {
        System.out.println(number + " user's name: " + name);
    }


}



