package com.example.momsjobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class SeleniumWebDriverConfig {
    public WebDriver driver;
    public static String API_URL = "https://www.momlancers.com";
    public static String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver.exe";

    public SeleniumWebDriverConfig() {
        String PATH_DRIVER = System.getProperty("user.dir") + "\\driver\\windows\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", PATH_DRIVER);
        driver = new ChromeDriver();
    }

    public void closeWindow(){
        driver.quit();
    }
}
