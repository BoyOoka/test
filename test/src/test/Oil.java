package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Oil {
	AppiumDriver<WebElement> driver;
 @SuppressWarnings("deprecation")
@Test(priority=1)
 public void start() throws InterruptedException {
	 int width = driver.manage().window().getSize().width;
	 int height = driver.manage().window().getSize().height;
	 Thread.sleep(1500);
	 driver.swipe(width-5, height/2, width/2, height/2, 500);
	 Thread.sleep(800);
	 driver.swipe(width-5, height/2, width/2, height/2, 500);
	 driver.findElement(By.id("com.boyuda.youguanjia:id/startHome_btn")).click();
	 Set<String> s = driver.getContextHandles();
	 System.out.println(s);
//	 driver.context("WEBVIEW_stetho_com.erejcoach.app:pushcore");
//	 driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
	 
 }
  @Test(priority=2)
  public void login() {
	  driver.findElement(By.id("")).sendKeys("");
  }
  @Test(priority=3)
  public void singleOilBuy() {
	  
  }
  @BeforeClass
  public void beforeClass() {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "192.168.56.101:5555");
	  capabilities.setCapability(MobileCapabilityType.APP, "/Users/gaya/Documents/App/oil.apk");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
//	  capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
	  capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	  capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
	  
	  capabilities.setCapability("appPackge", "com.boyuda.youguanjia");
	  capabilities.setCapability("appActivity", "com.boyuda.youguanjia.activity.MainActivity");
	  
	  
	  try {
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	} catch (MalformedURLException e) {

		e.printStackTrace();
	}
  }

  @AfterClass
  public void afterClass() {
	  driver.closeApp();
	  driver.close();
  }

}
