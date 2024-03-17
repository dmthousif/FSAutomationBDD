package starter.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
   public WebDriver driver;

    public Properties prop;

    @BeforeMethod
    public void launchDriver() {
        // Load properties before launching the driver
        //loadPropertiesFile();

        if (prop.getProperty("browser").equalsIgnoreCase("Edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--guest");
            options.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(options);
        } else if (prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--guest");
            options.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(options);
        }
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeSuite
    public void loadPropertiesFile() {  // Load properties before any tests
        prop = new Properties();
        try {
            prop.load(new FileInputStream("src/test/resources/config.properties"));
        } catch (Exception e) {
            // Handle potential exceptions gracefully
            e.printStackTrace();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }
}
