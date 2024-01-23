package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

public class FileHelper {
    protected HomePage homePage;
    protected LoginPage loginPage;
    protected SecureAreaPage secureAreaPage;


    public void setUp(){
        System.setProperty("web driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
        homePage.clickFormAuthentication();
        loginPage = new LoginPage(driver);
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        loginPage.clickLoginButton();
        secureAreaPage = new SecureAreaPage(driver);
        secureAreaPage.getAlertText();

        driver.quit();

    }
    public static void main(String[] args) {
        FileHelper test = new FileHelper();
        test.setUp();
    }
}
