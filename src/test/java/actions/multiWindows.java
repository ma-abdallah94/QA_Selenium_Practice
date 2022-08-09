package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Set;

public class multiWindows {

    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\maabd\\IdeaProjects\\QA_Selenium\\src\\test\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/windows.html");
        driver.manage().window().maximize();
        String parent = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        Actions act = new Actions(driver);
        driver.findElement(By.xpath("/html/body/div[1]/div/a[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        for(String window : allWindows) {
            if (!window.equalsIgnoreCase(parent)) {
                driver.switchTo().window(window);
                System.out.println(driver.getTitle());
                                                 }
            }



    }

}
