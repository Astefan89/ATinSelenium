package components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {WebDriver driver;

public Header(WebDriver driver) {
	this.driver = driver;
}
// Declare variables for the different elements on the page
	private By shoppingCartButton = By.xpath("//a[@class=\"shopping_cart_link\"]");

//Actions
	public boolean shoppingCartButtonIsDisplayed() {
	return driver.findElement(shoppingCartButton).isDisplayed();
	}
}
