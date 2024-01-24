package login;

import base.FileHelper;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTest{

    public WebDriver driver;
    public void getSuccessfulLogin(){
        System.out.println("Login test call");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getAlertText();
    }

}
