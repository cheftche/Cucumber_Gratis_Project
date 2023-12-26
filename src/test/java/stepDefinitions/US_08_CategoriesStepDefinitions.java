package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.CategoryPage;

import static java.lang.Integer.parseInt;
import static utilities.Driver.driver;
import static utilities.JSUtils.clickElementByJS;
import static utilities.JSUtils.scrollDownByJS;
import static utilities.ReusableMethods.*;


public class US_08_CategoriesStepDefinitions {
    CategoryPage kategori = new CategoryPage();


    @Given("Herhangi bir urun kategorisi secer")
    public void herhangi_bir_urun_kategorisi_secer() {
        scrollDownByJS();
        //waitFor(3);
        //driver.switchTo().alert().accept();
        selectRandomEntryFromList(CategoryPage.urunKategorileri).click();
    }
    @Given("Sayfadaki urunlerden rastgele secer")
    public void sayfadaki_urunlerden_rastgele_secer() {
        waitFor(3);
     selectRandomEntryFromList(CategoryPage.sayfadakiUrunler);
           }
    @Then("secilen urunun stok durumunu dogrular")
    public void secilen_urunun_stok_durumunu_dogrular() {
       boolean sepeteEkle=CategoryPage.urundeSepeteEkle.isDisplayed();
       boolean stoktaYok=CategoryPage.urundeStoktaYok.isDisplayed();
        System.out.println("stoktaYok = " + stoktaYok);
        System.out.println("sepeteEkle = " + sepeteEkle);

    }

    }








