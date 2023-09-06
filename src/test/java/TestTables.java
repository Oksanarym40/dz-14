import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestTables {
    public static void main(String[] args) {

        System.setProperty("web-driver.chrome.driver", "C:\\Users\\rymar\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();


        driver.get("https://demoqa.com/webtables");


        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();


        WebElement firstNameInput = driver.findElement(By.id("firstName"));
        firstNameInput.sendKeys("Oksana");

        WebElement lastNameInput = driver.findElement(By.id("lastName"));
        lastNameInput.sendKeys("Rymaruk");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("email@oksana.com");

        WebElement ageInput = driver.findElement(By.id("age"));
        ageInput.sendKeys("41");

        WebElement salaryInput = driver.findElement(By.id("salary"));
        salaryInput.sendKeys("41000");

        WebElement departmentInput = driver.findElement(By.id("department"));
        departmentInput.sendKeys("IT");

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        WebElement addedRecord = driver.findElement(By.xpath("//div[contains(text(), 'Oksana')]"));
        if (addedRecord.isDisplayed()) {
            System.out.println("Запис додався успішно.");
        } else {
            System.out.println("Запис не було додано.");
        }

        driver.manage().window().maximize();

        WebElement editButton = driver.findElement(By.id("edit-record-4"));
        editButton.click();

        WebElement ageEditInput = driver.findElement(By.id("age"));
        ageEditInput.clear();
        ageEditInput.sendKeys("31");

        WebElement saveButton = driver.findElement(By.id("submit"));
        saveButton.click();


        WebElement editedRecord = driver.findElement(By.xpath("//div[contains(text(), '31')]"));
        if (editedRecord.isDisplayed()) {
            System.out.println("Запис було відредаговано успішно.");
        } else {
            System.out.println("Запис не було відредаговано.");
        }


        driver.quit();
    }
}
