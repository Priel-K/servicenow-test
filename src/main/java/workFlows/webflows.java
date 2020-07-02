package workFlows;

import extensions.uiActions;
import org.testng.annotations.Test;
import utilities.commonOps;

import java.net.PortUnreachableException;


public class webflows extends commonOps
{
    public static void login(String user , String instance, String pass)
    {
        uiActions.updateText(logInService.txt_userName , user);
        uiActions.updateText(logInService.txt_instance, instance);
        uiActions.updateText(logInService.txt_password , pass);
        uiActions.click(logInService.btn_logIn);
    }

    public static void main(String m)
    {
        uiActions.url(m);
    }

    public static void ok(String sol)
    {
        uiActions.updateText(EventPageService.txt_search ,sol );
        uiActions.enter();
    }





}
