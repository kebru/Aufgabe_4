package pages;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.*;


public class Reservation {

    private By tripType = By.name("tripType");
    private By fromDay = By.name("fromDay");
    private By fromPort = By.name("fromPort");
    private By fromMonth = By.name("fromMonth");
    private By submitButton = By.name("findFlights");
    private By textLoggedin = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font");

    public Reservation(){
        open("http://newtours.demoaut.com/mercuryreservation.php");
    }

    public void fillOutForm(){
        $(tripType).selectRadio("oneway");
        $(fromPort).selectOption("Frankfurt");
        $(fromDay).selectOption(19);
        $(fromMonth).selectOption(4);
        $(submitButton).click();
    }

    public void assertLoggedin(){
        $(textLoggedin).should(text("Use our Flight Finder to search for the lowest fare on participating airlines. Once you've booked your flight, don't forget to visit the Mercury Tours Hotel Finder to reserve lodging in your destination city."));
    }
}
