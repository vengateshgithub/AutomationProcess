import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitWithSeWeDri1 {

	@Before
	public void browserOpenTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Venkat Tamil\\eclipse-workspace\\Selenium Web Driver files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

	}

	@Test
	public void loginTest() {
		
		

	}
}
