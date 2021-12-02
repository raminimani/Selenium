package Class2.Task1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSignup {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");

        driver.findElement(By.name("customer.firstName")).sendKeys("Ramin");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.lastName")).sendKeys("Imani");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.address.street")).sendKeys("14567 Brocklyn St");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.address.city")).sendKeys("New York");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.address.state")).sendKeys("New York");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("23495");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("525-234-6786");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.ssn")).sendKeys("012-10-2432");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.username")).sendKeys("raminimani");
        Thread.sleep(2000);
        driver.findElement(By.name("customer.password")).sendKeys("Ghk004@12");
        Thread.sleep(2000);
        driver.findElement(By.name("repeatedPassword")).sendKeys("Ghk004@12");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("raminimani");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("Ghk004@12");
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();

    }
}
