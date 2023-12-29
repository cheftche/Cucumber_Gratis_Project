package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StoresPage {

    public StoresPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id='locationInput']")
    public WebElement storesSearchButton;

    @FindBy (xpath = "//*[@id='//*[@id='searchLocation']']")
    public WebElement storesSearch;

    @FindBy (xpath = "//*[@id='harita']")
    public WebElement maps;

    @FindBy (xpath = "//*[@role='dialog']")
    public WebElement mapExample;

    @FindBy (xpath = "//*[@class='use-my-location']")
    public WebElement useMyLocation;

    @FindBy (xpath = "//*[@class = 'g-store-locator ng-star-inserted']")
    public WebElement storeLocator;

    @FindBy (xpath = "(//*[@class = 'city-name'])[21]")
    public WebElement cityName;

    @FindBy (xpath = "(//*[@class = 'city-name'])[7]")
    public WebElement miniCityName;

    @FindBy (xpath = "(//*[@class = 'col-xs-12 store-info'])[2]")
    public WebElement storeAdress;


}
