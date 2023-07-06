package tests;
import org.junit.Assert;
import org.junit.Test;
import testdata.URL;
public class LoginTests extends BaseTest {
	
	@Test 
	public void login()  {
		LoginPage.authenticator(standard_user);
		Assert.assertTrue(Header.shoppingCartButtonIsDisplayed());
		Assert.assertEquals(URL.INVENTORY_PAGE, InventoryPage.getCurrentURL());
		Assert.assertEquals(sauce_Labs_Fleece_Jacket.getTitle(), InventoryPage.getProduseFleeceJacket());
		}
}



