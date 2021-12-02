package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrder {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Sarah");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Angel");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("Sarahangel.001@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Sarahangel.001@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Ghk001@123");
        Thread.sleep(2000);
        driver.findElement(By.id("month")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("sex")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.name("birthday_age")).sendKeys("24");
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("_42ft _4jy0 layerConfirm _2rsa uiOverlayButton _4jy3 _4jy1 selected _51sy")).click();



    }
}
