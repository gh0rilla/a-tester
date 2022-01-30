package selectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main02 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hotel-testlab.coderslab.pl/en/ ");

        // Zadanie1
        //(pole tekstowe) Hotel Location
        //(przycisk) Search Now
        //(pole tekstowe) Enter Your e-mail (pole na dole stron)
        driver.findElement(By.name("hotel_location")).sendKeys("warsaw");

        WebElement searchNowButton = driver.findElement(By.name("search_room_submit"));

        WebElement newsletterEmailInput = driver.findElement(By.name("email"));
        newsletterEmailInput.sendKeys("test@test");
        searchNowButton.click();


    }
}
