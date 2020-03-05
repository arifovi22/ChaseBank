package allPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Generic {
	WebDriver driver;

	//driver initialization
	public void getDriver(String driverValue) {
		if (driverValue.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Arif\\eclipse project\\CapitalOne\\Browser\\chromedriver.exe");
			driver = new ChromeDriver();		
		} else if (driverValue.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\Arif\\eclipse project\\CapitalOne\\Browser\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	}
	



	//get the url
	public void getUrl(String url) {
		driver.get(url);
	}

	//finding the element
	public WebElement findElement(String element) {
		WebElement eWebElement = null;
		
		if (element.contains("Id")) {
			eWebElement= driver.findElement(By.id(element.split(":")[1]));		
		}else if (element.contains("xpath")) {
			eWebElement=	driver.findElement(By.xpath(element.split(":")[1]));
		}else if (element.contains("className")) {
			eWebElement=	driver.findElement(By.className(element.split(":")[1]));
		}else if (element.contains("cssSelector")) {
			eWebElement= driver.findElement(By.cssSelector(element.split(":")[1]));
		}else if (element.contains("tagName")) {
			eWebElement=	driver.findElement(By.tagName(element.split(":")[1]));
		}else if (element.contains("partialLinkText")) {
			eWebElement=	driver.findElement(By.partialLinkText(element.split(":")[1]));
		}else if (element.contains("linkText")) {
			eWebElement=	driver.findElement(By.linkText(element.split(":")[1]));
		}else if (element.contains("name")) {
			eWebElement=	driver.findElement(By.name(element.split(":")[1]));
		}
		return eWebElement;
	}
	
	//closing the driver
	public void tearDown() {
		driver.close();
	}
	
	public void mouseHover(String element) {
		
		Actions actions = new Actions(driver);

		
		if (element.contains("Id")) {
			actions.moveToElement(driver.findElement(By.id(element.split(":")[1]))).build().perform();	
		}else if (element.contains("xpath")) {
			actions.moveToElement(driver.findElement(By.xpath(element.split(":")[1]))).build().perform();	
		}else if (element.contains("className")) {
			actions.moveToElement(driver.findElement(By.className(element.split(":")[1]))).build().perform();	
		}else if (element.contains("cssSelector")) {
			actions.moveToElement(driver.findElement(By.cssSelector(element.split(":")[1]))).build().perform();	
		}else if (element.contains("tagName")) {
			actions.moveToElement(driver.findElement(By.tagName(element.split(":")[1]))).build().perform();	
		}else if (element.contains("partialLinkText")) {
			actions.moveToElement(driver.findElement(By.partialLinkText(element.split(":")[1]))).build().perform();	
		}else if (element.contains("linkText")) {
			actions.moveToElement(driver.findElement(By.linkText(element.split(":")[1]))).build().perform();	
		}else if (element.contains("name")) {
			actions.moveToElement(driver.findElement(By.name(element.split(":")[1]))).build().perform();	
		}
		
	}
	
	



}
