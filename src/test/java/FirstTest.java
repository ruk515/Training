import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test           // <<< add annotation.
    public void searchGoogle() throws InterruptedException {

        WebDriver driver = new ChromeDriver(); // initialize driver
        driver.get("http:google.com");

        Thread.sleep(1000);
        driver.quit();


    }
}
