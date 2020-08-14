package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By submitButton = By.id("form_submit");


    public ForgetPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSentPage clickRetrievePasswordButton(){
        driver.findElement(submitButton).click();
        return new EmailSentPage(driver);
    }

    public EmailSentPage ForgetPassword(String email){
        enterEmail(email);
        return clickRetrievePasswordButton();
    }



}
