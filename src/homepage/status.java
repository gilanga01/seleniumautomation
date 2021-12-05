package homepage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class status {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.safaricom.co.ke/personal/");
	driver.findElement(By.linkText("Value Added Services")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(1000);
	System.out.print("Back done...");
	driver.navigate().forward();
	Thread.sleep(1000);
	System.out.print("Foeward  done...");
	driver.navigate().refresh();
	Thread.sleep(1000);
	System.out.print("Refresh done...");
	driver.close();
	
	
	 
	
	}

}
