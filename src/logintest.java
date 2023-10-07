
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logintest extends parameters{
	WebDriver driver= new ChromeDriver ();
	@BeforeTest
	public void myBeforeTest() {
		driver.get(websitUrl);
	}
	@Test()
	public void myTest() {
		WebElement logIn=driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
		logIn.click();
		WebElement loginEmail=driver.findElement(By.id("email"));
		loginEmail.sendKeys(signuptest.LoginEmail);
		WebElement loginPassword1=driver.findElement(By.id("pass"));
		loginPassword1.sendKeys(signuptest.loginPassword);
		WebElement sumbit2= driver.findElement(By.id("send2"));
		sumbit2.click();
		
	}
	@AfterTest
	public void myAfterTest() {}
}