package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest01 {

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("deviceName","Pixel2");
        desiredCapabilities.setCapability("platformVersion","10.0");
        //desiredCapabilities.setCapability("app","C:\\Users\\Eda\\Team104Appium\\src\\test\\java\\applications\\Calculator_8.4 (503542421)_Apkpure.apk");
        desiredCapabilities.setCapability("app","C:\\Users\\Eda\\Team104Appium\\src\\test\\java\\applications\\trendyol-6-30-5-693.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities) ;
    }

    @Test
    public void test01(){

    }
}
