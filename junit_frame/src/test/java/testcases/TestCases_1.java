package testcases;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class TestCases_1 extends TestBase {

	@Test
	public void search_for_product() {
		driver.get(base_url);
		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actual = driver.getTitle();
		Assert.assertEquals("Page Title validation", expected, actual);

		WebDriverWait webDriverWait = new WebDriverWait(driver, 20);
		WebElement elementSearchBox = webDriverWait
				.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));

		elementSearchBox.sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@value='Go']")).click();

		WebDriverWait webDriverWait1 = new WebDriverWait(driver, 20);
		webDriverWait1.until(ExpectedConditions.titleIs("Amazon.in : Laptop"));

		Assert.assertEquals("Page Title validation", "Amazon.in : Laptop", driver.getTitle());
	}
}
