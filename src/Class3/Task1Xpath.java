package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.syntaxprojects.com");
        driver.findElement(By.xpath("//a[@id='btn_basic_example']")).click();
        driver.findElement(By.xpath("//a[@class='list-group-item']")).click();
    }
}
