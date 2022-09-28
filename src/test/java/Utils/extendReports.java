package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extendReports {
	static ExtentReports extent;
	@BeforeTest
	public static  ExtentReports config()
	{
		//ExtendReports, extendSparkReporter
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Automation result");    //for report button
		report.config().setDocumentTitle("Test Results");  //title of document
		 extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Test");
		return extent;
		
	}
	
	
//	@Test
//	public void initDemo()
//	{
//		
//	ExtentTest test =	extent.createTest("Initial Demo");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Test\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.vtestcorp.com/");
//		
//		System.out.println(driver.getTitle());
//		//test.addScreenCaptureFromBase64String(null);    //for failed test case screen shot
//		driver.close();
//	//	test.fail("Result do not match");
//		
//		extent.flush();   //to complete the execution of the test
//		
//	}
}
