package test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class driver {
	AndroidDriver<WebElement> adriver;
	IOSDriver<WebElement> idriver;
	RemoteWebDriver remoteWebDriver;
	
	void IosDriver(String platform_version,String device_name,String appPath) throws MalformedURLException{
		DesiredCapabilities icapabilities = new DesiredCapabilities();	
		icapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_version);
		icapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		icapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
		icapabilities.setCapability(MobileCapabilityType.APP, appPath);
		icapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		
		idriver = new IOSDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), icapabilities);
	}
	void AnDriver(String platform_version,String device_name,String appPath,String appPackge,String appActivity) throws MalformedURLException{
		DesiredCapabilities acapabilities = new DesiredCapabilities();
		acapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_version);
		acapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		acapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
//		acapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Selendroid");
		acapabilities.setCapability(MobileCapabilityType.APP, appPath);
		acapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
//		acapabilities.setCapability("noSgin", false);
		acapabilities.setCapability("appPackge",appPackge );
		acapabilities.setCapability("appActivity", appActivity);
		adriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), acapabilities);
//		adriver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), acapabilities);
	
	}
	void remoteDriver(String platform_version,String device_name,String appPath,String appPackge,String appActivity) throws MalformedURLException{
	DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, platform_version);
	desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device_name);
	desiredCapabilities.setCapability(MobileCapabilityType.APP, appPath);
	desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, true);
	desiredCapabilities.setCapability("appPackge",appPackge );
	desiredCapabilities.setCapability("appActivity", appActivity);
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	remoteWebDriver = new RemoteWebDriver(url, desiredCapabilities);
	}
	public void Screenshot(AndroidDriver<WebElement> driver,String ScreeName) throws IOException{
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd-HH-mm-ss");
		String dateString = formatter.format(new Date());
		String dir_name = System.getProperty("user.dir")+"/“Ï≥£Õº∆¨";
		System.out.println("Ωÿ¡À∏ˆÕº"+dir_name);
		if(!(new File(dir_name).exists())){
			new File(dir_name).mkdir();
		}
		File Screen = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screen, new File(dir_name+"/"+dateString+ScreeName+".jpg"));
	}
	
}
class test{
	int add(){
		int G,H=0,I=0;
		G = H + I;
		return G;
	}
	
}
