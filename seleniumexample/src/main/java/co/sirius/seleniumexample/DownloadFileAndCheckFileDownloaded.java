package co.sirius.seleniumexample;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileAndCheckFileDownloaded {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
		String baseUrl = "http://www.leafground.com/pages/download.html";
		driver.get(baseUrl);
		
		WebElement downloadLink = driver.findElement(By.linkText("Download Excel"));
		downloadLink.click();
		
		Thread.sleep(3000);
		
		File file = new File("/Users/chidambararaja.boomi/Downloads");
		File[] totalFiles = file.listFiles();
		
		for (File files : totalFiles) {
			if(files.getName().equals("testleaf.xlsx")) {
				System.out.println("File Is Downloaded");
				break;
			}
		}
		
	}
}
