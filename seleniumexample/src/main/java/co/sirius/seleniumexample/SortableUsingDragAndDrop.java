package co.sirius.seleniumexample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableUsingDragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
		String baseUrl = "http://www.leafground.com/pages/sortable.html";
		driver.navigate().to(baseUrl);
		
		List <WebElement> allElements = driver.findElements(By.xpath(".//ul[@id='sortable']/li"));
		WebElement lastElement = allElements.get(allElements.size()-1);
		WebElement firstElement = allElements.get(0);
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(lastElement);
		actions.moveToElement(firstElement);
		actions.release(firstElement);
		actions.build().perform();
	}

}
