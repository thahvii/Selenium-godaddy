/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vi.selenium.godaddy;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author VI
 */
public class TestCase3 {

    /*
    Steps to Automate:
1. Launch browser of your choice say., Firefox, chrome etc.
2. Open this URL - https://www.godaddy.com/
3. Maximize or set size of browser window.
4. Get Title of page and print it.
5. Close browser.
     */
    public static void main(String[] args) throws InterruptedException {
        String driverPath = "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.godaddy.com/");
        Dimension d = new Dimension(500, 1000);
        driver.manage().window().setSize(d);
        System.out.println("Title of page: " + driver.getTitle());
        Thread.sleep(10000);
        driver.quit();
    }
}
