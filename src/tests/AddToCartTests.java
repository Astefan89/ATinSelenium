package tests;

import org.junit.Assert;
import org.junit.Test;

import testdata.Messages;
import testdata.URL;

public class AddToCartTests extends BaseTest{
	
	//Test that adds a product to a card 
	@Test
	public void addProductToCart() {
		LoginPage.authenticator(standard_user);
		Assert.assertTrue(Header.shoppingCartButtonIsDisplayed());
		Assert.assertEquals(URL.INVENTORY_PAGE, InventoryPage.getCurrentURL());
		InventoryPage.clickOnSauceLabsBackpack();
		Assert.assertEquals(sauce_Labs_Backpack.getTitle(), InventoryPage.getProduseNameBackpack());
		Assert.assertEquals(sauce_Labs_Backpack.getDescription(), InventoryPage.getProduseDescriptionsBackpack());
		Assert.assertEquals(sauce_Labs_Backpack.getPrice(), InventoryPage.getProdusePriceBackpack());
		InventoryPage.clickOnAddtoCartButtonBackpack();
		InventoryPage.clickOnshoppingCartButton();
		Assert.assertEquals(URL.CART_PAGE, CartPage.getCurrentURL());
		Assert.assertEquals(Messages.CART_PAGE_TITLE, CartPage.getCartPageTitle());
		Assert.assertEquals(sauce_Labs_Backpack.getPrice(), CartPage.getCartPagePriceItem());
	}
}
