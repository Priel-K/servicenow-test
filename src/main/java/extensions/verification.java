package extensions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.commonOps;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static utilities.base.wait;

public class verification extends commonOps
{
    public static void numberOfElements(List<WebElement> elems, int expectedValue)
    {
        wait.until(ExpectedConditions.visibilityOf(elems.get(elems.size()-1)));
        assertEquals(elems.size(),expectedValue);
    }


}
