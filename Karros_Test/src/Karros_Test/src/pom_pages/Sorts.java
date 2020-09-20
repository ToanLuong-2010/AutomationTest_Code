package pom_pages;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import tools.selenium.Selenium;


public class Login extends CommonPage {
	private WebDriver driver;
	public login (WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(
				FrameworkConfig.getInstance().getProperty("test.configuration.loadingTimepout")),TimeUnit.SECONDS);
		}
	private static final By FIRST_NAME_SORT = By.xpath("//th[contains(text(),'First Name')]");
	private static final By FIRST_NAME_SORT_ICON = By.xpath("//span[@class='order dropup']");
	
	 
	
	public static void click_request_status() throws Exception {
		logger.info("Click on sort icon next to the title name of the column");
		driver.findElement(FIRST_NAME_SORT_ICON).click();
	}
	
	public static void click_request_status() throws Exception {
		logger.info("Click on the name of the column");
		driver.findElement(FIRST_NAME_SORT).click();
	}
	
	
	
	
	
	
	}


