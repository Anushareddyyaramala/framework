package com.Sunshine.TestScripts;

import org.testng.annotations.Test;

import com.Sunshine.BaseClass.BaseTest;
import com.Sunshine.Pages.Log_in;
import com.Sunshine.utils.JSONUtility;

public class TC_001Log_In extends BaseTest {

	@Test(dataProvider="login")
	public void loginTestCase() throws Throwable {
     
           
		Log_in l = new Log_in(driver);
		String user=json.getdata("username");
		String pass=json.getdata("Password");
		l.logIn(user, pass);
		 
		
	}
}