package tests;
import org.junit.Assert;
import org.junit.Test;
import testdata.URL;
public class LoginTests extends BaseTest {//This is a test to verify that logging in with an incorrect user is unsuccessful.
	
	///This is a test to verify that logged out with an standard user is successful.
	@Test 
	public void login()  {
		LoginPage.authenticator(standard_user);
		Assert.assertTrue(Header.shoppingCartButtonIsDisplayed());
		Assert.assertEquals(URL.INVENTORY_PAGE, InventoryPage.getCurrentURL());
		Assert.assertEquals(sauce_Labs_Fleece_Jacket.getTitle(), InventoryPage.getProduseFleeceJacket());
	}
}



