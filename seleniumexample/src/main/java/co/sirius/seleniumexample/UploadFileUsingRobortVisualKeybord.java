package co.sirius.seleniumexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import javax.swing.text.StringContent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UploadFileUsingRobortVisualKeybord {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
		String baseUrl = "http://www.leafground.com/pages/upload.html";
		driver.get(baseUrl);
		Thread.sleep(2000);
		WebElement uploadButton = driver.findElement(By.name("filename"));
		
		// One Way (Normal Way)
		uploadButton.sendKeys("/Users/chidambararaja.boomi/Downloads/testleaf.xlsx");
		Thread.sleep(3000);
		String expected = "/Users/chidambararaja.boomi/Downloads/testleaf.xlsx";
		Assert.assertEquals(, expected);
		
		// Second Way Not Working
//		uploadButton.click();
//		String directory = "/Users/chidambararaja.boomi/Downloads/testleaf.xlsx";
//		StringSelection directoryFile = new StringSelection(directory);
//		Toolkit.getDefaultToolkit().getSystemClipboard().getContents(directoryFile);
//		
//		Robot robort = new Robot();
//		robort.keyPress(KeyEvent.VK_PASTE);
//		robort.keyRelease(KeyEvent.VK_PASTE);
//		robort.keyPress(KeyEvent.VK_ENTER);
//		robort.keyRelease(KeyEvent.VK_ENTER);
	}
}
