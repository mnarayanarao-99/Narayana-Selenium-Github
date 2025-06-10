package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {
	//All Locators will be stored here
	
	//syntax:
	//public final By pagename_elementname_Type = By.name("asddds")
	
	public final By fbLogin_ForgotPassword_Link = By.linkText("Forgot password?");
	public final By fbLogin_Email_editbox = By.name("email");

	// Automation Exercise Test Scenarion : 07 (Subscription of email) start
	
	   // text box
	//public final By automation_Subscription_editbox = By.id("subscribe_email");
	  public final By automation_Subscription_editbox = By.xpath("//input[@id=\"susbscribe_email\"]");
	
	//input[@id="susbscribe_email"]
	
	  // subscribe button
	//public final By automation_Subscription_submit_button = By.id("subcribe");
	//public final By automation_Subscription_submit_button = By.xpath("//*[@id=\"subscribe\"]/1");
	//public final By automation_Subscription_submit_button = By.className("fa fa-arrow-circle-o-right");
	
	//subscription x-path:
	////*[@id="footer"]/div[1]/div/div/div[2]/div/h2
	//public final By autoSubscript_eMail_Click = By.xpath("//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2");
}
