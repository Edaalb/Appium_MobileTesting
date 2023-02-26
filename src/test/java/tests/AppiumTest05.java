package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static utilities.Pages.searchBoxSendKeys;
import static utilities.SetUpDevice.*;

public class AppiumTest05 {

    @BeforeClass
    public void setUp() {
        hepsiburadaSetUp();
        getDriver();
    }

    @Test
    public void testAppium() throws InterruptedException {
        Thread.sleep(3000);
        searchBoxSendKeys("Computer Dell");
    }
}
