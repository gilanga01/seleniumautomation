package
faceBookTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestNG{
public WebDriver driver;
@Test(priority =-1)
public void f() {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();
}
 @Test(priority = 0)
public void launchBrowser() {
String expectedTitle = "Online Professional Training Courses and Certification - Intellipaat";
driver.get("https://www.intellipaat.com/");
String actualTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectedTitle);
}

@Test(dependsOnMethods = {"launchBrowser"}, priority =3)

public void closeBrowser() {

 

driver.quit();

}}
