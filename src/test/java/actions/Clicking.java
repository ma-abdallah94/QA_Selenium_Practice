package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Clicking {

    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V1/");
        //By csss = By.cssSelector(".course-list .list3");
        // String testClass = driver.findElement(csss).getText();
        // WebElement element = driver.findElement(csss);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("ma.abdallah94@ggmail.com");
        //driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("12233!@#");
        //driver.findElement(By.xpath("//html/body/div[7]/form/div/label/input")).click();
        //driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]")).click();
        //driver.close();

    }

}
