package starter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import starter.utils.CommonToAllPage;

public class loginPage extends CommonToAllPage {

    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "username")
    private WebElement userName;

    public WebElement getUserName() {
        return userName;
    }

    @FindBy(name = "password")
    private WebElement passWord;

    public WebElement getPassWord() {
        return passWord;
    }



    @FindBy(xpath = "//*[@name='password']/following::div[1]")
    private WebElement loginBtn;

    public WebElement getLoginButton() {
        return loginBtn;
    }
}
