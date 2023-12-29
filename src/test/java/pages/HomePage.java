package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {
    public HomePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href= \"/login\"])[3]")
    public WebElement GirisYap;  // Sayfanın altındaki
    @FindBy(xpath = "//input[@type= \"text\"]")
    public WebElement emailBox; // Sayfanın altındaki
    @FindBy(xpath = "//button[@class= \"round-btns\"]")
    public WebElement submitButton; // Sayfanın altındaki
    @FindBy(xpath = "//input[@type= \"password\"]")
    public WebElement passwordBox;  // Sayfanın altındaki
    @FindBy(xpath = "//span[@class=\"ng-arrow-wrapper\"]")
    public WebElement akilliSiralamaDropdown;

    @FindBy(xpath = "(//*[@href='/magazalarimiz'])[1]")
    public WebElement magazalarimizButton;


}
