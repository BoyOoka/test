package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openBrowser {
	static WebDriver driver;
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver","/Users/gaya/Documents/selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("Hello Mac");
	}

	@AfterClass
	public static void clos(){
		driver.close();
		driver.quit();
	}
}
