package Pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommunityPage {

    WebDriver driver;
    public CommunityPage (WebDriver driver) {this.driver = driver;}





    By community_BTN = By.xpath("//*[@id=\"__next\"]/header/div/div/div[1]/nav/ul/li[2]/a");
    By statement_BTN = By.xpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[1]/div[1]/button");


    @Step
    @Description("click on community button")
    public void ClickLonCommunityBtn () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(community_BTN));
        driver.findElement(community_BTN).click();
    }



    @Step
    @Description("click on statement BTN")
    public void ClickLonStatementBtn () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(statement_BTN));
        driver.findElement(statement_BTN).click();
    }


    By email_assert = By.xpath("//*[@id=\"__next\"]/main/div/div/div[3]/section/div/form/div[1]/input");

    @Step
    @Description("check email attribute")
    public void CheckEmailAttribute() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(email_assert));
        Assert.assertTrue(driver.findElement(email_assert).isDisplayed());
    }


    By password_assert = By.xpath("//*[@id=\"__next\"]/main/div/div/div[3]/section/div/form/div[2]/div/input");

    @Step
    @Description("check password attribute")
    public void CheckPasswordAttribute() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(password_assert));
        Assert.assertTrue(driver.findElement(password_assert).isDisplayed());

    }


    By space_btn = By.xpath("//*[@id=\"__next\"]/main/div/div/div[2]/div[2]/div[1]/ul/li[1]/button");
    @Step
    @Description("click on space BTN")
    public void ClickLonSpaceBtn () {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(space_btn));
        driver.findElement(space_btn).click();
    }




}
