package com.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindElementTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementsByCssTest() {

        driver.findElement(By.cssSelector(".search-box"));

        driver.findElement(By.cssSelector(".top-menu"));

        driver.findElement(By.cssSelector(".header-logo"));

        driver.findElement(By.cssSelector("[href^='/digital']"));

        driver.findElement(By.cssSelector("[href$='downloads']"));

    }

    @Test
    public void findElementByXpathTest() {

        driver.findElement(By.xpath("//*[@class='search-box']"));

        driver.findElement(By.xpath("//*[@class='top-menu']"));

        driver.findElement(By.xpath("//*[@class='header-logo']"));

        driver.findElement(By.xpath("//*[contains(.,'Tricentis Demo Web Shop')]"));

        driver.findElement(By.xpath("//*[contains(.,'Welcome to our store')]"));

    }

}
