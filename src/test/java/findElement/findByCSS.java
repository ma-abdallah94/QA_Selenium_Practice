package findElement;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class findByCSS {

    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\index.html");
        //By csss = By.cssSelector(".course-list .list3");
        // String testClass = driver.findElement(csss).getText();
        // WebElement element = driver.findElement(csss);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//*[@id=\"inputEmail\"]")).sendKeys("ma.abdallah94@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("12233!@#");
        driver.findElement(By.xpath("//html/body/div[7]/form/div/label/input")).click();
        driver.findElement(By.xpath("//html/body/div[7]/form/button")).click();
        driver.close();

    }

}
