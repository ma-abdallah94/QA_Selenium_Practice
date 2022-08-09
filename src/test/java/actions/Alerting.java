package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerting {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/alert.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("/html/body/div[1]/button[2]")).click();
        driver.switchTo().alert().sendKeys("babybaby");
        driver.switchTo().alert().accept();

    }

}
