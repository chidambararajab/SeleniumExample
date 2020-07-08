package co.sirius.seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageFind {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
		String baseUrl = "http://www.leafground.com/pages/Image.html";
		driver.get(baseUrl);
		
		WebElement brokenIMG = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"));
		
		if(brokenIMG.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image Is Broken");
		}else {
			System.out.println("The Image Is Not Broken");
		}
	}

}
