package co.sirius.seleniumexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCheckMinValueCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
		String baseUrl = "http://www.leafground.com/pages/table.html";
		driver.navigate().to(baseUrl);
		
		List<WebElement> allProgress = driver.findElements(By.xpath(".//td[2]"));
		List<Integer> allProgressValue = new ArrayList<Integer>();
		
		for (WebElement allProgressForLoop : allProgress) {
			String indivudualElementValue = allProgressForLoop.getText().replace("%", "");
			allProgressValue.add(Integer.parseInt(indivudualElementValue));
		}
		Integer minValue = Collections.min(allProgressValue);
		System.out.println(minValue);
		
		String finalXpath = "//td[text()='"+minValue+"%']/following-sibling::td/child::input[@type='checkbox']";
		
		WebElement minValueCheckbox = driver.findElement(By.xpath(finalXpath));
		minValueCheckbox.click();
		
	}

}
