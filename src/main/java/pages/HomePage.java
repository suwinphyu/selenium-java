package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
   // private By formAuthenticationLink = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public LoginPage clickFormAuthentication(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    public ForgetPasswordPage clickForgetPassword(){
        clickLink("Forgot Password");
        return new ForgetPasswordPage(driver);
    }


}
