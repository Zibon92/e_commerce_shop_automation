package login;

import base.FileHelper;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTest extends FileHelper {

    public void getSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
//        loginPage.setUserName("tomsmith");
//        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getAlertText();
    }

}
