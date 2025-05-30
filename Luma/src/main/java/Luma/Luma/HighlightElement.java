package Luma.Luma;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightElement {




    public static void highlightElement(WebDriver driver, WebElement element) {

        // Cast the WebDriver to JavascriptExecutor to execute JavaScript

        JavascriptExecutor js = (JavascriptExecutor) driver;

        

        // Execute JavaScript to change the border of the element to red

        js.executeScript("arguments[0].style.border='3px solid red'", element);

    }
}



    