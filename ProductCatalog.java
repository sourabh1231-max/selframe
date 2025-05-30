package landingPage.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import sourabh.abtract.abstracts;

public class ProductCatalog extends abstracts{
 
	WebDriver driver;
	
	
	public ProductCatalog(WebDriver driver)
	{
		super(driver);
		//initialization 
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	//WebElement UserEmail=driver.findElement(By.id("userEmail"));
				

	
    @FindBy(css="#ui-id-5")	
    WebElement ele;
    
    @FindBy(css="#ui-id-18 > span:nth-child(2)")
    WebElement elem;

    @FindBy(css="#ui-id-24 > span")	
    WebElement element;

    
    public void  hover()
    {
    	System.out.print("test");
    	Actions action = new Actions(driver);
    	action.moveToElement(ele)
    	      .moveToElement(elem)
    	      .moveToElement(element)
    	      .build()
    	      .perform();
    	System.out.println("Hover method triggered");
    }
}
			
    
  