package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //for windows add extension.exe

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
        driver.navigate().to("https://www.Amazon.com");
        driver.navigate().back();
        driver.navigate().forward();

        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title=driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}
