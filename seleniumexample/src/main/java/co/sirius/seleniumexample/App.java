package co.sirius.seleniumexample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 */
public class App 
{
	public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","/Users/chidambararaja.boomi/Downloads/Random/chromedriver");
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.get("http://zero.webappsecurity.com/");
    	
    	// implisit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
    	WebElement signInPageButton = driver.findElement(By.id("signin_button"));
    	signInPageButton.click();

    	WebElement userName = driver.findElement(By.id("user_login"));
    	userName.sendKeys("username");

    	WebElement userPassword = driver.findElement(By.id("user_password"));
		userPassword.sendKeys("password");

    	WebElement signinButton = driver.findElement(By.xpath(".//input[@name='submit']"));
    	signinButton.click();
    	
    	// Explicit Wait
		WebElement accountActivity = driver.findElement(By.xpath(".//li[@id='account_activity_tab']/a"));
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(accountActivity));
		accountActivity.click();

		WebElement accountDropDown = driver.findElement(By.id("aa_accountId"));
		accountDropDown.click();
		
		WebElement dropDownChecking = driver.findElement(By.xpath(".//select[@id='aa_accountId']/option[@value='2']"));
		dropDownChecking.click();
		accountDropDown.click();
		
		WebElement dropDownSavings = driver.findElement(By.xpath(".//select[@id='aa_accountId']/option[@value='3']"));
		dropDownSavings.click();
		accountDropDown.click();
		
		WebElement dropDownLoan = driver.findElement(By.xpath(".//select[@id='aa_accountId']/option[@value='4']"));
		dropDownLoan.click();
		accountDropDown.click();
		
		WebElement dropDownCreditCard = driver.findElement(By.xpath(".//select[@id='aa_accountId']/option[@value='5']"));
		dropDownCreditCard.click();
		accountDropDown.click();
		
		WebElement dropDownBrokerage = driver.findElement(By.xpath(".//select[@id='aa_accountId']/option[@value='6']"));
		dropDownBrokerage.click();
		
		WebElement findTransaction = driver.findElement(By.xpath(".//li[@class='ui-state-default ui-corner-top']"));

		Actions act = new Actions(driver);
		act.moveToElement(findTransaction).contextClick().build().perform();
		Thread.sleep(3000);
		act.sendKeys(findTransaction,Keys.ARROW_RIGHT).build().perform();
		Thread.sleep(3000);
//		.sendKeys(Keys.ARROW_DOWN, Keys.RETURN).build().perform(); // click on new tab
		
		WebElement descriptionFindTransaction = driver.findElement(By.id("aa_description"));
		descriptionFindTransaction.sendKeys("OFFICE SUPPLY");
		
		WebElement fromDatesFindTransaction = driver.findElement(By.id("aa_fromDate"));
		fromDatesFindTransaction.sendKeys("2012-09-01");
		
		WebElement toDateFindTransaction = driver.findElement(By.id("aa_toDate"));
		toDateFindTransaction.sendKeys("2012-09-06");
		
		WebElement fromAmountFindTransaction = driver.findElement(By.id("aa_fromAmount"));
		fromAmountFindTransaction.sendKeys("25");
		
		WebElement toAmountFindTransaction = driver.findElement(By.id("aa_toAmount"));
		toAmountFindTransaction.sendKeys("2000");
		
		WebElement typeFindTransaction = driver.findElement(By.id("aa_type"));
		typeFindTransaction.click();
		
		WebElement typeWithDrawalFindTransaction = driver.findElement(By.xpath(".//select[@id='aa_type']/option[@value='WITHDRAWAL']"));
		typeWithDrawalFindTransaction.click();
		
		WebElement findButtonFindTransaction = driver.findElement(By.xpath(".//button[@class='btn btn-primary']"));
		findButtonFindTransaction.click();
		
		// Switch To Main Tab.
//		driver.switchTo().window(windowOne);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		System.out.println("Sucessfully Run The Code!..");
    	
    }
}
// Now
//String windowOne = driver.getWindowHandle();
////driver.switchTo().newWindow(WindowType.TAB);
//Actions act = new Actions(driver);
//WebElement linkpath = driver.findElement(By.xpath("//*[@id='tabs']/ul/li[2]/a"));
//act.contextClick(linkpath).sendKeys("Open Link in New Tab").perform();  // right click
//
//Thread.sleep(3000);

//act.sendKeys("T" + Keys.ARROW_LEFT, Keys.ENTER).perform(); // click on new tab
//String findTransaction = driver.findElement(By.xpath(".//li[@class='ui-state-default ui-corner-top']")).ge;
//
//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//driver.findElement(By.xpath(".//li[@class='ui-state-default ui-corner-top']")).sendKeys(selectLinkOpeninNewTab);
//driver.get(findTransaction);
//act.contextClick(findTransaction).sendKeys(Keys.ARROW_RIGHT,Keys.RETURN);

//findTransaction.sendKeys(Keys.chord(Keys.COMMAND,Keys.LEFT_SHIFT+"t"));






// Today

//String findTransaction = driver.findElement(By.xpath(".//li[@class='ui-state-default ui-corner-top']")).getAttribute("href");
//
//String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
//driver.findElement(By.xpath(".//li[@class='ui-state-default ui-corner-top']")).sendKeys(selectLinkOpeninNewTab);
//driver.get(findTransaction);

//Actions act = new Actions(driver);
//WebElement linkpath = driver.findElement(By.xpath("//*[@id='tabs']/ul/li[2]/a"));
//act.contextClick(linkpath).perform();  // right click
//act.sendKeys("T").perform(); // click on new tab

//String selectLinkOpeninNewTab = Keys.chord(Keys.COMMAND,Keys.RETURN); 
//driver.findElement(By.xpath("//*[@id='tabs']/ul/li[2]/a")).sendKeys(selectLinkOpeninNewTab);

//System.out.println("up");
//driver.findElement(By.cssSelector("body")).sendKeys(Keys.COMMAND + "t");
//System.out.println("middle");
//ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
//System.out.println("down2");
//driver.switchTo().window(tabs.get(1)); // this Line doesn't works, switches to new tab
//System.out.println("down3");
//driver.get("https://www.facebook.com");
//System.out.println("down4");