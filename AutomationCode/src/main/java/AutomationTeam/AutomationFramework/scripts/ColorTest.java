package AutomationTeam.AutomationFramework.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import AutomationTeam.AutomationFramework.CommonDriver.Base;
import AutomationTeam.AutomationFramework.lib.CommonLib;
import AutomationTeam.AutomationFramework.webe.Home_WebE;


public class ColorTest {

	public static WebDriver driver = null;
	static WebDriverWait wait = null;
	static Home_WebE home_webe;
	Actions action = null;
	boolean bst = true;


	ExtentTest logger;

	@BeforeClass
	public void beforeClass() {

		// Before Start Test
		wait = new WebDriverWait(Base.driver, 20);
		home_webe = Home_WebE.getInstance(Base.driver);	
	}

	/** 
	 * 
	 * Verify Red color
	 * @author sagar.nk
	 * @throws Exception 
	 */
	@Test
	public void verifyRed() throws Exception {

		try {

			logger = Base.extent.startTest("verifyRed");
			Assert.assertTrue(Base.driver.getTitle().equalsIgnoreCase("RRR GGG BBB"));
			action = new Actions(Base.driver);
			
			//Wait until element is click-able
			wait.until(ExpectedConditions.elementToBeClickable(home_webe.letterR));
			
			//Move to element
			action.moveByOffset(0, 0).pause(3000).moveToElement(home_webe.letterR).click().build().perform();
			
			//Verify Background color
			Assert.assertEquals(Base.driver.findElement(By.tagName("body")).getAttribute("class"), "r");
			
			//Verify R Text color
			Assert.assertEquals(Base.driver.findElement(By.id("R-fill")).getAttribute("class"), "black");
			
			//Verify G Text color
			Assert.assertEquals(Base.driver.findElement(By.id("G-fill")).getAttribute("class"), "black");
			
			//Verify B Text color
			Assert.assertEquals(Base.driver.findElement(By.id("B-fill")).getAttribute("class"), "black");
			
			

		} catch (Exception e) {
			bst=false;
			e.printStackTrace();
		}
		finally {
			action.moveByOffset(0, 10).build().perform();
			action = null;
			if (bst)
			{
				logger.log(LogStatus.PASS, "Test Case Passed ");
			}
			else
			{
				//logger.log(LogStatus.FAIL, "Test Case Failed ");
				 String screenshotPath = CommonLib.getScreenshot(Base.driver,"verifyRed");
				 //To add it in the extent report 
				 logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			}
			Base.extent.endTest(logger);
		}
	}
	
	
	/** 
	 * 
	 * Verify Green color
	 * @author sagar.nk
	 * @throws Exception 
	 */
	@Test
	public void verifyGreen() throws Exception {

		try {

			logger = Base.extent.startTest("verifyGreen");
			Assert.assertTrue(Base.driver.getTitle().equalsIgnoreCase("RRR GGG BBB"));
			action = new Actions(Base.driver);
			
			//Wait until element is click-able
			wait.until(ExpectedConditions.elementToBeClickable(home_webe.letterG));
			
			//String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',  true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			Thread.sleep(2000);
			
			//Move to element
			action.moveToElement(home_webe.letterG).doubleClick().build().perform();
			//((JavascriptExecutor) Base.driver).executeScript(mouseOverScript,home_webe.letterG);
			
			Thread.sleep(3000);
			
			//Verify Background color
			Assert.assertEquals(Base.driver.findElement(By.tagName("body")).getAttribute("class"), "g");
			
			//Verify R Text color
			Assert.assertEquals(Base.driver.findElement(By.id("R-fill")).getAttribute("class"), "black");
			
			//Verify G Text color
			Assert.assertEquals(Base.driver.findElement(By.id("G-fill")).getAttribute("class"), "black");
			
			//Verify B Text color
			Assert.assertEquals(Base.driver.findElement(By.id("B-fill")).getAttribute("class"), "black");

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			action.moveByOffset(0, 10).build().perform();
			action = null;
			if (bst)
			{
				logger.log(LogStatus.PASS, "Test Case Passed ");
			}
			else
			{
				//logger.log(LogStatus.FAIL, "Test Case Failed ");
				 String screenshotPath = CommonLib.getScreenshot(Base.driver,"verifyGreen");
				 //To add it in the extent report 
				 logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			}
			Base.extent.endTest(logger);
		}
	}
	
	
	/** 
	 * 
	 * Verify Blue color
	 * @author sagar.nk
	 * @throws Exception 
	 */
	@Test
	public void verifyBlue() throws Exception {

		try {

			logger = Base.extent.startTest("verifyBlue");
			Assert.assertTrue(Base.driver.getTitle().equalsIgnoreCase("RRR GGG BBB"));
			action = new Actions(Base.driver);
			
			//Wait until element is click-able
			wait.until(ExpectedConditions.elementToBeClickable(home_webe.letterR));
			
			//Move to element
			action.moveByOffset(0, 0).pause(3000).moveToElement(home_webe.letterB).click().build().perform();
			
			//Verify Background color
			Assert.assertEquals(Base.driver.findElement(By.tagName("body")).getAttribute("class"), "b");
			
			//Verify R Text color
			Assert.assertEquals(Base.driver.findElement(By.id("R-fill")).getAttribute("class"), "black");
			
			//Verify G Text color
			Assert.assertEquals(Base.driver.findElement(By.id("G-fill")).getAttribute("class"), "black");
			
			//Verify B Text color
			Assert.assertEquals(Base.driver.findElement(By.id("B-fill")).getAttribute("class"), "black");

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			action.moveByOffset(0, 10).build().perform();
			action = null;
			if (bst)
			{
				logger.log(LogStatus.PASS, "Test Case Passed ");
			}
			else
			{
				//logger.log(LogStatus.FAIL, "Test Case Failed ");
				 String screenshotPath = CommonLib.getScreenshot(Base.driver,"verifyBlue");
				 //To add it in the extent report 
				 logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
			}
			Base.extent.endTest(logger);
		}
	}
	
	
	@AfterClass
	public void AfterClass() {

		// Last setup
		wait = null;

	}


}
