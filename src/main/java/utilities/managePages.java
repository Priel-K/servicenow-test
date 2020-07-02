package utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends base
{
    public static void init()
    {
        logInService= PageFactory.initElements(driver, pageObject.test.logInPage.class);
        MainPageServer= PageFactory.initElements(driver, pageObject.test.mainPage.class);
        EventPageService = PageFactory.initElements(driver, pageObject.test.eventPage.class);







    }
}
