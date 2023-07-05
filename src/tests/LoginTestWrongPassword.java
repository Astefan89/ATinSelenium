package tests;

import org.junit.Assert;
import org.junit.Test;
import testdata.Messages;

public class LoginTestWrongPassword extends BaseTest{
	@Test
	public void loginWrongPassword (){
	standard_user.setPassword("1234");
	LoginPage.authenticator(standard_user);
	Assert.assertEquals(Messages.LOGIN_ERROR_MESSAGE, LoginPage.getLoginErrorMessage());
	}
}