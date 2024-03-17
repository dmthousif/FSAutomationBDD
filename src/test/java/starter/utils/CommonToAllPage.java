package starter.utils;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import starter.common.BaseTest;

import java.time.Duration;
import java.util.List;

public class CommonToAllPage extends BaseTest {

    public WebElement findElement(By key) {
        return driver.findElement(key);
    }

    public List findElements(By key) {
        return driver.findElements(key);
    }

    public WebElement waitForVisibilityOfElement(final By element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public WebElement waitforPresenceOfElement(final By elementLocation) {
        return new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public void handleWindows() {
    }

    public void handleFrames() {
    }

    public void handleAlerts() {
    }

    public void handleActions() {
    }


}
