package Class2.Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBTask {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("S");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("A");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("Sarahangel.001@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Sarahangel.001@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Ghk001@123");
        Thread.sleep(2000);
        driver.findElement(By.id("month")).sendKeys("Feb");
        Thread.sleep(2000);
        driver.findElement(By.id("day")).sendKeys("25");
        Thread.sleep(2000);
        driver.findElement(By.id("year")).sendKeys("1998");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='2']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("reg_error_inner")).getText());
        driver.findElement(By.xpath("//input[@autocomplete='one-time-code']")).sendKeys("43432");
        driver.findElement(By.xpath("//div[@role='button']")).click();
    }
}
