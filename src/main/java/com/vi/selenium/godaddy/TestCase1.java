/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vi.selenium.godaddy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author VI
 */
public class TestCase1 {

    /*
    Steps to Automate:
    1. Launch browser of your choice say., Firefox, chrome etc.
    2. Open this URL - https://www.godaddy.com/
    3. Close browser.
     */
    public static void main(String[] args) throws InterruptedException {
        String driverPath = "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.godaddy.com/");
       
        Thread.sleep(10000);
        driver.quit();
    }
}
