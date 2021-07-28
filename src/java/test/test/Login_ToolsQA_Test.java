package test;
import org.testng.annotations.Test;

import pages.LoginToolsQA_Page;

public class Login_ToolsQA_Test {

	LoginToolsQA_Page obj = new LoginToolsQA_Page();
	
	@Test(priority = 1, enabled = true)
	public void getLaunch_ToolsQA() {
		
		try {
			
			obj.getUrl_ToolsQA();
			
		}catch(Exception e) {
			
			System.out.println();
		}
	}
	
	@Test(priority  = 2,enabled = true)
	public void clickOnDemosite() {
		
		try {
			
			obj.clickOnDemosite();
			
		}catch(Exception e) {
			
			System.out.println("Issue in ClicOnDemosite");
		}
	}
	
	/*
	 * @Test(priority = 3,enabled=true) public void clickOnElements() {
	 * 
	 * obj.clickOnElements(); }
	 */
}
