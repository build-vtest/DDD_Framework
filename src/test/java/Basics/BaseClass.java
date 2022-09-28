package Basics;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	public ExtentReports extent;

//	public void setUp() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		// driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		 driver.get("http://a.testaddressbook.com/sign_in/");


	public static final String USERNAME = "nikitagorale_dZg0EI";
	public static final String AUTOMATE_KEY = "Vg5PfoTopdzbDBzpxaGw";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub.browserstack.com/wd/hub";

	@BeforeClass
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("browserVersion", "105.0");
		caps.setCapability("os", "Windows");

		driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		driver.manage().window().maximize();
		 driver.get("http://a.testaddressbook.com/sign_in/");

	}
}

