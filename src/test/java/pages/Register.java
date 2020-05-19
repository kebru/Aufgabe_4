package pages;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.*;


public class Register {

    private By uNameLoc = By.name("email");
    private By pWordLoc = By.name("password");
    private By pWordLoc2 = By.name("confirmPassword");
    private By registerButton = By.name("register");
    private By successMsg = By.cssSelector("login");
    private By failedMsg = By.cssSelector(".flash.error");
    public String uName;
    public String pass;

    public Register(){
        open("http://newtours.demoaut.com/mercuryregister.php");
    }

    public void with(String username, String password){
        this.uName = username;
        this.pass = password;
        $(uNameLoc).val(username);
        $(pWordLoc).val(password);
        $(pWordLoc2).val(password);
        $(registerButton).click();
    }

    public void invalidRegister(String username, String password, String password2){
        String urlInit = getWebDriver().getCurrentUrl();
        $(uNameLoc).val(username);
        $(pWordLoc).val(password);
        $(pWordLoc2).val(password2);
        $(registerButton).click();
        String urlEnd = getWebDriver().getCurrentUrl();
        Assert.assertEquals(urlInit , urlEnd);
    }
}
