package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static utilities.SetUpDevice.getDriver;
import static utilities.SetUpDevice.trendyolSetUp;

public class AppiumTest02 {

    @Test
    public void testAppium2() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "Pixel2");
        desiredCapabilities.setCapability("platformVersion", "10.0");
        desiredCapabilities.setCapability("app", "C:\\Users\\Eda\\Team104Appium\\src\\test\\java\\applications\\hepsiburada-5-7-1.apk");
        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        AndroidElement searchbox = (AndroidElement) driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox"));
        searchbox.click();
        driver.findElement(By.id("com.pozitron.hepsiburada:id/etSearchBox")).sendKeys("Computer");

    }
}
