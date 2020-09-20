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

public class Filters extends CommonPage {
	private WebDriver driver;
	public login (WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(
				FrameworkConfig.getInstance().getProperty("test.configuration.loadingTimepout")),TimeUnit.SECONDS);
	}
	public static final Logger logger = LogManager.getLogger("Verify filter Student Access Request with INACTIVE");
	private static final By FILTERS_BTN = By.cssSelector(".btn-filter");
	private static final By STATUS_OPTION = By.xpath("//select[@id='formControlsSelect']");
	private static final By INACTIVE_STATUS = By.xpath("//option[contains(text(),'Inactive')]");
	private static final By APPROVED_STATUS = By.xpath("//option[contains(text(),'Approved')]");
	private static final By REJECTED_STATUS = By.xpath("//option[contains(text(),'Rejected')]");
	private static final By PENDING_STATUS = By.xpath("//option[contains(text(),'Pending')]");
	private static final By DENIED_STATUS = By.xpath("//option[contains(text(),'Denied')]");
	private static final By APPLY_BTN = By.xpath("//button[@class='btn-filter btn btn-default']");
	private static final By CANCEL_BTN = By.xpath("//button[@class='btn btn-default']");
	private static final By VERIFY_INACTIVE = By.xpath("//div/p[contains(text(), 'Inactive')]");
	private static final By VERIFY_APPROVED = By.xpath("//div/p[contains(text(), 'Approved')]");
	private static final By VERIFY_PENDING = By.xpath("//div/p[contains(text(), 'Pending')]");
	private static final By VERIFY_REJECTED = By.xpath("//div/p[contains(text(), 'Rejected')]");
	private static final By VERIFY_DENIED = By.xpath("//div/p[contains(text(), 'Denied')]");
	private static final By VERIFY_ALL_STATUS = By.xpath("//div[@class=\"ct-drop-group dropdown btn-group\"]");

public static void click_on_filters_btn(WebDriver driver) throws Exception {
	logger.info("Click on filters button");
	driver.findElement(FILTERS_BTN).click();
}

public static void click_request_status(WebDriver driver) throws Exception {
	logger.info("Click on request status to selection option");
	driver.findElement(STATUS_OPTION).click();
}

public static void selection (WebDriver driver) throws Exception {
	logger.info("Select to Inactive request status");
	driver.findElement(INACTIVE_STATUS).click();
}

public static void click_apply_btn (WebDriver driver) throws Exception {
	logger.info("Click on apply button");
	driver.findElement(APPLY_BTN).click();
}

public static void verify_inactive_status (WebDriver driver) throws Exception {
	logger.info("the selected filter is 'Inactive' and make sure the result (which is a list) contains only 'Inactive'");
	
	boolean thanINACTIVE = driver.findElements(VERIFY_ALL_STATUS).stream().filter(element -> !element.getAttribute("innerText").trim().equals("INACTIVE")).findFirst().isPresent();
    if (thanINACTIVE) {
        System.out.println("There are issues present which contains status other INACTIVE");
    } else {
        System.out.println("All issues only contains status INACTIVE");
    }
		
}
}
