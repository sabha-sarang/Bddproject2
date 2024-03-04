package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	static WebDriver driver;
	
    @Given("User is on login page")
	public void User_is_on_login_page() {
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
     }
	
	@When("User enters a valid username and password")
	public void user_enters_a_valid_username_and_password() throws InterruptedException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
	}
	
	@And("Clicks on login Button")
	public void clicks_on_login_button() throws InterruptedException {
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(3000);

	}
   
	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page()
	{
		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"user is navigated to home page");
	}
	
	@And("Close browser")
	public void close_browser()
	{
		driver.close();
	}
}




