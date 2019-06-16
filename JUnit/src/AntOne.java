import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

public class AntOne {

	@Rule
	public ErrorCollector err = new ErrorCollector();

	static WebDriver driver;

	@BeforeClass
	public static void openBrowserTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Tamil\\eclipse-workspace\\Selenium Web Driver files\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("---start-maximized");
		driver = new ChromeDriver(opt);
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

	}

	@Test
	public void doLoginTest() {

		WebElement loginUsername = driver.findElement(By.id("ctl00_MainContent_username"));
		loginUsername.sendKeys("Tester");
		WebElement loginPassword = driver.findElement(By.id("ctl00_MainContent_password"));
		loginPassword.sendKeys("test1");
		loginPassword.sendKeys(Keys.ENTER);

		String expectedTitle = "Web Orders";
		String actualTitle = driver.getTitle();

		try {
			Assert.assertEquals(expectedTitle, actualTitle);
		} catch (Throwable e) {
			err.addError(e);
		}

	}

	@AfterClass
	public static void doCloseBrowserTest() {
		driver.quit();
	}

}
