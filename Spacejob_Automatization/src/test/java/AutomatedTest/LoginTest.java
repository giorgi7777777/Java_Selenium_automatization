package AutomatedTest;

import Pages.CommunityPage;
import Pages.LoginPage;
import Pages.MainPage;
import Pages.RegistrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static DataObject.LoginData.*;

public class LoginTest {

    RegistrationPage registrationPage;
    LoginPage loginPage;
    MainPage mainPage;
    CommunityPage communityPage;
    WebDriver driver;

    @BeforeMethod(description = "configure browser")
    public void setup() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        System.setProperty("webdriver.chrome.driver", "Path of the chrome driver");

        driver.manage().window().maximize();
        driver.navigate().to("https://dev.spacejobs.ge/");


    }

//    @AfterMethod
//    @Description("The use tries to close the page after running every test")
//    public void closeChrome(){
//        driver.close();
//    }


    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login with valid credentials")
    public void ValidLogin () throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        mainPage = new MainPage(driver);
        mainPage.ClickRegistrationbutton();
        registrationPage.ClickLegalEntityButton();

        registrationPage.EnterUserName(validUsername);
        registrationPage.Enter_Id(valid_id);
        registrationPage.Enter_use_name(valid_username);
        registrationPage.Enter_use_surname(valid_useSurname);
        registrationPage.Enter_mobile_num(valid_mob_num);
        registrationPage.Enter_email(valid_email);
        registrationPage.Enter_password(validPassword);
        registrationPage.Enter_repeated_passw(validPassword);
        registrationPage.scrollPageByPixels(driver, 300);

        //ჩექბოქსი რო გამოჩნდეს ამისათვის ველოდებით დროის გარკვეული პერიოდი
        Thread.sleep(7000);
        registrationPage.ClickonChekbox();
        registrationPage.ClickonRegistrationBtn();
        registrationPage.ClickonMooveBtn();
        loginPage.CheckLoginModal();
        loginPage.EnterEmailAddress(valid_email);
        loginPage.EnterPassword(validPassword);
        loginPage.ClickLoginButton();
        mainPage.ClickProfileBtn();
        mainPage.CheckUserName(validUsername);
    }


    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login with valid credentials second user")
    public void ValidLogin_1 () throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        mainPage = new MainPage(driver);
        mainPage.ClickRegistrationbutton();
        registrationPage.ClickLegalEntityButton();
        registrationPage.EnterUserName(validUsername_1);
        registrationPage.Enter_Id(valid_id_1);
        registrationPage.Enter_use_name(valid_username_1);
        registrationPage.Enter_use_surname(valid_useSurname_1);
        registrationPage.Enter_mobile_num(valid_mob_num_1);
        registrationPage.Enter_email(valid_email_1);
        registrationPage.Enter_password(validPassword);
        registrationPage.Enter_repeated_passw(validPassword);
        registrationPage.scrollPageByPixels(driver, 200);

        //ჩექბოქსი რო გამოჩნდეს ამისათვის ველოდებით დროის გარკვეული პერიოდი
        Thread.sleep(7000);
        registrationPage.ClickonChekbox();
        registrationPage.ClickonRegistrationBtn();
        registrationPage.ClickonMooveBtn();
        loginPage.CheckLoginModal();
        loginPage.EnterEmailAddress(valid_email_1);
        loginPage.EnterPassword(validPassword);
        loginPage.ClickLoginButton();
        mainPage.ClickProfileBtn();
        mainPage.CheckUserName(validUsername_1);


    }



    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Login with valid credentials third user")
    public void ValidLogin_2 () throws InterruptedException {
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        mainPage = new MainPage(driver);
        mainPage.ClickRegistrationbutton();
        registrationPage.ClickLegalEntityButton();
        registrationPage.EnterUserName(validUsername_2);
        registrationPage.Enter_Id(valid_id_2);
        registrationPage.Enter_use_name(valid_username_2);
        registrationPage.Enter_use_surname(valid_useSurname_2);
        registrationPage.Enter_mobile_num(valid_mob_num_2);
        registrationPage.Enter_email(valid_email_2);
        registrationPage.Enter_password(validPassword);
        registrationPage.Enter_repeated_passw(validPassword);
        registrationPage.scrollPageByPixels(driver, 1000);

        //ჩექბოქსი რო გამოჩნდეს ამისათვის ველოდებით დროის გარკვეული პერიოდი
        Thread.sleep(7000);
        registrationPage.ClickonChekbox();
        registrationPage.ClickonRegistrationBtn();
        registrationPage.ClickonMooveBtn();
        loginPage.CheckLoginModal();
        loginPage.EnterEmailAddress(valid_email_2);
        loginPage.EnterPassword(validPassword);
        loginPage.ClickLoginButton();
        mainPage.ClickProfileBtn();
        mainPage.CheckUserName(validUsername_2);


        registrationPage.printUsersnames("\n\nFirst", validUsername);
        registrationPage.printUsersnames("Second", validUsername_1);
        registrationPage.printUsersnames("Third", validUsername_2);


    }





//    ავტოტორიზაციის პირველი გზა: მთავარი ფეიჯიდან ვაკლიკავთ "ქომუნითი" ღილაკს რის შემდეგაც გადავდივართ ქომუნითი ფეიჯზე,
//    ამის შემდეგ ვაკლიკავთ პოსტოს დამატების ღილაკს "+" რის შემდეგაც გამოჩნდება ავტორიზაციის ველები, ხოლო შემდეგ ხდება
//    ასერტების საშუალებით შემოწმება, ხილვადია თუ არა იმეილის და პაროლის ველები.
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check registration By asserts way_1 ")
    public void CheckRegistration_1 () throws InterruptedException {

        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        mainPage = new MainPage(driver);
        communityPage = new CommunityPage(driver);

        communityPage.ClickLonCommunityBtn();
        communityPage.ClickLonStatementBtn();
        communityPage.CheckEmailAttribute();
        communityPage.CheckPasswordAttribute();
        System.out.println("\n\nAuthorization_1 attributes are shown !!!\n\n");


    }




    //    ავტოტორიზაციის მეორე გზა: მთავარი ფეიჯიდან ვაკლიკავთ "ქომუნითი" ღილაკს რის შემდეგაც გადავდივართ ქომუნითი ფეიჯზე,
//    სხვა მომხმარებლის მიერ დადებულ პოსტზე ვაწვებით "Space" ღილაკს რის შემდეგაც გამოჩნდება ავტორიზაციის ველები, ხოლო შემდეგ ხდება
//    ასერტების საშუალებით შემოწმება, ხილვადია თუ არა იმეილის და პაროლის ველები.
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check registration By asserts way_2 ")
    public void CheckRegistration_2 () throws InterruptedException {

        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        mainPage = new MainPage(driver);
        communityPage = new CommunityPage(driver);

        communityPage.ClickLonCommunityBtn();
        communityPage.ClickLonSpaceBtn();
        communityPage.CheckEmailAttribute();
        communityPage.CheckPasswordAttribute();

        System.out.println("\n\nAuthorization_2 attributes are shown !!!\n\n");




    }





    //"სივის გაგზავნა" ღილაკზე დაჭერის შემდეგ გამოჩენილი ატრიბუტების შემოწმება
    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description("Check registration By asserts way_2 ")
    public void CheckByCVsend () throws InterruptedException {

        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);
        mainPage = new MainPage(driver);
        communityPage = new CommunityPage(driver);

        mainPage.ClickLonCVsendBtn();

        mainPage.CheckCVname();
        mainPage.CheckCVusername();
        mainPage.CheckCnNumber();
        mainPage.CheckCVemail();

        System.out.println("\n\n\"სივის გაგზავნა\" attributes are shown !!!\n\n");




    }




    }


