package urlOpening;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageSource {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver() ;
        driver.manage().window().maximize();
        driver.get("https://selenium.dev/");
        String pageSource = driver.getPageSource();
        System.out.println("Page SOurce: "+pageSource);

    }
}
