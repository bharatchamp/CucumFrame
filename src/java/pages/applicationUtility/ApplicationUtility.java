package applicationUtility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseLibrary.BaseLibrary;

public class ApplicationUtility extends BaseLibrary{
	
	public static void scrollByXpath(WebElement ele) {
		
		try {
			
			JavascriptExecutor js  = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", ele);
		
		}catch(Exception e) {
			
			System.out.println("Issue in scrollByXpath");
		}
	}

}
