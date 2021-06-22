package DataIngestors;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class AvatarCrawling extends InnsightLogin {

	@AfterClass
	public void avatar() throws Exception {
		driver.findElement(By.cssSelector("input#txtTwSrch")).sendKeys("modi");
		driver.findElement(By.cssSelector("span#searchTweet")).click();
		driver.findElement(By.xpath("/html/body/form/div/header/div[2]/ul/li[13]")).click();

		System.out.println("************************");
		Thread.sleep(6000);
		System.out.println(driver.getCurrentUrl());
		String currentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		ArrayList<String> obj = new ArrayList<>(allwindow);
		driver.switchTo().window(obj.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.findElement(
				By.xpath("//mat-expansion-panel-header[@id='mat-expansion-panel-header-1']/span/mat-panel-title/span"))
				.click();

		driver.findElement(By.xpath("//div[@id='cdk-accordion-child-1']/div/ul/li[2]/button")).click();
		driver.findElement(By.id("mat-input-1")).sendKeys("Avatar");
		driver.findElement(By.id("mat-input-2")).sendKeys("next");
		driver.findElement(By.id("mat-input-3")).sendKeys("next generation avatar");
		driver.findElement(By.id("mat-input-4")).sendKeys("Innefu@123");
		driver.findElement(By.id("mat-input-5")).sendKeys("innefu@innefu.com");
		driver.findElement(By.id("mat-input-6")).sendKeys("99663344");
		driver.findElement(By.xpath("//mat-select[@id='mat-select-12']/div/div[2]")).click();
		driver.findElement(By.xpath("//mat-option[@id='mat-option-15']/span")).click();
		driver.findElement(By.xpath("//div[@id='mat-select-value-15']/span")).click();
		driver.findElement(By.xpath("//mat-option[@id='mat-option-475']/span")).click();
		driver.findElement(By.xpath("//mat-select[@id='mat-select-16']/div/div[2]/div")).click();
		driver.findElement(By.xpath("//mat-option[@id='mat-option-497']/span")).click();
		driver.findElement(By.id("mat-input-7")).sendKeys("test");
		driver.findElement(
				By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Description'])[1]/following::span[2]"))
				.click();
		driver.findElement(By.xpath("//mat-dialog-container[@id='mat-dialog-1']/app-confirm-dialog/div[2]/button/span"))
				.click();
		driver.findElement(
				By.xpath("//mat-dialog-container[@id='mat-dialog-2']/app-confirm-dialog/div[2]/button[2]/span"))
				.click();
	}

}
