package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.Baseclass;

public class Hooksc extends Baseclass {
	@Before
	public void launch_brow() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@After
	public void takedown() {
		driver.close();
	}
	
	//screenshot to take if a step is failed
	
	@AfterStep
	public void take_Screenshot_for_failure(Scenario s) {
		if(s.isFailed()) {
			  final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		      s.attach(screenshot, "image/png", s.getName()); 
			
		}
	
	}
	
	//to take screenshots for every passed step
	
//	@AfterStep
//	public void take_Screenshot_for_failure(Scenario s) {
//		
//			  final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//		      s.attach(screenshot, "image/png", s.getName()); 
//			
//		
//
//}
}
