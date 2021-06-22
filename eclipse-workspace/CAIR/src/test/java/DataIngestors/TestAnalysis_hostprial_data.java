package DataIngestors;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class TestAnalysis_hostprial_data extends InnsightLogin{
//Solution shall provide the ability for queries to return all historical
// content from any provider that meet the search parameters of the user
	
	@AfterClass
	public void historial() throws Exception {
		 driver.findElement(By.id("txtTwSrch")).sendKeys("modi");
		    driver.findElement(By.id("searchTweet")).click();
		    driver.findElement(By.id("calmBox")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//div[@id='calBox']/div[2]/span[4]")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//span[@onclick='dapply()']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//a[@id='twReport']/span")).click();
			/*
			 * driver.findElement(By.xpath("//ul[@id='ultwsrt']/li[2]/span")).click();
			 * driver.findElement(By.xpath("//div[@id='divAllTweet']/div/div")).click();
			 */
		
	}
}
