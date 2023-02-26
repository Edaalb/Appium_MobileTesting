package tests;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {

    @Test
    public void app() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("deviceName","Pixel2");
        desiredCapabilities.setCapability("platformVersion","10.0");
        desiredCapabilities.setCapability("app", "");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);


        //id kullanilarak yapildi
        //9 tusuna tiklandi
        //  driver.findElementById("com.google.android.calculator:id/digit_9").click();

        //carpi isaretine tiklandi
        //  driver.findElementById("com.google.android.calculator:id/op_mul").click();
        //Thread.sleep(3000);
        //5 tusuna tiklandi


    }
}
