import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

public class JThree {

	@Rule
	public ErrorCollector err = new ErrorCollector();

	static WebDriver driver;
	Alert alertMsg;

	@BeforeClass
	public static void openBrowserTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Tamil\\eclipse-workspace\\Selenium Web Driver files\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("---headless");
		driver = new ChromeDriver(opt);
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(3000);

	}

	@Test
	public void doLoginTest() throws InterruptedException {

		WebElement simpleAlert = driver.findElement(By.xpath("//*[@id='content']/p[4]/button"));
		simpleAlert.click();

		alertMsg = driver.switchTo().alert();

		System.out.println("Alert msg is: " + alertMsg.getText());
		alertMsg.accept();
		Thread.sleep(2000);

		WebElement confirmationPopUp = driver.findElement(By.xpath("//*[@id='content']/p[8]/button"));

		confirmationPopUp.click();

		alertMsg = driver.switchTo().alert();

		System.out.println("Alert msg is: " + alertMsg.getText());
		Thread.sleep(2000);
		alertMsg.dismiss();

		WebElement promptAlertMsg = driver.findElement(By.xpath("//*[@id='content']/p[11]/button"));
		promptAlertMsg.click();

		alertMsg = driver.switchTo().alert();
		System.out.println("Alert msg is: " + alertMsg.getText());
		Thread.sleep(2000);
		alertMsg.accept();
	}

	@After
	public void doCloseBrowserTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();

	}

}
