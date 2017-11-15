package test;

import static org.junit.Assert.fail;

import java.net.URL;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class jianai {
	AndroidDriver driver;
	@Before
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.56.101:5555");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.APP, "/Users/gaya/Downloads/app-release.apk_1.0.apk");
		
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, true);
		
		capabilities.setCapability("appPackge", "com.wenwei.sharebox");
//		capabilities.setCapability("appActivity", "com.wenwei.sharebox.activity.GuideActivity");
//		capabilities.setCapability("appActivity", "com.wenwei.sharebox.activity.SplashActivity");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	}

	@After
	public void tearDown() throws Exception {
//		driver.closeApp();
//		driver.quit();
//		driver.removeApp("com.wenwei.sharebox");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void guid() throws InterruptedException {
		Capabilities s = driver.getCapabilities();
		System.out.println(s);
		int width =driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		System.out.println(width+","+height);
		Thread.sleep(2000);
		driver.swipe(width-10, height/2, width/2, height/2, 500);
		Thread.sleep(1000);
		System.out.println(1);
		driver.swipe(width-10, height/2, width/2, height/2, 500);
		Thread.sleep(2000);
//		driver.swipe(width-10, height/2, width/2, height/2, 500);
		driver.tap(1, height/2, width/2, 500);
	}

}
