package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class OrdersSteps {

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

    @When("user clicks on Orders")
    public void user_clicks_on_orders() {

    }

    @Then("the Orders page should be displayed")
    public void the_orders_page_should_be_displayed() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Orders page URL: " + currentUrl);

        driver.quit();
    }
}