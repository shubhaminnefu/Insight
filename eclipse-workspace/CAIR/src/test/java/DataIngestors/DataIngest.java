package DataIngestors;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class DataIngest extends InnsightLogin {

	@AfterClass
	public void DataIn() throws InterruptedException, AWTException {

		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("modi");
		driver.findElement(By.cssSelector("span#searchTweet")).click();
		driver.findElement(By.cssSelector("a#twDashboard")).click();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		;
		driver.findElement(By.id("email")).sendKeys("testingq23@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Innefu@123");
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(30000);

		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/div[1]/ul/li[2]/div/a/div[1]/div[1]/img"))
				.click();
		Thread.sleep(3000);
		driver.quit();

	}



@Test(priority =1)
public void Geographicallyboundpolygon() {
	
	
}


@Test(priority =2)

public void Multiplekeywords() {
	
	
}


@Test(priority =3)

public void MultipleSocialMediaHandles() {
	
	
}
}
