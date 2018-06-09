package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class change {
	AppiumDriver<WebElement> driver;
  @Test
  public void f() throws InterruptedException {
//	  driver.findElement(By.id("com.bianla.app:id/input_phone_et")).sendKeys("Phone_number");
	  Thread.sleep(9000);
	  driver.findElement(By.id("com.bianla.international.test:id/dialog_data_synchronization_btn_confirm")).click();
	  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.ImageView")).click();
	  Thread.sleep(10000);
	  driver.findElement(By.id(""));
	  
	  System.out.println(driver.getContextHandles());
	  driver.context("WEBVIEW_com.bianla.international.test");
	  System.out.println(driver.getCurrentUrl());
	  
	  
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  File file = new File("");
	  String path = file.getAbsolutePath();
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "3487e851");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Andriod");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
	  capabilities.setCapability(MobileCapabilityType.APP, path+"/app/blidev.apk");
	  capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
	  
	  capabilities.setCapability("appPackge", "com.bianla.international.test");
//	  capabilities.setCapability("appActivity", "com.bianla.international.activity.StartActivity");
	  
	  driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
  }

}
