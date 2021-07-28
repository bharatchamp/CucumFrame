package screenshotUtility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import baseLibrary.BaseLibrary;

public class ScreenshotUtility extends BaseLibrary {

	public static void getScreenshot(String foldername, String filename) {
		String path = System.getProperty("user.dir")+"\\screenshots\\"+foldername+"\\"+filename+".png";
		EventFiringWebDriver efw  = new EventFiringWebDriver(driver);
		File  srcfile = efw.getScreenshotAs(OutputType.FILE);
		try {		
			
			FileUtils.copyFile(srcfile, new File(path));
		} catch (Exception e) {
			
			System.out.println("Issue in getScreenshot   " +e);
		}
	}
	
}
