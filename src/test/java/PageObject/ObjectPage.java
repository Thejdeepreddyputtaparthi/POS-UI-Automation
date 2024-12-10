package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ObjectPage {

	WebDriver driver;
	public ObjectPage(WebDriver webdriver)
	{
		this.driver=(WebDriver) webdriver;
		PageFactory.initElements(webdriver,this);

	}
}
