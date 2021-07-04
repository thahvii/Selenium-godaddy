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
public class TestCaseFinal {

    /*
    Steps to Automate:
1. Launch browser of your choice say., Firefox, chrome etc.
2. Open this URL - https://www.godaddy.com/
3. Maximize or set size of browser window.
4. Get Title of page and validate it with expected value.
5. Get URL of current page and validate it with expected value.
6. Get Page source of web page.
7. And Validate that page title is present in page source.
8. Close browser.
    
     */

    public static void main(String[] args) {
        String driverPath = "chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.godaddy.com");
        Dimension d = new Dimension(700, 1000);
        driver.manage().window().setSize(d);
        //get Title
        driver.getTitle();

        //validate expected value Title
        String pageTitle = driver.getTitle();
        if ("Tên miền, Website, Công cụ Lưu trữ & Tiếp thị trực tuyến - GoDaddy VN".equals(pageTitle)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        //Validate expected value URL
        String pageURL = driver.getCurrentUrl();
        if ("https://vn.godaddy.com/".equals(pageURL)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        //Get pageSource
        String pageSource = driver.getPageSource();

        //Validate that page title is present in page source.
        if (pageSource.contains(pageTitle)) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        // Navigate Forward (điều hướng trang tới)
        driver.navigate().forward();

        // Navigate Back (điều hướng trang quay lại)
        driver.navigate().back();

        // Refresh Page
        driver.navigate().refresh();
        
        // Naviagte directly to some URL
        driver.navigate().to("https://www.techlistic.com/p/java.html");
    }

}
