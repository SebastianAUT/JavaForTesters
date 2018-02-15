package com.selenium.examples;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;

public class FirstTest {
    @Test
    public void sprawdzTytul(){

        System.setProperty("webdriver.chrome.driver","C:/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.pl");

        assertEquals("tytul zgadza sie","Google", driver.getTitle());
    }

}
