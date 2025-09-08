package stepdefinitions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pages {
    WebDriver driver;
    WebDriverWait wait;
    public Pages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //  Login
    By signInBtn = By.id("signin");
    By usernameDropdown = By.id("username");
    By usernameOption = By.xpath("//div[text()='demouser']");
    By passwordDropdown = By.id("password");
    By passwordOption = By.xpath("//div[text()='testingisfun99']");
    By loginBtn = By.id("login-btn");
    By profileName = By.cssSelector("span.username");

    //  Add to Cart
    By addToCartBtn = By.xpath("//*[@id=\"1\"]/div[4]");
    By removeFromCartBtn = By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div[1]");

    //  Offers
    By offersLink = By.partialLinkText("Offers");

    //  Orders
    By ordersLink = By.partialLinkText("Orders");

    //  Search
    By searchBox = By.cssSelector("input[placeholder=\"Search\"]");
    By searchSubmitBtn = By.cssSelector("button[class=\"px-4 py-1 bg-gray-100 border border-l-0 border-gray-300\"]");
    //  Favourites
    By favouritesBtn = By.id("favourites");

    //  Checkout Page
    By checkoutBuyBtn = By.cssSelector("div[class=\"buy-btn\"]");
    By firstNameField = By.id("firstNameInput");
    By lastNameField = By.id("lastNameInput");
    By addressField = By.id("addressLine1Input");
    By stateField = By.id("provinceInput");
    By postalCodeField = By.id("postCodeInput");
    By continueShippingBtn = By.id("checkout-shipping-continue");
    By paymentContinueBtn = By.cssSelector("button[class=\"button button--tertiary optimizedCheckout-buttonSecondary\"]");

    //  Logout
    By logoutBtn = By.id("signin");
    //  Login Actions
    public void login() {
        driver.findElement(signInBtn).click();
        driver.findElement(usernameDropdown).click();
        driver.findElement(usernameOption).click();
        driver.findElement(passwordDropdown).click();
        driver.findElement(passwordOption).click();
        driver.findElement(loginBtn).click();
    }

    public String getLoggedInUser() {
        return driver.findElement(profileName).getText();
    }

    //  Add to Cart
    public void addToCart() throws InterruptedException {
        driver.findElement(addToCartBtn).click();
        Thread.sleep(2000);
    }

    public void removeFromCart() {
        driver.findElement(removeFromCartBtn).click();
    }

    //  Offers
    public void clickOffers() {
        driver.findElement(offersLink).click();
    }

    //  Orders
    public void clickOrders() {
        driver.findElement(ordersLink).click();
    }

    //  Search
    public void searchProduct(String product) {
        WebElement search = driver.findElement(searchBox);
        search.clear();
        search.sendKeys(product);
        search.sendKeys(Keys.ENTER);
        driver.findElement(searchSubmitBtn).click();
    }
    //  Favourites
    public void openFavourites() {
        driver.findElement(favouritesBtn).click();
    }

    // Checkout
    public void checkout() {
        driver.findElement(addToCartBtn).click();
        driver.findElement(checkoutBuyBtn).click();

        driver.findElement(firstNameField).sendKeys("Medabayani");
        driver.findElement(lastNameField).sendKeys("Monalisa");
        driver.findElement(addressField).sendKeys("srikakulam");
        driver.findElement(stateField).sendKeys("Andhra Pradesh");
        driver.findElement(postalCodeField).sendKeys("532001");

        driver.findElement(continueShippingBtn).click();
        driver.findElement(paymentContinueBtn).click();
    }

    // Logout
    public void logout() {
        driver.findElement(logoutBtn).click();
    }
}
