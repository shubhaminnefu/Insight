package DataIngestors;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class AvatarCrawling extends InnsightLogin {
	
	@AfterClass
public void avatar() throws Exception {
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("modi");
		driver.findElement(By.cssSelector("span#searchTweet")).click();
		driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]")).click();
		
		System.out.println("************************");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-1']/span/mat-panel-title/span")).click();
		
		
		driver.findElement(By.xpath("//div[@id='cdk-accordion-child-1']/div/ul/li[2]/button")).click();

		
		
}
	

	  
	  }

