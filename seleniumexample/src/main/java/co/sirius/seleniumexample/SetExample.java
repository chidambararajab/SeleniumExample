package co.sirius.seleniumexample;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();

		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";

		driver.get(baseUrl);
	
		String actualTitle = driver.getTitle();
		Set<String> set = driver.getWindowHandles();
		
		System.out.println(set);
		
//		Actions a = new Actions(driver);
//		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		WebElement b = driver.findElement(By.xpath(".//a[@href='http://demo.guru99.com/Agile_Project/Agi_V1/']"));
//		a.contextClick(b).sendKeys(selectLinkOpeninNewTab);
//		driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/");
//		driver.switchTo().defaultContent();

		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

		driver.close();

	}

}
