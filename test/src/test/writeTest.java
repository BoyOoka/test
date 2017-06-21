package test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class writeTest {
	public static void main(String[] args) throws IOException{
		FileOutputStream wd = new FileOutputStream("/Users/gaya/Downloads/1.html");
		PrintStream p = new PrintStream(wd);
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver", "/Users/gaya/Documents/selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://live.bilibili.com/AppBanner/index?id=525");
//		p.print(driver.getPageSource());
		driver.findElement(By.xpath("//div[@id='CustomClickArea']/div/a")).click();
		driver.close();
//		driver.quit();
	}

}
