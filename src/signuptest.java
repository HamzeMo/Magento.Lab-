import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class signuptest extends parameters {
	WebDriver driver= new ChromeDriver ();
	 public static String LoginEmail;
	    public static String loginPassword;

	
	

	@BeforeTest
	public void myBeforeTest() {
		driver.get(websitUrl);
		

	}
	@Test()
	public void myTest() {
		WebElement creatAccount= driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
		creatAccount.click();
		
		WebElement FirstName=driver.findElement(By.id("firstname"));
		FirstName.sendKeys(name);
		WebElement LastName=driver.findElement(By.id("lastname"));
		LastName.sendKeys(secondName);
		WebElement email=driver.findElement(By.id("email_address"));
		email.sendKeys(Email);
		
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys(randomPassword);
		
		WebElement passwordconfirmation=driver.findElement(By.id("password-confirmation"));
		passwordconfirmation.sendKeys(randomPassword);
		LoginEmail = Email;
        loginPassword = randomPassword;
		WebElement submit=driver.findElement(By.className("submit"));
		submit.click();
		
		
	}
	@AfterTest
	public void myAfterTest() {
		
        driver.quit();

	}

}