package sampleMaventest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class test3 {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chrome\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		
				// Expected condition
				
				wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstname")));

	}

}
