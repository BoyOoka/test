package test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class bianla {
	AppiumDriver<WebElement> driver;
  @Test
  public void f() {
	  driver.tap(1, 520, 1479, 800);
	  driver.findElement(By.id("com.bianla.app:id/input_phone_et")).sendKeys("Phone_number");
	  driver.findElement(By.id("")).click();
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  File file = new File("");
	  String path = file.getAbsolutePath();
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "3487e851");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Andriod");
	  capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
	  capabilities.setCapability(MobileCapabilityType.APP, path+"/app/dev.apk");
	  capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
	  
	  capabilities.setCapability("appPackge", "com.bianla.app");
	  capabilities.setCapability("appActivity", "com.bianla.app.activity.LoginActivity");
	  
	  driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
  }

  @AfterClass
  public void afterClass() {
  }

}
