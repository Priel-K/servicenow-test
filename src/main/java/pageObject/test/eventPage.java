package pageObject.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class eventPage
{
    @FindBy(how= How.ID, using="screens-name-search")
    public WebElement txt_search;


    @FindBy(how= How.XPATH, using="//div[@class='events-row-container']")
    public List<WebElement> rows;


}
