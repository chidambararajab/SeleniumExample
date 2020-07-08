package co.sirius.seleniumexample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
		String baseUrl = "http://www.leafground.com/pages/autoComplete.html";
		driver.get(baseUrl);
		
		// AutoCompletion Box
		WebElement box = driver.findElement(By.id("tags"));
		box.sendKeys("s");
		Thread.sleep(3000);
		List<WebElement> optionElements = driver.findElements(By.xpath(".//ul[@id='ui-id-1']/li"));
		for (WebElement webElement : optionElements) {
			if(webElement.getText().equals("Rest API")) {
				webElement.click();
				break;
			}
		}
		
	}
}
