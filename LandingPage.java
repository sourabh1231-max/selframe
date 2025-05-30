package landingPage.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sourabh.abtract.abstracts;

public class LandingPage extends abstracts {
 
	WebDriver driver;
	
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		//initilization 
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//WebElement UserEmail=driver.findElement(By.id("userEmail"));
			
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    WebElement Click;		

	
    @FindBy(id="email")	
    WebElement userEmail;
			
    
    @FindBy(name="login[password]")	
    WebElement passwordeve;
   
    @FindBy(xpath="(//*[@id='send2']/span)[1]")
    WebElement submit;		

public void click ()
{
	Click.click();

}

public void loginApplication(String email, String Password)

{
	userEmail.sendKeys(email);
	passwordeve.sendKeys(Password);
	submit.click();
	
}


public void Goto()
{
	driver.get("https://magento.softwaretestingboard.com/?ref=hackernoon.com");	
}
}





































