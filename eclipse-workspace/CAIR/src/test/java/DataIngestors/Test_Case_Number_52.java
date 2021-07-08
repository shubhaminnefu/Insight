package DataIngestors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Test_Case_Number_52 extends InnsightLogin{

	
	@AfterClass
	public void gender() throws Exception {
		//search key enter
	    WebElement search=driver.findElement(By.id("txtTwSrch"));
	    search.sendKeys("India AND Modi");
	    search.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.id("twDashboard")).click();
	    //
	    Actions a = new Actions(driver);
	    WebElement el = driver.findElement(By.xpath("//*[@id=\"divDashboardAll\"]/div[2]"));
	    a.moveToElement(el).clickAndHold().moveByOffset(0, 300).release().perform();
	}
}
