package test;

import org.junit.BeforeClass;
import org.junit.Test;
import pages.*;
import org.junit.Before;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class BookingTest {

    MercuryRegisterTest registerTest;
    Login login;
    Reservation reserv;
    Flights flights;
    Book book;

    @Before
    public void setup(){
        this.login = new Login();
        this.login.with("prinzpoupou", "asweißich123");
        this.reserv = new Reservation();
    }

    @Test
    public void assertDatumHinflug(){
        this.reserv.fillOutForm();
        this.flights = new Flights();
        this.flights.assertDatum();
    }

    @Test
    public void assertHinUndHer(){
        this.reserv.fillOutForm();
        this.flights = new Flights();
        this.flights.weiter();
        this.book = new Book();
        this.book.assertHinUndHer();
    }
}
