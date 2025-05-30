package Luma.Luma;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import landingPage.pageobjects.LandingPage;
import landingPage.pageobjects.ProductCatalog;

public class copy extends HighlightElement {
	WebDriver driver;
	
		// TODO Auto-generated method stub
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		LandingPage landingpage=new LandingPage(driver);
		landingpage.Goto();
		landingpage.click();
	    landingpage.loginApplication("sourabhshrivastava569@gmail.com", "umbrella@123");
	    Thread.sleep(1000);
        ProductCatalog productctlog= new ProductCatalog(driver);
	    productctlog.hover();
	    
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ui-id-24 > span")));
    //action.moveToElement(elem).perform();
	driver.findElement(By.cssSelector("#ui-id-24 > span")).click();		
	  Thread.sleep(5000);
	
	 List<WebElement> products = driver.findElements(By.xpath("//*[@class='item product product-item']"));
     System.out.println("Total products found: " + products.size());

     for (int i = 0; i < products.size(); i++) {
         try {
             WebElement product = products.get(i);

             // Scroll product into view
             ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", product);
             Thread.sleep(1000);

             // Click product to go to product detail page
             WebElement productLink = product.findElement(By.xpath(".//a[@class='product photo product-item-photo']"));
             productLink.click();

             // Wait for color option and select
             wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'swatch-option') and contains(@class, 'text') and not(contains(@class, 'disabled'))][1]"))).click();
             wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'swatch-option') and contains(@class, 'color') and not(contains(@class, 'disabled'))][1]"))).click();
            
             Thread.sleep(3000);
             // Click Add to Cart
             wait.until(ExpectedConditions.elementToBeClickable(By.id("product-addtocart-button"))).click();

             // Wait for confirmation message or some indication it's added
             Thread.sleep(2000);

             // Navigate back to product list
             driver.navigate().back();
             Thread.sleep(2000);

             // Refresh product list after coming back
             products = driver.findElements(By.xpath("//*[@class='item product product-item']"));
         } catch (Exception e) {
             System.out.println("Error adding product at index " + i + ": " + e.getMessage());
         }
     }

     // After all products are added, go to cart
     driver.findElement(By.xpath("/html/body/div[2]/div[2]/ul/li[3]/a")).click();
     System.out.println("Navigated to Cart.");
     System.out.println("POM.");
     // Optional: Close the driver
     driver.quit();
 }
}