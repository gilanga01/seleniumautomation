package
faceBookTest;
import org.testng.annotations.AfterTest;
import
org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class FacebookTestNG {
@BeforeTest
public void setUp() {
System.out.println("setup completed");
}
@Test
public void logIn() {
System.out.println("login executed successfully");
}
@Test
public void signUp() {
System.out.println("sign up executed successfully");
}
@AfterTest
public void teardown() {
System.out.println("test completed successfully");
}
}