package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class actionn {

    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\index.html");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);
        WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable-1\"]"));
        WebElement dest = driver.findElement(By.xpath("/html/body/div[7]/div[2]"));
        act.clickAndHold(source).moveToElement(dest).build().perform();


        // act.dragAndDrop(source , dest ).perform();
        //act.contextClick(driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[1]/span"))).perform();
        //act.contextClick(driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[1]/span"))).perform();
        //driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]")).click();
        //driver.close();

    }

}
