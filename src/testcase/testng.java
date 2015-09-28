package testcase;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class testng{
	@BeforeClass(alwaysRun = true)
	public void setup(){
		USERNAME = "minhqa";
		ACCESS_KEY = "fbfbb9a7-f698-4210-b246-c2305fb9bcec";
		URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
		DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 7");
	    caps.setCapability("version", "43.0");
        caps.setCapability("name", "Web Driver demo Test");
	    try {
			driver = new RemoteWebDriver(new URL(URL), caps);
			 driver.get("https://translate.google.com");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test(description = "Verify Resources Recommendations displays on Goals page")
	public void test() {
		
		    System.out.println("title of page is: " + driver.getTitle());
	}
	
	@AfterClass(alwaysRun = true)
	public void tearDown() {	
		  driver.quit();
	}
	public WebDriver driver;
	public String USERNAME;
	public String ACCESS_KEY;
	public String URL;

}
