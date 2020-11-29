package testcases;

import org.junit.Test;
import org.openqa.selenium.By;

import Base.TestBase;

public class TestCases_2 extends TestBase{

	@Test
	public void mobile()
	{
		driver.get(base_url);
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
		driver.findElement(By.cssSelector("#dealImage > div > div > div.a-row.layer.backGround")).click();
	}
}
