package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.StoresPage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Random;

public class US_04_StoresLinkActive {

    HomePage gratis = new HomePage();
    StoresPage storesPage = new StoresPage();
    Actions actions = new Actions(Driver.getDriver());

    @And("Kullanici magazalarimiz butonuna tiklar")
    public void kullaniciMagazalarimizButonunaTiklar() {
        gratis.magazalarimizButton.click();
    }

    @And("Kullanici bir sehir ismini arama kutucuguna yazar")
    public void kullaniciBirSehirIsminiAramaKutucugunaYazar() {
        storesPage.storesSearchButton.click();
        storesPage.storesSearchButton.sendKeys("Bursa");
    }

    @And("Kullanici buyutec simgesine tiklar")
    public void kullaniciBuyutecSimgesineTiklar() {
        storesPage.storesSearch.click();
    }

    @And("Kullanici sayfayi asagi kaydirir")
    public void kullaniciSayfayiAsagiKaydirir() {
        ReusableMethods.scrollIntoView2(storesPage.maps);
    }

    @And("Kullanici bir magazanin ustune tiklar")
    public void kullaniciBirMagazaninUstuneTiklar() {
        storesPage.mapExample.click();
    }

    @Then("Kullanici magaza bilgilerini gorur")
    public void kullaniciMagazaBilgileriniGorur() throws IOException {
        ReusableMethods.getScreenshot("mapExampleIsVisible");
    }

    @And("Kullanici magazalarimiz butonunun altindaki {string}a tiklar")
    public void kullaniciMagazalarimizButonununAltindakiATiklar(String arg0) {
        storesPage.useMyLocation.click();
    }

    @Then("Kullanici bulunulan konumdaki magazalari gorur")
    public void kullaniciBulunulanKonumdakiMagazalariGorur() {
        storesPage.storeLocator.isDisplayed();
    }

    @And("Kullanici bir sehrin ustune tiklar")
    public void kullaniciBirSehrinUstuneTiklar() {
        storesPage.cityName.click();
    }

    @And("Kullanici secilen sehrin bir ilcesine tiklar")
    public void kullaniciSecilenSehrinBirIlcesineTiklar() {
        ReusableMethods.scrollIntoView2(storesPage.miniCityName);
    }

    @Then("Kullanici sectigi magazanin adresini ve konumunu gorur")
    public void kullaniciSectigiMagazaninAdresiniVeKonumunuGorur() {
        ReusableMethods.scrollIntoView2(storesPage.storeAdress);
        storesPage.storeAdress.isDisplayed();
    }


}
