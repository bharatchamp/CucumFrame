package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import applicationUtility.ApplicationUtility;
import baseLibrary.BaseLibrary;
import screenshotUtility.ScreenshotUtility;

public class LoginToolsQA_Page extends BaseLibrary {

	public LoginToolsQA_Page() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//span[text()='Demo Site'])[1]")
	private WebElement Demosite;
	@FindBy(xpath="//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]/h5")
	private WebElement Elements;

	public void getUrl_ToolsQA() {

		launchUrl("https://www.toolsqa.com/");
		ScreenshotUtility.getScreenshot("passedtestcase", "demo");
	}

	public void clickOnDemosite() {

		try {

			Demosite.click();

		} catch (Exception e) {

			System.out.println("Issue in clickONDemosite");
		}
	}
	
	/*
	 * public void clickOnElements() {
	 * 
	 * 
	 * try {
	 * 
	 * ApplicationUtility.scrollByXpath(Elements); Thread.sleep(2000);
	 * Elements.click();
	 * 
	 * }catch(Exception e) {
	 * 
	 * System.out.println("Issue in clickOnElements"); } }
	 */

}
