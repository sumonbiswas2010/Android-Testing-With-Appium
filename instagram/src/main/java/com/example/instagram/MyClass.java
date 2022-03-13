package com.example.instagram;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.net.MalformedURLException;

import java.net.URL;
import java.util.Scanner;


public class MyClass {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.instagram.android");
        caps.setCapability("appActivity", ".activity.MainTabActivity");
        AndroidDriver driver=new AndroidDriver<AndroidElement>(new URL(
                "http://127.0.0.1:4723/wd/hub"), caps);

        Thread.sleep(7000);
        MobileElement el1 = (MobileElement) driver.findElementById("com.instagram.android:id/sign_up_with_email_or_phone");
        el1.click();
        Thread.sleep(2000);
        MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Email");
        el2.click();
        Thread.sleep(2000);
        MobileElement el3 = (MobileElement) driver.findElementById("com.instagram.android:id/email_field");
        el3.sendKeys("sumonb30@gmail.com");
        Thread.sleep(2000);
        MobileElement el4 = (MobileElement) driver.findElementById("com.instagram.android:id/button_text");
        el4.click();


    }










}
