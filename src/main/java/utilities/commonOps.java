package utilities;

import com.gargoylesoftware.htmlunit.javascript.configuration.BrowserName;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;


import java.util.concurrent.TimeUnit;

public class commonOps extends base
{


        public static void initBrowser(String browserName)
        {
            if (browserName.equalsIgnoreCase("chrome"))
                driver= initChromeDriver();
            else if (browserName.equalsIgnoreCase("fireFox"))
                driver= initFFDriver();
            else if (browserName.equalsIgnoreCase("ie"))
                driver= initIEDriver();
            else
                throw new RuntimeException("invalid platform name start");
            driver.manage().window().maximize();
          //  driver.get("http://demo.appsee.sncqe.com:5000/analytics");
            driver.get("http://demo.appsee.sncqe.com:5000/analytics/home/demo-app#/analytics/custom-events#ios/all/month");
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            wait= new WebDriverWait(driver,4);
            action= new Actions(driver);


        }

        public static WebDriver initChromeDriver()
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            return driver;
        }

        public static WebDriver initFFDriver()
        {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver= new FirefoxDriver();
            return driver;
        }

        public static WebDriver initIEDriver()
        {
            WebDriverManager.iedriver().setup();
            WebDriver driver = new InternetExplorerDriver();
            return driver;
        }






        @BeforeClass
        public void startSession()
        {
        String platform= "web";
        if (platform.equalsIgnoreCase("web"))
            initBrowser("chrome");
            //else if(platform.equalsIgnoreCase("mobile"))
            //  initMobile("mobileType");
            else
                throw new RuntimeException("invalid platform name");

            managePages.init();
        }

        @AfterClass
        public void closeSession()
        {
            driver.quit();

        }


}
