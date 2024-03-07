package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.Baseclass;


public class Loginstepdef extends Baseclass {
	
	
//	
//	@Before
//	public void launch_brow() {
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//	}
//	@After
//	public void takedown() {
//		driver.close();
//	}
//	@AfterStep
//	public void take_Screenshot_for_failure(Scenario s) {
//		if(s.isFailed()) {
//			  final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//		      s.attach(screenshot, "image/png", s.getName()); 
//			
//		}
//	}
	

	@Given("Open browser")
	public void open_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@When("^user enter (.*) and (.*)$")
	public void user_enter_(String usnme, String pswd) {
		
		driver.findElement(By.name("username")).sendKeys(usnme);
		driver.findElement(By.name("password")).sendKeys(pswd);
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(2000);
	}

	@When("verify home page")
	public void verify_home_page() throws InterruptedException {
	driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/child::h6")).isDisplayed();
	Thread.sleep(1000);
	}

	@Then("logout")
	public void logout() {
		driver.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
		Actions ac=new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//a[text()='Logout']"))).click();
	
	}
}
