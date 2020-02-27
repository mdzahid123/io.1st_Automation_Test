import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.jvm.hotspot.utilities.soql.JSJavaVM;

public class HomePage {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/mdahsanzahid/IdeaProjects/io.1st_Automation_Test/Driver/chromedriver 3");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.kennedyrealtyinc.com/");

        driver.findElement( By.id("QSCriteria")).sendKeys("11204");
        driver.findElement(By.id("QSSubmit")).click();

        driver.quit();

    }
}
