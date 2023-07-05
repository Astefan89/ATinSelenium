package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;

	}
	//Locators
	private By cartPageTitle = By.xpath("//span[@class=\"title\"]");
	private By cartPagePriceItem = By.xpath("//div[@class=\"inventory_item_price\"]");
	
	
	
	
	//Actions
	public String getCartPageTitle() {
		return driver.findElement(cartPageTitle).getText();	
	}
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	public String getCartPagePriceItem() {
		return driver.findElement(cartPagePriceItem).getText();
	}
}
