package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Setup.TestRule;

public class seleniumUtils {
	public static WebDriver driver;
	
	public seleniumUtils() {
		driver = TestRule.getDriver();
	}
	public void esperaElemento(WebElement elemento) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
	}
}
