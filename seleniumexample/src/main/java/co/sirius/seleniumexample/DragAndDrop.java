package co.sirius.seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
		String baseUrl = "http://www.leafground.com/pages/drop.html";
		driver.get(baseUrl);
		
		WebElement box = driver.findElement(By.id("draggable"));
		WebElement dropHere = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		action.clickAndHold(box).moveToElement(dropHere).release(dropHere).build().perform();
		Thread.sleep(3000);
	}

}
