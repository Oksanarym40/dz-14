import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestButtons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rymar\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");


        WebElement buttonsTab = driver.findElement(By.xpath("//span[text()='Buttons']"));
        buttonsTab.click();


        Duration timeout = Duration.ofSeconds(10);


        WebDriverWait wait = new WebDriverWait(driver, timeout);


        WebElement clickMeButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        clickMeButton.click();


        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dynamicClickMessage")));
        String messageText = messageElement.getText();
        System.out.println("Текст повідомлення: " + messageText);


        driver.quit();
    }
}