package co.sirius.seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
		String baseUrl = "http://www.leafground.com/pages/Calendar.html";
		driver.navigate().to(baseUrl);
		
		WebElement calenderTextBox = driver.findElement(By.id("datepicker"));
		
		// One Way
		calenderTextBox.sendKeys("08/04/2020" +Keys.RETURN);
		
		// Second Way
//		calenderTextBox.click();
//		Thread.sleep(1000);
//		WebElement arrow = driver.findElement(By.xpath(".//span[text()='Next']"));
//		arrow.click();
//		
//		WebElement arrow1 = driver.findElement(By.xpath(".//span[text()='Next']"));
//		Thread.sleep(1000);
//		arrow1.click();
//		
//		Thread.sleep(3000);
//		WebElement date = driver.findElement(By.xpath(".//a[text()='4']"));
//		date.click();
		
	}
}
