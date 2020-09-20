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
	
	private static final By USERNAME = By.id("formHorizontalEmail");
	private static final By PASSWORD = By.id("formHorizontalPassword");
	private static final By LOGIN_BTN = By.xpath("//a[@class='col-login__btn']");
	
	/**
	 * 
	 * @param driver
	 * @throws Exception
	 * @author Toan Luong - Sept 18, 2020
	 */

	@Override
	public boolean isHere() {
		return false;
	}
	public void login(String username, String password) {
		WebElementHelper.waitForElementVisible(USERNAME).sendkeys(username);
		WebElementHelper.waitForElementVisible(PASSWORD).sendkeys(password);
		CommonUtils.wait(seconds: 4);
		driver.findElement(LOGIN_BTN).click();
		
		
	}

}
