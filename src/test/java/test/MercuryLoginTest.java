package test;

import org.junit.BeforeClass;
import org.junit.Test;
import pages.Login;
import org.junit.Before;
import pages.Register;
import pages.Reservation;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class MercuryLoginTest {

    MercuryRegisterTest registerTest;
    Login login;
    Reservation reservation;

    @Before
    public void setup(){
        this.registerTest = new MercuryRegisterTest();
        this.registerTest.setup();
        this.login = new Login();
    }

    @Test
    public void logIn(){
        this.login.with("prinzpoupou", "asweißich123");
        this.reservation = new Reservation();
        this.reservation.assertLoggedin();
    }
}
