package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends AbstractPage {

	
	@FindBy (xpath =".//*[@id='products']/div[1]/div[1]/div/div[2]/div[5]/div/div[1]/span")
	private WebElement search_result;
	
	@FindBy (xpath =".//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[1]/ul/li[4]/a")
	private WebElement signup;
	
	public DashboardPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public boolean varify_flipkart_search()
	{
	/*
		           Integer price= Integer.parseInt( search_result.getText());
		 
		           System.out.println("---------------------"+price);*/
		           
		  if(search_result.isDisplayed())
		  
			return true;
		else
			 return false;

	
	
	}

	public boolean varify_flipkart_signup()
	{
		
	
		if(signup.isDisplayed())
		     return true;
		else
			 return false;

	
	
	}

	
	
	
/*	public boolean verifyDashboard_facebook()
	{
		
		if(linkviral.isDisplayed())
			     return true;
			else
				 return false;
	}
	
	
	
	
	public boolean verify_google()
	{
		
		if(google.isDisplayed())
			     return true;
			else
				 return false;
	}
	
	public boolean verifyfacebook_post()
	{
		return true;
	}
	
*/	
}
