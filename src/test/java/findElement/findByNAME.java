package findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class findByNAME {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\index.html");
        String testName = driver.findElement(By.name("courses")).getText();
        System.out.println(testName);
        driver.close();

    }

}
