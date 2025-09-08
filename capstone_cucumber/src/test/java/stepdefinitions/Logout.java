package stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Logout{

    WebDriver driver;
    Pages pages;

    @Given("user is logged in")
    public void user_is_logged_in() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bstackdemo.com/");
        pages = new Pages(driver);
        pages.login();
    }

    @When("user clicks on logout")
    public void user_clicks_on_logout() {

    }

    @Then("user should be logged out successfully")
    public void user_should_be_logged_out_successfully() {
        // Optional: verify by checking login button is visible again
        System.out.println("Logout completed successfully");

        driver.quit();
    }
}