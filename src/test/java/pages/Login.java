package pages;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.*;


public class Login {

    private By uNameLoc = By.name("userName");
    private By pWordLoc = By.name("password");
    private By loginButton = By.name("login");

    public Login(){
        open("http://newtours.demoaut.com/mercurysignon.php");
    }

    public void with(String username, String password){
        $(uNameLoc).val(username);
        $(pWordLoc).val(password);
        $(loginButton).click();
    }


}
