package test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class openandroidApp {
	static AndroidDriver<WebElement> driver;
	@Test
	public void test() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.2");
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/gaya/Documents/AndroidApp/weibo.apk");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "8cba2bb");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "3487e851");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
	//	capabilities.setCapability(MobileCapabilityType., true);
		capabilities.setCapability("appPakage", "com.sina.weibo");
		capabilities.setCapability("appActivity", "com.sina.weibo.MainTabActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.view.View[1]")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.view.View[2]")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.view.View[3]")).click();
		driver.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.TabHost[1]/android.widget.LinearLayout[1]/android.view.View[4]")).click();
	}
	@AfterClass
	static public void close(){
		driver.closeApp();
		driver.quit();
	}

}
