package DataIngestors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class SentimentAnalysis extends InnsightLogin{
	
	@AfterClass
	public void analysis() throws Exception {
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("modi");
		driver.findElement(By.cssSelector("span#searchTweet")).click();
	    Thread.sleep(5000);
	    
	    Actions action=new Actions(driver);
	    WebElement sentiment=driver.findElement(By.cssSelector("path.highcharts-point.highcharts-color-1.highcharts-point-hover"));
	    action.moveToElement(sentiment, 0, 30).build().perform();
	    System.out.println("error");}

}
