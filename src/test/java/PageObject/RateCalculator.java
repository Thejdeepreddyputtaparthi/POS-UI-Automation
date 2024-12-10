package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class RateCalculator extends ObjectPage {

	
	public RateCalculator(WebDriver webdriver)
	{
	super(webdriver);
	}	
	
	 @FindBy(xpath="//div[@class='d-flex mt-4']//input[@placeholder='Postcode']")
	 WebElement PostCodeSourceBox;
	 
	 @FindBy(xpath="//input[@id='mat-input-0']")
	 WebElement CountrySelector;
	 
	 @FindBy(id="mat-option-20")
	 WebElement SelectBelgium;
	 
	 @FindBy(xpath="//input[@placeholder='eg. 0.1kg']")
	 WebElement WeightTextBox;
	 
	 @FindBy(xpath="//a[contains(text(),'Calculate')]")
	 WebElement CalculateButton;
	 
	 @FindBy(xpath="//h1[text()=\"Your Quote\"]")
	 WebElement YourQuote;
	 
	 @FindBy(xpath="//a[contains(text(),'Book Now ')]")
	 List<WebElement> BookNow;
	 
	 @FindBy(xpath="//div[contains(@class,'border-b border-gray-300 ')]")
	 List<WebElement> QuotesAvailable;
	 
 
	public WebElement PostCodeSourceBox()
	{
		return PostCodeSourceBox;
	}
	public WebElement CountrySelector()
	{
		return CountrySelector;
	}
	public WebElement WeightTextBox()
	{
		return WeightTextBox;
	}
	
	public WebElement SelectBelgium()
	{
		return SelectBelgium;
	}
	
	public WebElement YourQuote()
	{
		return YourQuote;
	}	
	public WebElement CalculateButton()
	{
		return CalculateButton;
	}	
	public List<WebElement> BookNow()
	{
		return BookNow;
	}
	
	public List<WebElement> QuotesAvailable()
	{
		return QuotesAvailable;
	}
	
	
	public void openrateCalculatorPage(WebDriver webdriver)  {
		
	webdriver.get("https://www.pos.com.my/send/ratecalculator");	
	
	}
	
}
