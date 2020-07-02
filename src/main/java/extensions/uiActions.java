package extensions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.commonOps;


public class uiActions extends commonOps
{

    public static void click(WebElement elem)
    {
       // wait.until(ExpectedConditions.elementToBeClickable(elem));
        elem.click();
    }

    public static void updateText(WebElement elem,String value)
    {
        wait.until(ExpectedConditions.visibilityOf(elem));
        elem.sendKeys(value);
    }

    public static void url(String Url)
    {
        driver.get(Url);
    }

    public static void enter()
    {
        action.sendKeys(Keys.RETURN).build().perform();


    }



}
