package Pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPage {

    WebDriver driver;
    public MainPage (WebDriver driver) {this.driver = driver;}

    By authorizationButton = By.linkText("ავტორიზაცია");
    By profileBtn = By.className("Header_btn__eMhuG");
    By userName = By.className("Header_inner___YhBA");
    By registrationBtn = By.linkText("რეგისტრაცია");


    @Step
    @Description("Click authorization button")
    public void ClickAuthBtn () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(authorizationButton));
        driver.findElement(authorizationButton).click();
    }
    @Step
    @Description("Click registration button")
    public void ClickRegistrationbutton () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(registrationBtn));
        driver.findElement(registrationBtn).click();
    }
    
    @Step
    @Description("Click profile button")
    public void ClickProfileBtn () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(profileBtn));
        driver.findElement(profileBtn).click();
    }
    @Step
    @Description("Check user name")
    public void CheckUserName (String name) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
        String userNameText = driver.findElement(userName).getText();
        Assert.assertTrue(userNameText.contains(name));
        System.out.println(name);
    }




    By cv_send = By.className("JobForm_btnPrimary__fgJYx");
    @Step
    @Description("click on CV send BTN")
    public void ClickLonCVsendBtn () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cv_send));
        driver.findElement(cv_send).click();
    }


    By cv_send_name = By.xpath("//*[@id=\"__next\"]/main/section/div[3]/div/div[2]/div/div[3]/section/div/form/div[1]/input");
    @Step
    @Description("check name attribute")
    public void CheckCVname() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cv_send_name));
        Assert.assertTrue(driver.findElement(cv_send_name).isDisplayed());

    }


    By cv_send_surname = By.xpath("//*[@id=\"__next\"]/main/section/div[3]/div/div[2]/div/div[3]/section/div/form/div[2]/input");
    @Step
    @Description("check surname attribute")
    public void CheckCVusername() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cv_send_surname));
        Assert.assertTrue(driver.findElement(cv_send_surname).isDisplayed());

    }

    By cv_send_number = By.xpath("//*[@id=\"__next\"]/main/section/div[3]/div/div[2]/div/div[3]/section/div/form/div[3]/input");
    @Step
    @Description("check number attribute")
    public void CheckCnNumber() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cv_send_number));
        Assert.assertTrue(driver.findElement(cv_send_number).isDisplayed());

    }

    By cv_send_email = By.xpath("//*[@id=\"__next\"]/main/section/div[3]/div/div[2]/div/div[3]/section/div/form/div[4]/input");
    @Step
    @Description("check email attribute")
    public void CheckCVemail() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(cv_send_email));
        Assert.assertTrue(driver.findElement(cv_send_email).isDisplayed());

    }



}
