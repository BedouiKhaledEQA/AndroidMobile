package com.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class Base {
    public static AndroidDriver driver;
    public static Properties props =new Properties();
    public Base(){
        try {
            File file=new File("src/main/java/com/android/Properties/config.Properties");
            FileInputStream fis =new FileInputStream(file);
            props.load(fis);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void luncherWeb() throws MalformedURLException {
        DesiredCapabilities des =new DesiredCapabilities();
        des.setCapability(MobileCapabilityType.BROWSER_NAME,"CHROME");
        des.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy Tab A");
        WebDriverManager.chromedriver().setup();
        driver=new AndroidDriver(new URL(props.getProperty("AppiumLink")),des);
        driver.get(props.getProperty("url"));
    }
    public static void luncherApp() throws MalformedURLException {
        DesiredCapabilities DesC =new DesiredCapabilities();
        DesC.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        DesC.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        DesC.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy Tab A");
        DesC.setCapability(MobileCapabilityType.AUTOMATION_NAME,props.getProperty("androidAutomationName"));
        DesC.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.emc.activity");
        DesC.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.emc.activity.EMCTabletActivity");
        driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),DesC);

    }
}
