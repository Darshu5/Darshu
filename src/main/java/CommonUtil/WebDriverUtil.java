package CommonUtil;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtil {

	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void handleDropDown(WebElement element,String targetedElemet)
	{
		Select s= new Select(element);
		s.selectByVisibleText(targetedElemet);
	}
	
	public void mouseHover(WebDriver driver, WebElement element) {
		Actions a=new Actions(driver);
		 a.moveToElement(element);
		 a.perform();
	}
	public void switchWindow(WebDriver d,String ExpectedUrl) {
		Set<String> ids=d.getWindowHandles();
		for(String e:ids) {
			String actualUrl=d.switchTo().window(e).getCurrentUrl();
			
			if(actualUrl.contains(ExpectedUrl)) {
				break;
				
				
			}
			
		}
		
	}
	public String screenShot(WebDriver d,String ScreenshotName) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)d;
	File tempfile=	ts.getScreenshotAs(OutputType.FILE);
	File destinationfile=new File("./Screenshot/"+ScreenshotName+".png");
    FileUtils.copyFile(tempfile,destinationfile);
	return destinationfile.getAbsolutePath() ;      ///////////////////////////////////*************************
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}

	
}
