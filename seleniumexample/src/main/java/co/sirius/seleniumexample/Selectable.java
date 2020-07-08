package co.sirius.seleniumexample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
		String baseUrl = "http://www.leafground.com/pages/selectable.html";
		driver.get(baseUrl);
		
		List<WebElement> selectableElements = driver.findElements(By.xpath(".//ol/li"));
		System.out.println(selectableElements.size());
		
		Actions actions = new Actions(driver);
		// One Way: From index One(1) To Index Two(2)
		actions.clickAndHold(selectableElements.get(0));
		actions.clickAndHold(selectableElements.get(2));
		actions.build().perform();
		// One Way OR Second Way
		// Second way: Select every element
		actions.keyDown(Keys.COMMAND)
		.click(selectableElements.get(0))
		.click(selectableElements.get(1))
		.click(selectableElements.get(2))
		.build().perform();
		
//		WebElement heading = driver.findElement(By.id("text-2"));
//		actions.sendKeys(Keys.ARROW_DOWN).contextClick(heading).build().perform();
	}
}
