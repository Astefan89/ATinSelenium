package tests;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import components.Header;
import pages.CartPage;
import pages.InventoryPage;
import pages.LoginPage;
import testdata.Messages;
import testdata.ProductData;
import testdata.URL;
import testdata.User;

public class BaseTest {static WebDriver driver;

public static LoginPage LoginPage;
public static Header Header;
public static InventoryPage InventoryPage;
public static CartPage CartPage;

public static User standard_user = new User("standard_user");
public static User locked_out_user = new User("locked_out_user");
public static ProductData sauce_Labs_Backpack = new ProductData("sauce_Labs_Backpack");
public static ProductData sauce_Labs_Fleece_Jacket = new ProductData("Sauce_Labs_Fleece_Jacket");

@Before
public void before() {
	System.setProperty("webdriver.chrome.driver", "src/resource/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	LoginPage = new LoginPage(driver);
	Header = new Header(driver);
	InventoryPage = new InventoryPage(driver);
	CartPage = new CartPage(driver);
	
	
	driver.navigate().to(URL.MAIN_PAGE);
	Assert.assertEquals(URL.MAIN_PAGE, LoginPage.getCurrentURL());
	Assert.assertEquals(Messages.HEADER_TEXT, LoginPage.getHeaderText());
	
	
}
@After
public void after() {
	driver.close();
	}
}
