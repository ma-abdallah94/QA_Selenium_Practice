package findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class findByXPATH {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\index.html");
        String testClass = driver.findElement(By.xpath("//ul[@class='country-list']/li[2]")).getText();
        // String testClass = driver.findElement(By.xpath("//html/body/ul[2]/li[2]")).getText();
        System.out.println(testClass);
        driver.close();

    }

}
