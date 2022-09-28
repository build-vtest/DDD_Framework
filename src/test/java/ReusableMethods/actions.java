package ReusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class actions {
	WebDriver driver;
	WebElement element;
	
	public void clickAction()
	{
		Actions action = new Actions(driver);

		action.moveToElement(element).click().perform();
	}
	
	public void DoubleclickAction()
	{
		Actions action = new Actions(driver);

		action.doubleClick(element).perform();
	}
	
	

}
