package test;

import org.testng.annotations.Test;

import pages.Textbox_Pages;

public class Textbox_Test{
	
	Textbox_Pages newobj = new Textbox_Pages();
	
	@Test(priority=1,enabled=true)
	public void clickOnElements() {
		
		newobj.clickOnElements();
	}
	
	@Test(priority =2,enabled = true)
	public  void clickOnTextbox() {
		
		newobj.clickOnTextbox();
		
	}
	
	@Test(priority = 3 ,enabled = true)
	public void filltextbox() {
		
		newobj.filltextbox();
	}
}
