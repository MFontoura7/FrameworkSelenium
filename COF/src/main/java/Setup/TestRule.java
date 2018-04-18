package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestRule {

	protected static WebDriver driver;
	public static Logger logger = Logger.getLogger(TestRule.class);
	
	@Before
	public void beforeCenario() {
		String pathProjeto = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", pathProjeto+"/drivers/chromedriver.exe");
		logger.info("");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static Logger Log() {
		return TestRule.logger;
	}
	
	@After
	public void afterCenario() {
		System.out.println("Finalizando estancia do chromeDriver.");
		driver.quit();
	}
}
