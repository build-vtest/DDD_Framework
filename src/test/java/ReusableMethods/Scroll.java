package ReusableMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll {
	public void scrollUp(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}

	/**
	 * This method is used to scroll down the page
	 * 
	 * @param driver
	 * @throws InterruptedException
	 */

	public void scrolldown(WebDriver driver) throws InterruptedException {

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}


}
