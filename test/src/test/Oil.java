package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	 System.out.println(width+","+height);
	 Thread.sleep(1500);
	 driver.swipe(width-5, height/2, width/2, height/2, 500);
	 Thread.sleep(800);
	 driver.swipe(width-5, height/2, width/2, height/2, 500);
	 driver.findElement(By.id("com.boyuda.youguanjia:id/startHome_btn")).click();
	 
 }
  @Test(priority=2)
  public void login() {
	  driver.findElement(By.id("com.boyuda.youguanjia:id/editText_login_userId")).clear();
	  driver.findElement(By.id("com.boyuda.youguanjia:id/editText_login_userId")).sendKeys("川R100003");
	  driver.findElement(By.id("com.boyuda.youguanjia:id/editText_login_userPwd")).clear();
	  driver.findElement(By.id("com.boyuda.youguanjia:id/editText_login_userPwd")).sendKeys("123456");
	  driver.findElement(By.id("com.boyuda.youguanjia:id/login_btn")).click();
  }
  @SuppressWarnings("deprecation")
@Test(priority=3)
  public void singleOilBuy() {
//	  WebElement showClose = new AndroidDriverWait(driver, 60)
//              .until(new ExpectedCondition<WebElement>() {
//                  public WebElement apply(AndroidDriver d) {
//                      return d.findElement(By
//                              .id("com.boyuda.youguanjia:id/home_notify_close"));
//                  }
//              });
	  Set<String> s = driver.getContextHandles();
		 System.out.println(s);
	  driver.findElement(By.id("com.boyuda.youguanjia:id/home_notify_close")).click();
	  //进入一键购油页面
//	  Actions action = new Actions(driver);
	  driver.tap(1, 693, 1149, 500);
//	  driver.findElement(By.id("com.boyuda.youguanjia:id/my_btn")).click();
	  driver.findElement(By.id("com.boyuda.youguanjia:id/homePage_btn")).click();
	  driver.findElement(By.id("com.boyuda.youguanjia:id/home_place_btn")).click();
//	  driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.ImageView")).click();
	  //选择油品
	  //98号
	  driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.ImageView")).click();
	  //购买数量
	  driver.findElement(By.id("com.boyuda.youguanjia:id/place_pop_edit_oil_num")).clear();
	  driver.findElement(By.id("com.boyuda.youguanjia:id/place_pop_edit_oil_num")).sendKeys("11");
	  //加入购物车
	  driver.findElement(By.id("com.boyuda.youguanjia:id/place_pop_add_oil_btn")).click();
	  //提交结算
	  driver.findElement(By.id("com.boyuda.youguanjia:id/submit_order_place")).click();
	  //提交订单
	  driver.findElement(By.id("com.boyuda.youguanjia:id/submit_order_place")).click();
	  //选择支付方式
//	  driver.findElement(By.id("com.boyuda.youguanjia:id/paid_type_select_radio")).click();
	  driver.findElement(By.xpath("//android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[8]/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ImageView")).click();
	  //支付
	  driver.findElement(By.id("com.boyuda.youguanjia:id/select_paid_type_pay_btn")).click();
	  //确认支付
	  driver.findElement(By.id("com.boyuda.youguanjia:id/payment_pop_confirm")).click();
	  //查看订单
	  driver.findElement(By.id("com.boyuda.youguanjia:id/see_order_btn")).click();
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
	  capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
	  capabilities.setCapability("unicodeKeyboard", "true");
	  capabilities.setCapability("resetKeyboard", "true");
	  
	  capabilities.setCapability("appPackge", "com.boyuda.youguanjia");
	  capabilities.setCapability("appActivity", "com.boyuda.youguanjia.activity.MainActivity");
	  
	  
	  try {
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	} catch (MalformedURLException e) {

		e.printStackTrace();
	}
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.closeApp();
  }

}
