package pageObject.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage

{
    @FindBy(how= How.XPATH, using="//span[text()='Analytics']")
    public WebElement btn_Analytics;

    @FindBy(how= How.XPATH, using="//li[class='menu-sub-item'][3]")
    public WebElement btn_event;

}
