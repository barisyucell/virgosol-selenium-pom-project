package tests;

import org.junit.jupiter.api.*;
import pages.ProductsPage;
import pages.CartPage;
import pages.HomePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;
import static org.junit.jupiter.api.Assertions.*;

public class AmazonTest extends BaseTest {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();
    CartPage cartPage = new CartPage();

    @Test
    public void test() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        String expectedTitle = "Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, " +
                "ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi";
        BrowserUtils.verifyTitle(expectedTitle);

        homePage.acceptCookiesButton.click();
        homePage.searchBox.sendKeys(ConfigurationReader.getProperty("productName"));
        homePage.searchButton.click();

        BrowserUtils.containsUrl(ConfigurationReader.getProperty("productName"));

        productsPage.firstProduct.click();
        productsPage.addToCartButton.click();
        productsPage.goToCartButton.click();

        cartPage.deleteButton.click();
        assertTrue(cartPage.emptyCartMessage.isDisplayed());
    }

}