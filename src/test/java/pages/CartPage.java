package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    public CartPage() {
        super();
    }

    @FindBy (xpath = "//input[@value='Sil']")
    public WebElement deleteButton;

    @FindBy (xpath = "//h1[normalize-space()='Amazon sepetiniz boş.']")
    public WebElement emptyCartMessage;

}