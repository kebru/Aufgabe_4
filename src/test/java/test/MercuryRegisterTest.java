package test;

import org.junit.BeforeClass;
import org.junit.Test;
import pages.Login;
import org.junit.Before;
import pages.Register;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MercuryRegisterTest {

    Register register;

    @Before
    public void setup(){
        this.register = new Register();
    }

    @Test
    public void Registration(){
        this.register.with("prinzpoupou", "asweißich123");
        $(byText("Note: Your user name is prinzpoupou.")).shouldBe(visible);
    }

   @Test
    public void WrongRegistration(){
       this.register.invalidRegister("prinzpoupou", "asweißich123", "asdf");
    }

/*
    @Test
    public void LoginWithWrongUsername(){
        login.with("tomsmithqwqw", "SuperSecretPassword!!");
        login.assertInvalidLogin();
        login.wrongUName();
        login.with("", "SuperSecretPassword!!");
        login.assertInvalidLogin();
        login.wrongUName();
    }

    @Test
    public void LoginWithWrongPassword(){
        login.with("tomsmith", "Supeword!!");
        login.assertInvalidLogin();
        login.wrongPassword();
        login.with("tomsmith", "");
        login.assertInvalidLogin();
        login.wrongPassword();
    }*/
}
