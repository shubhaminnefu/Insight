package DataIngestors;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class DataQuery extends InnsightLogin {
	
	@AfterClass
	public void query() {
		
		
		driver.findElement(By.id("txtTwSrch")).sendKeys("\\\"Saidapora\\\" OR \\\"TRF\\\" OR \\\"Saidapora Attack\\\" OR \\\"Eidgah Attack\\\"");
	    driver.findElement(By.id("searchTweet")).click();
		
	    
	    
	}

}
