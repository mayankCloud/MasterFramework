package com.tmb.driver;

import com.tmb.driver.manager.ChromeManager;
import com.tmb.driver.manager.FirefoxManager;
import com.tmb.enums.BrowserType;
import com.tnb.config.ConfigFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }

    public static WebDriver getDriver() {
        WebDriver driver = null;
        if (isBrowserChrome()) {
            driver = ChromeManager.getDriver();
        } else {
            driver = FirefoxManager.getDriver();
        }
        return driver;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser().equals(BrowserType.CHROME);
    }
}
