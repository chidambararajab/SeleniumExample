package co.sirius.seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/pages/frame.html");

		driver.switchTo().frame(driver.findElement(By.xpath(".//iframe[@src='default.html']")));
		
		WebElement clickButton = driver.findElement(By.id("Click"));
		clickButton.click();
		
		String text = clickButton.getText();
		System.out.println(text);
		driver.quit();
	}
}
