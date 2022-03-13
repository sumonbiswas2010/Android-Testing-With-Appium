package com.example.whatsapp;

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
        caps.setCapability("appPackage", "com.whatsapp");
        caps.setCapability("appActivity", ".Main");
        AndroidDriver driver=new AndroidDriver<AndroidElement>(new URL(
                "http://127.0.0.1:4723/wd/hub"), caps);


        MobileElement el3 = (MobileElement) driver.findElementById("com.whatsapp:id/eula_accept");
        el3.click();
        Thread.sleep(2000);

        MobileElement e20 = (MobileElement) driver.findElementById("com.whatsapp:id/registration_cc");
        e20.clear();
        e20.sendKeys("880");
        Thread.sleep(2000);
        MobileElement el4 = (MobileElement) driver.findElementById("com.whatsapp:id/registration_phone");
        el4.sendKeys("1935640880");
        Thread.sleep(2000);
        MobileElement el5 = (MobileElement) driver.findElementById("com.whatsapp:id/registration_submit");
        el5.click();
        Thread.sleep(2000);
        MobileElement el6 = (MobileElement) driver.findElementById("android:id/button1");
        el6.click();
//        Thread.sleep(2000);
//        Scanner sc = new Scanner(System.in);
//        String otp = sc.nextLine();
//        MobileElement el7 = (MobileElement) driver.findElementById("com.whatsapp:id/verify_sms_code_input");
//        el7.sendKeys(otp);
//        Thread.sleep(2000);
//        MobileElement el8 = (MobileElement) driver.findElementById("com.whatsapp:id/submit");
//        el8.click();
//        MobileElement el9 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//        el9.click();
//        MobileElement el10 = (MobileElement) driver.findElementById("com.android.packageinstaller:id/permission_allow_button");
//        el10.click();
//        MobileElement el11 = (MobileElement) driver.findElementById("com.whatsapp:id/registration_name");
//        el11.sendKeys("Sumon Biswas");
//        MobileElement el12 = (MobileElement) driver.findElementById("com.whatsapp:id/register_name_accept");
//        el12.click();

    }
}
