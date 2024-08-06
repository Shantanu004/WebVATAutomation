package UtilitiesPackageForVAT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utilities {
public static String captureScreenshotMethodForBatchSetUpPage(WebDriver driver , String testName) {
	
		File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String ScreenshotFolder = System.getProperty("user.dir")+"\\Bug_Screenshot\\BugScreenshot_For_BatchSetup\\"+testName+".png";
		try {
			FileHandler.copy(srcScreenshot,new File(ScreenshotFolder));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ScreenshotFolder;
	}
}
