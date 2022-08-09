package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class multiFrame {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/frames.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.switchTo().frame("qacart");
        driver.findElement(By.xpath("/html/body/div/form/input[1]")).sendKeys("Mahmoud");
        driver.findElement(By.xpath("/html/body/div/form/input[2]")).sendKeys("Abdallah");
        WebElement drop = driver.findElement(By.xpath("//*[@id=\"level\"]"));
        Select sel = new Select(drop);
        sel.selectByVisibleText("Senior");
        driver.findElement(By.xpath("//*[@id=\"web\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"actions-button\"]")).click();
        driver.quit();


    }

}
