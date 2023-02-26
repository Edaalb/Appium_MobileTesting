package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

import static utilities.SetUpDevice.getDriver;

public class Pages {

    private static AndroidElement searchBoxMainPageHepsiburada =
            getDriver().findElementById("com.pozitron.hepsiburada:id/etSearchBox");

    public static void searchBoxSendKeys(String text) {
        searchBoxMainPageHepsiburada.sendKeys(text);
    }


}
