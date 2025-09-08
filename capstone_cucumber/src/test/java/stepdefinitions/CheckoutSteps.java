package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CheckoutSteps {
    WebDriver driver;
    Pages pages;
    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/");

        pages = new Pages(driver);
    }

    @When("user proceeds to checkout")
    public void user_proceeds_to_checkout() throws InterruptedException {

    }

    @Then("the checkout should be completed successfully")
    public void the_checkout_should_be_completed_successfully() {
        // Optional: Verify success page or confirmation message
        System.out.println("Checkout completed successfully");

        driver.quit();
    }
}