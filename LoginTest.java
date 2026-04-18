package com.cab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Open Cab Booking Website (Uber Example)
        driver.get("https://www.uber.com/");

        // Maximize Window
        driver.manage().window().maximize();

        Thread.sleep(5000);

        // Click Login Button (may change based on website)
        WebElement loginButton = driver.findElement(By.linkText("Log in"));
        loginButton.click();

        Thread.sleep(8000);

        System.out.println("Login Page Opened Successfully");

        // Close Browser
        driver.quit();
    }
}