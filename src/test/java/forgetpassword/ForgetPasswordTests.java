package forgetpassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgetPasswordTests extends BaseTests {

    @Test
    public void testRetrievePassword(){
        var forgetPassword = homePage.clickForgetPassword();
        var emailSentPage = forgetPassword.ForgetPassword("swp@yopmail.com");
        assertEquals(emailSentPage.getMessage(),"Your e-mail's been sent!","email sent message is incorrect");
    }
}
