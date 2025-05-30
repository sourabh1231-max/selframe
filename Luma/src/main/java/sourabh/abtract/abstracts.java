package sourabh.abtract;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstracts {

	
	WebDriver driver;
	
	public abstracts(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		//PageFactory.initElements(driver, this);
	}

	public void waitForElementtoAppear(By findBy)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated((findBy)));
		
	}

}
