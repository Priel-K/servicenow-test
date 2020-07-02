package pageObject.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class logInPage
{

    @FindBy(how= How.ID, using="username")
    public WebElement txt_userName;

    @FindBy(how= How.ID, using="instance")
    public WebElement txt_instance;

    @FindBy(how= How.ID, using="password")
    public WebElement txt_password;

    @FindBy(how= How.CSS, using="button[class='btn']")
    public WebElement btn_logIn;



}
