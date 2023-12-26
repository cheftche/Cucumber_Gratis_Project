package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CategoryPage;
import pages.HomePage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

import static utilities.BrowserUtilities.*;
import static utilities.Driver.driver;
import static utilities.ReusableMethods.selectRandomEntryFromList;


public class CommonStepDefinitions {
    HomePage gratis_Home = new HomePage();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @Given("Kullanici Gratis anasayfasina gider")
    public void kullanici_gratis_anasayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("gratisUrl"));
        waitFor(2);
        Driver.getDriver().switchTo().alert().dismiss();
    }
    @Then("Akilli siralama ile siralar")
    public void akilli_siralama_ile_siralar() {
        waitForVisibility(gratis_Home.akilliSiralamaDropdown,30).click();
        List<WebElement> akilliSiralaList = driver.findElements(By.xpath("//span[@class=\"ng-option-label ng-star-inserted\"]"));
        clickWithJS(selectRandomEntryFromList(akilliSiralaList));
    }




    }



