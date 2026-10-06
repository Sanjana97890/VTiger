package genericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SeleniumUtility
{
	/**
	 * 
	 * @param driver
	 * @param url
	 */
	public void accessApplication(WebDriver driver, String url)
	{
		driver.get(url);
	}
	/**
	 * This is a generic method to maximize the window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void refreshWebpage(WebDriver driver)
	{
		driver.navigate().refresh();
	}
	public void closeBrowser(WebDriver driver)
	{
		driver.quit();
	}
	/**
	 * This is a generic method to provide implicit wait
	 */
	public void implicitWait(WebDriver driver, int maxTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
	}
	///////**********Handling dropdown********///////
	/**
	 * This is a generic method to select a option in dropdown using value attribute
	 *@param dropdownEle
	 *@param value
	*/
	public void selectOptionByValue(WebElement dropdownEle, String value)
	{
		Select sel = new Select(dropdownEle);
		int index = 0;
		sel.selectByIndex(index);
	}
	/**
	 * This is a generic method to select a option in dropdown using visible text
	 *@param dropdownEle
	 *@param visibleText
	*/
	public void selectOptionByVisibleText(WebElement dropdownEle, String visibleText)
	{
		Select sel = new Select(dropdownEle);
		sel.selectByVisibleText(visibleText);
	}
	public void selectOptionByIndex(WebElement dropdownEle, int indexvalue)
	{
		Select sel = new Select(dropdownEle);
		sel.selectByIndex(indexvalue);
	}
	public void mouseHoveringAction(WebDriver driver, WebElement element)
	{
		new Actions(driver).moveToElement(element).perform();
	}
	public void rightClickAction(WebDriver driver, WebElement element)
	{
		new Actions(driver).contextClick(element).perform();
	}
	public void dragAndDropAction(WebDriver driver, WebElement draggableEle, WebElement dropEle)
	{
		new Actions(driver).dragAndDrop(draggableEle, dropEle).perform();
}
	public void acceptAlert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	public void cancelAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	public void switchToFramesUsingIndex(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	public void switchToFramesUsingFrameElement(WebDriver driver, WebElement frameEle)
	{
		driver.switchTo().frame(frameEle);
	}
	public String takeWebpageScreenshot(WebDriver driver, String fileName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\"+fileName+".png");
		Files.copy(src,  dest);
		return dest.getAbsolutePath();                  //used for listeners
	}
}