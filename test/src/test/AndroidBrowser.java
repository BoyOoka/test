package test;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class AndroidBrowser {
//	WebDriver driver;
	AppiumDriver<WebElement> driver;
  @Test
  public void f() {
	  driver.get("https://www.baidu.com");
	  driver.findElement(By.id("index-kw")).sendKeys("appiumËÑË÷");
	  driver.findElement(By.id("index-bn")).click();
  }
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"3487e851");
//    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"8cba2bb");
      capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Browser");
//      capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0.2");
    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
      capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
      
//      capabilities.setCapability("app", "Browser");
//      capabilities.setCapability("appPackage", "com.android.browser");
//      capabilities.setCapability("appActivity", ".BrowserActivity");
      
//      driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
      	driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
  }

  @AfterClass
  public void afterClass() {
  }

}
