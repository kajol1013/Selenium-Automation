package sampleMaventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dbs {
	@Test
	public void f() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://weswadesi.com");
		driver.manage().window().maximize();
		WebElement M1 = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		M1.click();
		M1.sendKeys("soap");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		// Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("(//div[@class='product-element-bottom'])[2]/h3/a[@href='https://weswadesi.com/product/detox-tea-rose-tea-soap-ubtan-hamper/']")));
		driver.findElement(
				By.xpath("(//div[@class='product-element-bottom'])[2]/h3/a[@href='https://weswadesi.com/product/detox-tea-rose-tea-soap-ubtan-hamper/']")).click();

	}
}
