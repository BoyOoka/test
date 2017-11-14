package test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class openIosApp {
	static AppiumDriver<WebElement> driver;
	String a, b;
	int expected;
	
	@Test
	public void testCalc() throws MalformedURLException {
		a = "23";
		b = "45";
		int c = Integer.parseInt(a,10);
		int d = Integer.parseInt(b,10);
		expected = c + d;
		WebElement text1 = driver.findElement(By.xpath("//UIATextField[1]"));
		WebElement text2 = driver.findElement(By.xpath("//UIATextField[2]"));
		text1.sendKeys(a);
		text2.sendKeys(b);
		driver.findElement(By.xpath("//UIAButton[1]")).click();
		String anwser = driver.findElement(By.xpath("//UIAStaticText[1]")).getText();
		int actual = Integer.parseInt(anwser, 10);
		assertEquals(expected, actual);
	}
	@Test
	public void testAlert(){
		driver.findElement(By.xpath("//UIAButton[2]")).click();
		Alert alert = driver.switchTo().alert();
		String alertText =  alert.getText();
//		System.out.println(alertText);
		assertEquals("Cool title this alert is so cool.", alertText);
		alert.accept();
		
	}
	@SuppressWarnings("deprecation")
	@Test
	public void testSwip(){
		driver.swipe(150, 288, 92, 288, 500);
		driver.swipe(92,288,209,288,500);
		
	}
	
	@BeforeClass
	static public void beforeTest() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.1");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 5s");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
//		capabilities.setCapability(MobileCapabilityType.APP, "/Users/gaya/Documents/sample-code-master/sample-code/apps/TestApp/build/release-iphonesimulator/TestApp.app");
//		capabilities.setCapability(MobileCapabilityType.APP, "/Users/gaya/Documents/App/TestApp.app");
		capabilities.setCapability("bundleId", "io.appium.TestApp.gaya");
		capabilities.setCapability(MobileCapabilityType.UDID, "8dd241eb3c7103b23be2c9e94844b8e5e9754c67");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 5000);
		driver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		
//		(new TouchAction(driver)).tap(462, 322).perform();
//		(new TouchAction(driver)).tap(314, 198).perform();

	}
	@AfterClass
	static	public void afterTest(){
		driver.closeApp();
		driver.quit();
	
	}

}
