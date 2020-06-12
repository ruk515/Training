import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test           // <<< add annotation.
    public void searchGoogle() throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // initialize driver
        driver.get("http:google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Chromedriver download");
        searchBox.submit();

        Thread.sleep(3000);
        driver.quit();





    }
}
