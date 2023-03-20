package common_Component;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reporter {

	public static String takeScreenShot(WebDriver driver, Method methodName) throws IOException{
		TakesScreenshot takeSS = (TakesScreenshot) driver;
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		File sourceOutputFile = takeSS.getScreenshotAs(OutputType.FILE);
		File Dest = new File("./Screenshot/"+methodName.getName()+timestamp+".png");
		FileUtils.copyFile(sourceOutputFile, new File("./Screenshot/"+methodName.getName()+timestamp+".png"));
		String errflpath = Dest.getAbsolutePath();
		return errflpath;
	}

}
