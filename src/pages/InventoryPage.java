package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		this.driver = driver;
	}
	//Method to get currentURL
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	// Declare variables for the different elements on the page and identify the element 
	
	
	private By produseFleeceJacket = By.xpath("//div[@class=\"inventory_list\"]/descendant::div[@class=\"inventory_item_name\"][4]");
	private By sauceLabsBackpack = By.xpath("//*[@id=\"item_4_title_link\"]/div");
	private By produseDetailNameBackpack = By.xpath("//div[@class=\"inventory_details_name large_size\"]");
	private By produseDetailDescriptionsBackpack = By.xpath("//div[@class=\"inventory_details_desc large_size\"]");
	private By producePriceBackpack = By.xpath("//div[@class=\"inventory_details_price\"]");
	private By addToCartButtonBackpack = By.id("add-to-cart-sauce-labs-backpack");
	private By shoppingCartButton = By.xpath("//a[@class=\"shopping_cart_link\"]");
	

	
	//Actions
	public String getProduseFleeceJacket() {
		return driver.findElement(produseFleeceJacket).getText();
	}
	
	public void clickOnSauceLabsBackpack() {
		driver.findElement(sauceLabsBackpack).click();
	}
	public String getProduseNameBackpack() {
		return driver.findElement(produseDetailNameBackpack).getText();	
	}
	public String getProduseDescriptionsBackpack() {
		return driver.findElement(produseDetailDescriptionsBackpack).getText();
	}
	
	public void clickOnAddtoCartButtonBackpack() {
		driver.findElement(addToCartButtonBackpack).click();
	}
	
	public String getProdusePriceBackpack() {
		return driver.findElement(producePriceBackpack).getText();
	}
	public void clickOnshoppingCartButton() {
		driver.findElement(shoppingCartButton).click();
	}
}
