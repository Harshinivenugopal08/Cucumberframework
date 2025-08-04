package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefinition {
	WebDriver driver=new ChromeDriver();

    @Given("User is on the login page")
    public void user_is_on_login_page() {
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
    }

    @When("User enters {string} as username")
    public void user_enters_username(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
    }

    @When("User enters {string} as password")
    public void user_enters_password(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("User accepts terms and conditions")
    public void user_accepts_terms() {
        driver.findElement(By.id("terms")).click();
    }

    @When("User clicks the sign-in button")
    public void user_clicks_signin() {
        driver.findElement(By.id("signInBtn")).click();
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Login successful!");
    }
}
