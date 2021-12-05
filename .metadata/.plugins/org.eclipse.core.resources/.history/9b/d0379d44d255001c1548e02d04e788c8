package DemoTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demotests {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

//setting the driver executable
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Drivers\\chromedriver.exe");

//Initiating your chromedriver
WebDriver driver=new ChromeDriver();

//open browser with desired URL
driver.get("https://www.safaricom.co.ke");
Thread.sleep(5000);
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,500)");
driver.findElement(By.linkText("Read more")).click();
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().refresh();
Thread.sleep(1000);
JavascriptExecutor jse1 = (JavascriptExecutor)driver;
jse1.executeScript("window.scrollBy(0,500)");








}

}