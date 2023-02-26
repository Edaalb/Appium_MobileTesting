package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static utilities.SetUpDevice.calculatorSetUp;
import static utilities.SetUpDevice.getDriver;

public class AppiumTest03 {

    @BeforeClass
    public void beforeClass() {
        calculatorSetUp();
        getDriver();
    }

    @Test
    public void appiumTest03() {

    }
}
