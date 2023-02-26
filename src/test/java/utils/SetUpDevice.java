package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class SetUpDevice {

    static   DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    public static void trendyolSetUp() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "Pixel2");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("app", "C:\\Users\\Eda\\Team104Appium\\src\\test\\java\\applications\\trendyol-6-30-5-693.apk");
    }

    public static void hepsiburadaSetUp() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "Pixel2");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("app", "C:\\Users\\Eda\\Team104Appium\\src\\test\\java\\applications\\hepsiburada-5-7-1.apk");

    }

    public static void calculatorSetUp() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "Pixel2");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("app", "C:\\Users\\Eda\\Team104Appium\\src\\test\\java\\applications\\Calculator_8.4 (503542421)_Apkpure.apk");
    }

    public static void amazonSetUp() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "Pixel2");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("app", "C:\\Users\\Eda\\Team104Appium\\src\\test\\java\\applications\\amazon.apk");
    }
    public static AndroidDriver<AndroidElement> getDriver() {
        AndroidDriver<AndroidElement> driver = null;
        try {

            desiredCapabilities.setCapability("automationName", "UiAutomator2");
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("deviceName", "Pixel2");
            desiredCapabilities.setCapability("platformVersion", "10.0");
            desiredCapabilities.setCapability("app", "C:\\Users\\Eda\\Team104Appium\\src\\test\\java\\applications\\hepsiburada-5-7-1.apk");
            driver = new AndroidDriver(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return driver;
    }
}