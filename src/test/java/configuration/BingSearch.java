package configuration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;


public class BingSearch {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.bing.com");
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("Grzegorz brzęczyszczykiewicz");
        element.submit();
        driver.quit();
    }
}