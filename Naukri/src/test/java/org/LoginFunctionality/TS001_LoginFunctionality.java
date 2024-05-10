
package org.LoginFunctionality;

import org.BaseClass.BaseClass;
import org.PageClass.LoginPageClass;
import org.testng.Assert;
import org.testng.annotations.Test;
	
public class TS001_LoginFunctionality extends BaseClass{

	
	@Test(dataProvider="LoginData")
	public void Login(String[] data) {
	
		LoginPageClass login = new LoginPageClass(driver);
		login.loginLink();
		login.email(data[0]);
		login.password(data[1]);
		String url = login.loginButton();
		String currentUrl = "https://www.naukri.com/mnjuser/homepage";
		Assert.assertEquals(url, currentUrl);
	
	}
	

	}


