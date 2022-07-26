package urlOpening;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getFile {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("file://C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\index.html");
    }
}
