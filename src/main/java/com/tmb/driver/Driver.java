package com.tmb.driver;

import com.tmb.enums.BrowserType;
import com.tnb.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    public static void initDriver(){
        LocalDriverFactory.getDriver();
        driver.get("https://www.google");
    }
    public static void quitDriver(){
        driver.quit();
    }
}
