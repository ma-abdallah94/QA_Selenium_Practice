package urlOpening;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currentURL {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.get("https://selenium.dev/");
        String currentURL = driver.getCurrentUrl() ;
        String title = driver.getTitle();
        System.out.println("el url delwa2ty : " +currentURL);
        System.out.println("title is : "+title);
    }
}
