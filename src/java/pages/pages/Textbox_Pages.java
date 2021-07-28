package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ExcelUtility.GetReadData;
import applicationUtility.ApplicationUtility;
import baseLibrary.BaseLibrary;

public class Textbox_Pages extends BaseLibrary {

	public Textbox_Pages() {

		PageFactory.initElements(driver, this);
	}

	String path = "C:\\Users\\bharat bisht\\MySelenium\\PracticeTestNGFramework\\ExellData\\Details.xlsx";
	
	@FindBy(xpath="//*[@id='app']/div/div/div[2]/div/div[1]/div/div[3]/h5")
	private WebElement Elements;
	@FindBy(xpath = "//span[text()='Text Box']")
	private WebElement textele;
	@FindBy(xpath = "//*[@id='userName']")
	private WebElement fullname;
	@FindBy(xpath = "//*[@id='userEmail']")
	private WebElement useremail;
	@FindBy(xpath = "//*[@id='currentAddress']")
	private WebElement cur_add;
	@FindBy(xpath = "//*[@id='permanentAddress']")
	private WebElement per_add;
	@FindBy(xpath="//*[@id='submit']")
	private WebElement submitbtn;

	public void clickOnElements() {

		try {

			//ApplicationUtility.scrollByXpath(Elements);
			ApplicationUtility.scrollByXpath(Elements);
			Thread.sleep(2000);
			Elements.click();

		} catch (Exception e) {

			System.out.println("Issue in clickOnElements");
		}
	}
	public void clickOnTextbox() {

		try {

			textele.click();

		} catch (Exception e) {

			System.out.println("issue in clickOn texybox");
		}
	}

	public void filltextbox() {

		try {

			String exe_name = GetReadData.readData(path, 1, 1);
			String exe_email = GetReadData.readData(path, 1, 2);
			String exe_curadd = GetReadData.readData(path, 1, 3);
			String exe_peradd = GetReadData.readData(path, 1, 4);
			
			fullname.sendKeys(exe_name);
			useremail.sendKeys(exe_email);
			cur_add.sendKeys(exe_curadd);
			per_add.sendKeys(exe_peradd);
			applicationUtility.ApplicationUtility.scrollByXpath(submitbtn);
			submitbtn.click();
			
			List<WebElement> detailsList = driver.findElements(By.xpath("//*[@id='output']/div/p"));
			
			  ArrayList<String> excel_list = new ArrayList<String>();
			  excel_list.add(exe_name); excel_list.add(exe_email);
			  excel_list.add(exe_curadd); excel_list.add(exe_peradd);
			 
			  for(WebElement newlist:detailsList) {
				  
				  String singlelist = newlist.getText().split(":")[1];
				  for(String exelist:excel_list) {
					  
						/*
						 * if(singlelist.equals(exelist)) {
						 * 
						 * System.out.println(exelist); }
						 */
					  
					  Assert.assertEquals(singlelist,exelist);
					  
					  excel_list.remove(exelist);
					  break;
				  }
			
			  }		

		} catch (Exception e) {

			System.out.println("Issue in filltextbox");
		}
	}

}
