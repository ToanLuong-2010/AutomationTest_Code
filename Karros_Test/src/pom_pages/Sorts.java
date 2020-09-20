package pom_pages;

import java.util.concurrent.TimeUnit;


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


