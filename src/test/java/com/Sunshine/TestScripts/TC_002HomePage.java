package com.Sunshine.TestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Sunshine.Pages.HomePage;

public class TC_002HomePage extends TC_001Log_In {
	@Test
	public void homepagetestcase() throws Exception  {

		HomePage h = new HomePage(driver);
		h.Adminbutton.click();
	
		h.Addbutton.click();
		String uname = pUtil.readDataFromPropertyFile("username");
		String hints = pUtil.readDataFromPropertyFile("EmployeeName");
		
		String pword = pUtil.readDataFromPropertyFile("password");
		String repeat = pUtil.readDataFromPropertyFile("confirmpassword");
		
		h.homepagedetails(hints, uname, pword, repeat);
		

		//System.out.println("homepage details are entered");

	}
}
