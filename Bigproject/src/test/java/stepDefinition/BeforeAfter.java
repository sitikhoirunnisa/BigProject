package stepDefinition;

import Utils.testUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import Utils.testUtils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BeforeAfter {
    public static WebDriver driver;

    @Before
    public static void openBrowser() throws InterruptedException {

        ChromeOptions chromeopt = new ChromeOptions();
        chromeopt.addArguments("--disable-extension");
        chromeopt.addArguments("--disable-popup-blocking");
        chromeopt.addArguments("--profile-directory=Default");
        chromeopt.addArguments("--ignore-certificate-errors");
        chromeopt.addArguments("--disable-plugin-discovery");
        chromeopt.addArguments("user_agent=DN");
        chromeopt.addArguments("user-data-dir=C:\\Users\\nisak\\AppData\\Local\\Google\\Chrome\\User Data");
        chromeopt.addArguments("--profile-directory=default");
        System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");


        driver = new ChromeDriver(chromeopt);
        driver.manage().window().maximize();
        driver.get("https://staging.cicle.app/");
        driver.manage().timeouts().pageLoadTimeout(testUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(testUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        Thread.sleep(5000);
        WebElement Team = driver.findElement(By.xpath("//*[contains(text(),'Big Project Nisa')]"));
        Thread.sleep(5000);
        Team.click();
    }
    @After
    public void CloseBrowser () {
        driver.quit();
    }
}
