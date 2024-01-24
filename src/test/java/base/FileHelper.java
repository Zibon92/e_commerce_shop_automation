package base;

import login.LoginTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class FileHelper {
    public void setUp(){
        System.setProperty("web driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        new LoginTest().getSuccessfulLogin();



    }
    public static void main(String[] args) {
        FileHelper test = new FileHelper();
        test.setUp();
    }
}
