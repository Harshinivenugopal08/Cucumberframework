package login;

import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginpage {
   WebDriver driver;

   

    @Test
    public void details() throws InterruptedException, TimeoutException {
    	driver=new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        WebElement check = driver.findElement(By.id("terms"));
        check.click();
        WebElement signin = driver.findElement(By.id("signInBtn"));
        signin.click();
       
    }

}
