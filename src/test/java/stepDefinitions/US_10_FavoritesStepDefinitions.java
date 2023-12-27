package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FavoritesPage;
import pages.HomePage;

import static pages.FavoritesPage.favoriListelerimYazisi;
import static pages.FavoritesPage.favorilerimButonu;
import static utilities.BrowserUtilities.*;
import static utilities.Driver.driver;


public class US_10_FavoritesStepDefinitions {
    FavoritesPage favori = new FavoritesPage();


    @Given("kullanici Favori Listelerim sayfasina gider")
    public void kullanici_favori_listelerim_sayfasina_gider() {
       clickWithJS(waitForVisibility(favorilerimButonu,30));
       waitFor(2);
    }
    @Then("Favori Listelerim sayfasina gittigini dogrular")
    public void favori_listelerim_sayfasina_gittigini_dogrular() {
        Assert.assertTrue(waitForVisibility(favoriListelerimYazisi,30).isDisplayed());
    }



    }


