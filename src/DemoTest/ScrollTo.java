package DemoTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollTo{
   public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\selenium\\Drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = "https://www.tutorialspoint.com/index.htm";
      driver.get(url);
     
      ((JavascriptExecutor) driver).executeScript("window.scrollTo(500, document.body.scrollHeight)");
      Thread.sleep(5000);
      driver.quit();
   }
}