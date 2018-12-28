package com.macdonald.at.utils;

import com.github.webdriverextensions.internal.junitrunner.DriverPathLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class WebDriverUtils
{

    private static WebDriver webDriver;

    public static synchronized WebDriver getWebDriverInstance()
    {
        if(webDriver == null)
        {
            DriverPathLoader.loadDriverPaths(null);
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }


}
