package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class bilibiliTest {
	driver a = new driver();
	WebDriver wd;
@Test
  public void xpath() throws InterruptedException, IOException {
	  a.adriver.findElement(By.id("tv.danmaku.bili:id/tab_title")).click();
	  WebElement element = a.adriver.findElement(By.id("tv.danmaku.bili:id/image"));
//	  a.adriver.tap(1, element, 3000);
	  element.click();
	  Thread.sleep(6000);
	  a.adriver.context("WEBVIEW_tv.danmaku.bili:web");
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
	  System.out.println(a.adriver.getRemoteAddress());

//	  a.adriver.findElement(By.className("android.widget.ImageButton")).click();
//	 FileOutputStream wt = new FileOutputStream("/Users/gaya/Downloads/2.html") ;
//	 PrintStream p = new PrintStream(wt);
	 System.out.println(1);
	 System.out.println(a.adriver.getContext());
//	 p.print(a.adriver.getPageSource());

	 a.adriver.findElement(By.xpath("//div[@id='CustomClickArea']/div/a")).click();
	 System.out.println(1);
//	 p.close();
	  
  }
	@SuppressWarnings("deprecation")
	@Test
	public void swipTest() throws InterruptedException{
		a.adriver.findElement(By.id("tv.danmaku.bili:id/tab_title")).click();
		Thread.sleep(2000);
		int width = a.adriver.manage().window().getSize().width;
		int height = a.adriver.manage().window().getSize().height;
		System.out.println(width);
		System.out.println(height);
		for(int i=0;i<5;i++){
			Thread.sleep(500);
			a.adriver.swipe(width-10, height/2, 10, height/2, 2000);
		}
		System.out.println("finish");
	}
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  
//	  a.AnDriver("4.4", "192.168.56.101:5555", "/Users/gaya/Documents/App/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
//	  a.AnDriver("7.0", "192.168.56.101:5555", "/Users/gaya/Documents/App/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
//	  a.AnDriver("4.1", "192.168.56.102:5555", "/Users/gaya/Documents/App/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
	  a.AnDriver("5.0", "8cba2bb", "/Users/gaya/Documents/App/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
//	  a.AnDriver("7.1", "3487e851", "/Users/gaya/Documents/App/bili.apk", "tv.danmaku.bili", "tv.danmaku.bili.MainActivity");
  }

  @AfterClass
  public void afterClass() {
	  a.adriver.closeApp();
	  a.adriver.quit();
  }

}
