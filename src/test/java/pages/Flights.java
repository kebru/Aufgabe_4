package pages;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.*;


public class Flights extends Reservation {

    private By registerButton = By.name("reserveFlights");
    private By datumHinflug = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/b/font");
    private Reservation reservation;


    public Flights(){
        this.reservation = new Reservation();
        this.reservation.fillOutForm();
    }

    public void assertDatum(){
        $(datumHinflug).should(text("5/20/2020"));
    }

    public void weiter(){
        $(registerButton).click();
    }
}
