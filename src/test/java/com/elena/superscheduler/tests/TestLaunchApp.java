package com.elena.superscheduler.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLaunchApp extends TestBase{
    @Test
    public void testLaunch(){
        String version = app.getVersion();
        System.out.println("OK Launched version: " + version);
        Assert.assertEquals(version, "0.0.3");
    }
}
