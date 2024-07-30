package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage() {
        super();
    }

    @FindBy (id = "sp-cc-accept")
    public WebElement acceptCookiesButton;

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy (id = "nav-search-submit-button")
    public WebElement searchButton;

}