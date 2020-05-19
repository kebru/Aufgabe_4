package pages;

import com.codeborne.selenide.Condition;
import org.junit.Assert;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.*;


public class Book extends Flights{


    private By hinundher = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td/table/tbody/tr[1]/td[1]/b/font");
    private Flights flights;
    private By buyButton = By.tagName("buyFlights");

    public Book(){
        this.flights = new Flights();
        this.flights.weiter();
    }

    public void assertHinUndHer(){
        $(hinundher).should(text("Frankfurt to Acapulco"));
    }

}
