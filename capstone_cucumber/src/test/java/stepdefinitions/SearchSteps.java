package stepdefinitions;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSteps {
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

    @When("user searches for a product")
    public void user_searches_for_a_product() {

    }

    @Then("search results should be displayed")
    public void search_results_should_be_displayed() {
        String pageSource = driver.getPageSource();
        assertTrue("Search results not found", pageSource.contains("iphone12"));
        driver.quit();
    }
}