package test;
import test.driver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class bilibiliTest {
	//driver a = new driver();
	AppiumDriver<WebElement> driver;
	
@SuppressWarnings("deprecation")
@Test
  public void xpath() throws InterruptedException, IOException {
//	  a.adriver.findElement(By.id("tv.danmaku.bili:id/tab_title")).click();
//	  WebElement element = a.adriver.findElement(By.id("tv.danmaku.bili:id/image"));
//	  a.adriver.tap(1, element, 3000);
//	  element.click();
	  Thread.sleep(7000);
	  System.out.println(666);
	 // driver.findElement(By.id("tv.danmaku.bili:id/image")).click();
	  try {
//	   driver.tap(1, 100, 400, 1000);
	  }catch(Exception e) {
		  System.out.println(999);
		  Thread.sleep(7000);
	  }
	  Set<String> v  = driver.getContextHandles();
	  System.out.println(v);
	  Thread.sleep(7000);
	  driver.context("WEBVIEW_chrome");
	  driver.context("WEBVIEW_tv.danmaku.bili:web");
/*	  Set<String> contextSet = a.adriver.getContextHandles();
	  for(String context : contextSet ){
		  System.out.println(context);
		  if(context.contains("WEBVIEW_tv")){
			  a.adriver.context("WEBVIEW_tv.danmaku.bili:web");
//			  a.adriver.context(context);
			  System.out.println("1");
			  break;
		  }
	  }
	  */
	  System.out.println("NATIVE_APP_ok");

//	  a.adriver.findElement(By.className("android.widget.ImageButton")).click();
	 FileOutputStream wt = new FileOutputStream("/Users/gaya/Downloads/2.html") ;
	 PrintStream p = new PrintStream(wt);
	 System.out.println(1);
	 System.out.println(driver.getContext());
	 p.print(driver.getPageSource());

//	 a.adriver.findElement(By.xpath("//div[@id='CustomClickArea']/div/a")).click();
	 System.out.println(1);
//	 p.close();
	  
  }
/*
	@Test
	public void swipTest() throws InterruptedException{
//		driver.findElement(By.id("tv.danmaku.bili:id/tab_title")).click();
		Thread.sleep(2000);
		int width = driver.manage().window().getSize().width;
		int height = driver.manage().window().getSize().height;
		System.out.println(width);
		System.out.println(height);
		for(int i=0;i<5;i++){
			Thread.sleep(500);
			driver.swipe(width-10, height/2, 10, height/2, 2000);
		}
		System.out.println("finish");
	}
	*/
  @BeforeClass
  public void beforeClass() throws IOException {
	  File file = new File("");
	  String path = file.getAbsolutePath();
//	  a.AnDriver("4.4", "192.168.56.101:5555", path+"/app/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
//	  a.AnDriver("6.0", "192.168.56.101:5555", path+"/app/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
//	  a.AnDriver("4.1", "192.168.56.102:5555", path+"/app/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
//	  a.AnDriver("5.0", "8cba2bb", path+"/app/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
//	  a.AnDriver("7.1", "3487e851", path+"/app/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
//	  a.Screenshot(a.adriver, "异常图片");
			DesiredCapabilities acapabilities = new DesiredCapabilities();
			acapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
			acapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			acapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "3487e851");
//			acapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Selendroid");
			acapabilities.setCapability(MobileCapabilityType.APP, path+"/app/bili.apk");
			acapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
//			acapabilities.setCapability("noSgin", false);
			acapabilities.setCapability("appPackge","tv.danmaku.bili" );
//			acapabilities.setCapability("appActivity", "tv.danmaku.bili.MainActivity");
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), acapabilities);
  }

  @AfterClass
  public void afterClass() {
//	  driver.closeApp();
//	  driver.quit();
  }

}
