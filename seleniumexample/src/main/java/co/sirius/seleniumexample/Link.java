package co.sirius.seleniumexample;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
		String baseUrl = "http://www.leafground.com/pages/Link.html";
		driver.navigate().to(baseUrl);
		
		WebElement home = driver.findElement(By.linkText("Go to Home Page"));
		home.click();
		driver.navigate().back();
		
		WebElement whereToGo = driver.findElement(By.partialLinkText("Find where"));
		String linkGoingTo = whereToGo.getAttribute("href");
		System.out.println(linkGoingTo);
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total Links = " + Links.size());
		
		driver.quit();
	}

}
