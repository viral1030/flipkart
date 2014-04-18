package com.flipkart.verification;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.flipkart.Init.Common;
import com.flipkart.Init.SeleniumInit;
import com.flipkart.pages.DashboardPage;
//comment added on indexpage
public class Index extends SeleniumInit {

	Common common = new Common(driver);

	// data provide example
       @DataProvider(name="test1")
       public String[][] dataprovidedemo()
       {
    	   String u="viral";
    			   String b="mahesh";
			         String c="manoj";
                         int i=0;			   
    			   return new String[][]
    					   {
    					   {u},
    					   {b},
    					   {c}
    					   
    					   };
    			   
    	   
    	   
       }
       
       
	
	     @Test(dataProvider="dataprovidedemo")
	     public void dataproviderusedemo(String n1)
	     {
	    	 System.out.println("first String " + n1);
	     }
	
	// data provide example over

	@Test
	public void test1()
	{
		System.out.println("inside test1");
	}
	
	@Test(dependsOnMethods={"test1"})
	public void test2()
	{
		System.out.println("this method is run after test1 method");
	}
	
	
	@Test
	public void flipkart_search()// flipkart login process
	{

		common.log("</br>step 1: open the flipcart homepage");
		common.log("</br>step 2: enter the keyword into searchbox : 'nokia' ");

		common.log("</br>step 3: click on search button ");
		common.log("</br>step 4:  click on price range filter "
				+ "price range : Rs. 10001 - Rs. 18000 ");
		common.log("</br>step 5: click on Brand filter 1");
		common.log("</br>step 6: click on Brand filter 2");

		DashboardPage db = indexpage.flipkart_search();

		if (db.varify_flipkart_search()) {
			// Assert.assertTrue(true);
			log("<br></br>PASS");

		} else {
			// Assert.assertTrue(false);
			log("<br></br>FAIL");

		}

	}

	@Test
	/*
	 * @Parameters("myname")
	 */public void flipkart_sign(/* String myname */) {

		common.log("</br>step 1:click on login button ");
		common.log("</br>step 2:click on signup button ");
		common.log("</br>step 3:enter the deatil of signup"
				+ "   </br> Email: Krazzyvir@gmail.com"
				+ "  </br> Password : 1028krazzyvir ");
		common.log("</br>step 4:click on signupnow button");

		DashboardPage db = indexpage.flipkart_signup();

		/*
		 * System.out.println("------------------------"+myname);
		 */

		if (db.varify_flipkart_signup()) {
			// Assert.assertTrue(true);
			log("<br></br>PASS");

		} else {
			// Assert.assertTrue(false);
			log("<br></br>FAIL");

		}

	}

	@Test(enabled = false)
	public void flipkart_filter() throws Exception {
		common.log("<br> step 1: open the flipkart.com");
		DashboardPage db = indexpage.filter_flipcart();

	}

	/*
	 * @Test public void facebook_login() //facebook login {
	 * 
	 * common.log("<br></br>Step 1:Enter Valid User name:''");
	 * common.log("<br></br>Step 2:Enter Valid Password:''");
	 * common.log("<br></br>Step 3:Click on Login Button"); DashboardPage db =
	 * indexpage.login();
	 * 
	 * common.log("<br></br>Step 4:Verify user successfully loged in"); if
	 * (db.verifyDashboard_facebook()) { //Assert.assertTrue(true);
	 * log("<br></br>PASS");
	 * 
	 * } else { //Assert.assertTrue(false); log("<br></br>FAIL");
	 * 
	 * }
	 * 
	 * }
	 * 
	 * @Test public void facebook_post() {
	 * 
	 * DashboardPage db=indexpage.post_fb(); if (db.verifyfacebook_post()) {
	 * Assert.assertTrue(true); log("<br></br>PASS");
	 * 
	 * } else { Assert.assertTrue(false); log("<br></br>FAIL");
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * @Test public void google_search() {
	 * 
	 * DashboardPage db=indexpage.google_search();
	 * 
	 * 
	 * if (db.verify_google()) {
	 * 
	 * log("<br></br>PASS");
	 * 
	 * } else {
	 * 
	 * log("<br></br>FAIL");
	 * 
	 * }
	 * 
	 * 
	 * }
	 */

}
