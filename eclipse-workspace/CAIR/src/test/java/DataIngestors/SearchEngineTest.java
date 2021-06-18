package DataIngestors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class SearchEngineTest extends InnsightLogin{

	@AfterClass
	public void searchengine() throws Exception {
		
		driver.findElement(By.xpath("/html/body/form/div/header/div[1]/div[2]/div/div[2]/ul[1]/li[1]/a")).click();
		 driver.findElement(By.id("lblNewsCheckUnCheckAll")).click();
		 Thread.sleep(2000);
		    driver.findElement(By.id("lblCheckUnCheckAll")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[15]/label/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[14]/label/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[16]/label/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[17]/label/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.linkText("Apply")).click();
		    Thread.sleep(10000);
		    
		    //b.	Social Media analysis
		    driver.findElement(By.linkText("New Analysis")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("txtTwSrch")).click();
		    driver.findElement(By.id("txtTwSrch")).clear();
		    driver.findElement(By.id("txtTwSrch")).sendKeys("modi");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Past Analysis'])[1]/preceding::a[1]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("lblNewsCheckUnCheckAll")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("lblNewsCheckUnCheckAll")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("lblCheckUnCheckAll")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.id("lblCheckUnCheckAll")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li/label/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[2]/label/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[3]/label/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[4]/label/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.linkText("Apply")).click();
		    
		    Thread.sleep(10000);
		    
		    //c.	Dark Web marketplaces
		    driver.findElement(By.linkText("New Analysis")).click();
		    driver.findElement(By.id("txtTwSrch")).click();
		    driver.findElement(By.id("txtTwSrch")).clear();
		    driver.findElement(By.id("txtTwSrch")).sendKeys("modi");
		    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Past Analysis'])[1]/preceding::a[1]")).click();
		    
		    Thread.sleep(2000);
		    driver.findElement(By.id("lblNewsCheckUnCheckAll")).click();
		    driver.findElement(By.id("lblCheckUnCheckAll")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//ul[@id='ulEntifilSource']/li[12]/label/span")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.linkText("Apply")).click();
		  }
			    
		/*
		 * WebElement
		 * uncheck_seaarchengine=driver.findElement(By.id("lblCheckUnCheckAll"));
		 * uncheck_seaarchengine.click();
		 */
	}
	

