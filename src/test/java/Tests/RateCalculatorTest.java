package Tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.RateCalculator;
import UITestFramework.FrameworkTest;

public class RateCalculatorTest extends FrameworkTest {
	
	
	@Test
	public void rateCalculatorTest() 
	
	{	
		RateCalculator rateCalculator = new RateCalculator(driver);	
		
	    rateCalculator.openrateCalculatorPage(driver);
	    
	    Assert.assertTrue(driver.getCurrentUrl().contains("pos.com"),"Invalid rate calculator page loaded");
	    
	    rateCalculator.PostCodeSourceBox().sendKeys("35600");
	    
	    rateCalculator.CountrySelector().click();
	    
	    rateCalculator.SelectBelgium().click();
	    
	    rateCalculator.WeightTextBox().sendKeys("1");
	    
	    rateCalculator.CalculateButton().click();
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    
	    int NoOfQuotes = rateCalculator.QuotesAvailable().size();
	    
	    Assert.assertTrue(NoOfQuotes >0, "No of quotes are not available");
	    
	    Assert.assertTrue(rateCalculator.BookNow().size() >0, "Book now buttons are not available");
	    
	    for(int i=0;i<NoOfQuotes;i++)
	    {
	        System.out.println("TotalProducCount is "+rateCalculator.QuotesAvailable().get(i).getText());
	             
	    }
	      
    }	
	

}
