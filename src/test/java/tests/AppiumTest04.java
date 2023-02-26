package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static utilities.SetUpDevice.amazonSetUp;
import static utilities.SetUpDevice.getDriver;

public class AppiumTest04 {

    @BeforeClass
    public void setUp() {
        amazonSetUp();
        getDriver();
    }

    @Test
    public void testAppium() {

    }
}
