package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage {

    public ProductsPage() {
        super();
    }

    @FindBy (xpath = "//div[@data-index='3']")
    public WebElement firstProduct;

    @FindBy (xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCartButton;

    @FindBy (xpath = "//span[@id='sw-gtc']//a")
    public WebElement goToCartButton;

}