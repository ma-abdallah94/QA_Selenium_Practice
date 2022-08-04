package findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findByCLASS {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\index.html");
        String testClass = driver.findElement(By.className("web")).getText();
        System.out.println(testClass);
        driver.close();

    }

}
