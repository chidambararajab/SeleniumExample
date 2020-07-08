package co.sirius.seleniumexample;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
		String baseUrl = "http://www.leafground.com/pages/Window.html";
		driver.get(baseUrl);
		String windowOne = driver.getWindowHandle();
		
		WebElement button = driver.findElement(By.id("home"));
		button.click();
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.switchTo().window(windowOne);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		
	}
}
