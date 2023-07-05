package tests;
import org.junit.Assert;
import org.junit.Test;

import testdata.Messages;
import testdata.URL;

public class LoginTestLockOutUser extends BaseTest { 
	@Test
	
	public void loginWithLockoutUser(){
		
		LoginPage.authenticator(locked_out_user);
		Assert.assertEquals(URL.MAIN_PAGE, LoginPage.getCurrentURL());
		Assert.assertEquals(Messages.LOGIN_ERROR_LOCKOUT_USER, LoginPage.getLoginErrorMessageLockOutUser());	
	}
}	
