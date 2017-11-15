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
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/gaya/Documents/selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("chrome://settings/");
//		driver.findElement(By.id("start-stop-sync")).click();
//		driver.findElement(By.xpath("//*[@id='help']/button")).click();
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//*[@id='help']/button")).click();
		driver.switchTo().frame("settings");
		driver.findElement(By.id("start-stop-sync")).click();
//		System.out.println(driver.getWindowHandles());
	}

	@AfterClass
	public static void clos(){
//		driver.close();
//		driver.quit();
	}
}
