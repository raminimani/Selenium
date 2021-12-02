package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //for windows add extension.exe

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.Amazon.com/");

        String url=driver.getCurrentUrl();
        System.out.println("The current url is "+ url);

        String title=driver.getTitle();
        System.out.println("The Driver title is "+ title);
        driver.close();


    }
}
