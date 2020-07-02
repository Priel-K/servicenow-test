package sanityTest;

import extensions.verification;
import org.testng.annotations.Test;
import utilities.commonOps;
import workFlows.webflows;

public class test extends commonOps
{
    @Test
    public void test01_login()
    {
        webflows.login("viewer", "demo", "AStrip01");
    }


    @Test
    public void test02_search()
    {
        webflows.ok("purchas");
        verification.numberOfElements(EventPageService.rows, 2);
    }




}
