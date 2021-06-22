package DataIngestors;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class ComplexQuery extends InnsightLogin{
	@AfterClass
	public void complex() {
		driver.findElement(By.linkText("Past Analysis")).click();
	    driver.findElement(By.xpath("//div[@id='groupboxId']/div[5]/div/div/span[2]")).click();
	    driver.findElement(By.id("spnYes")).click();
	    driver.findElement(By.id("searchTweet")).click();
	}

}
