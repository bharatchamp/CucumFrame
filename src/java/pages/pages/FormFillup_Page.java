package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ExcelUtility.GetReadData;
import applicationUtility.ApplicationUtility;
import baseLibrary.BaseLibrary;

public class FormFillup_Page extends BaseLibrary {

	public FormFillup_Page() {

		PageFactory.initElements(driver, this);
	}

	String path = "C:\\Users\\bharat bisht\\MySelenium\\PracticeTestNGFramework\\ExellData\\forms.xlsx";

	@FindBy(xpath = "//h5[text()='Forms']")
	private WebElement form;
	@FindBy(xpath = "//span[text()='Practice Form']")
	private WebElement pracForm;
	@FindBy(xpath = "//*[@id='firstName']")
	private WebElement fname;
	@FindBy(xpath = "//*[@id='lastName']")
	private WebElement lname;
	@FindBy(xpath = "//*[@id='userEmail']")
	private WebElement usereMail;
	@FindBy(xpath = "//*[@id='genterWrapper']/div[2]/div[1]/label")
	private WebElement gender;
	@FindBy(xpath = "//*[@id='userNumber']")
	private WebElement userNo;

	@FindBy(xpath = "//*[@id='dateOfBirthInput']")
	private WebElement dob;
	@FindBy(xpath = "//*[@class='react-datepicker__year-select']")
	private WebElement yrDropdown;
	@FindBy(xpath = "//*[@class='react-datepicker__month-select']")
	private WebElement monthDropdown;
	@FindBy(xpath = "//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[4]/div[7]")
	private WebElement seldate;
	// *[@class='react-datepicker__day react-datepicker__day--023']

	@FindBy(xpath = "//*[@id='subjectsInput']")
	private WebElement subject;
	@FindBy(xpath = "//*[@id='hobbiesWrapper']/div[2]/div[1]/label")
	private WebElement hobbies;
	@FindBy(xpath = "//*[@id='currentAddress']")
	private WebElement curAdd;
	@FindBy(xpath = "//*[@id='react-select-3-input']")
	private WebElement selState;
	@FindBy(xpath = "//*[@id='react-select-4-input']")
	private WebElement selCity;
	@FindBy(xpath = "//*[@id='submit']")
	private WebElement submitBtn;

	public void formFillup() {

		try {

			String firstname = GetReadData.readData(path, 1, 0);
			String lastname = GetReadData.readData(path, 1, 1);
			String email = GetReadData.readData(path, 1, 2);
			String mno = GetReadData.readData(path, 1, 4);
			String sub = GetReadData.readData(path, 1, 6);
			// String hobbies = GetReadData.readData(path, 1, 0);
			String curadd = GetReadData.readData(path, 1, 9);
			String state = GetReadData.readData(path, 1, 10);
			String city = GetReadData.readData(path, 1, 11);

			ApplicationUtility.scrollByXpath(form);
			form.click();
			Thread.sleep(2000);
			pracForm.click();
			Thread.sleep(1000);
			fname.sendKeys(firstname);
			Thread.sleep(1000);
			lname.sendKeys(lastname);
			Thread.sleep(1000);
			usereMail.sendKeys(email);
			Thread.sleep(1000);
			gender.click();
			Thread.sleep(1000);
			userNo.sendKeys(mno);
			
			dob.click();
			Select yr = new Select(yrDropdown);
			yr.selectByVisibleText("1994");
			Select month = new Select(monthDropdown);
			month.selectByVisibleText("April");
			seldate.click();

			Thread.sleep(1000);
			subject.sendKeys(sub);
			subject.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			hobbies.click();
			Thread.sleep(1000);
			curAdd.sendKeys(curadd);
			Thread.sleep(1000);
			selState.sendKeys(state);
			selState.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
			selCity.sendKeys(city);
			selCity.sendKeys(Keys.ENTER);

		} catch (Exception e) {

			System.out.println("Issue in formsFillup" + e);
		}
	}
}
