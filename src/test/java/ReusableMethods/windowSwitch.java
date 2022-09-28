package ReusableMethods;

import org.openqa.selenium.WebDriver;

public class windowSwitch {
	WebDriver driver;
	String primaryWindowHandle;


	public void switchToNewFrame() {
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

	public void closeCurrentWindowAndSwitchToPrimaryFrame() {
		driver.close();
		driver.switchTo().window(primaryWindowHandle);
	}

	public void switchToParentFrame() {
		driver.switchTo().window(primaryWindowHandle);
	}


}
