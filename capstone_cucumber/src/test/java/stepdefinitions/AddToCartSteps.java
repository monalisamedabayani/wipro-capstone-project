package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AddToCartSteps {
    WebDriver driver;
    Pages pages;
     @Given("user is on the home page")
     public void user_is_on_home_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/");
        pages = new Pages(driver);
    }

    @When("user adds a product to the cart")
    public void user_adds_a_product_to_the_cart() throws InterruptedException {
        pages.addToCart();
    }

    @Then("product should be visible in the cart")
    public void product_should_be_visible_in_the_cart() {
        driver.quit();
    }
}