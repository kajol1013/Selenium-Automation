package sampleMaventest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practical {
	@Test
	public void f() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vapestore.com.au");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
        //Thread.sleep(4000);		
	   WebDriverWait wait = new WebDriverWait(driver,20);
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='modal-close confirm']")));
		System.out.println("done");
		
	WebElement E1=	driver.findElement(By.xpath("//button[@class='modal-close confirm']"));
	js.executeScript("arguments[0].click()", E1);
//		WebElement fromcity = driver.findElement(By.xpath("//label[@for='fromCity']"));
//		fromcity.click();
//		Thread.sleep(2000);
//		fromcity.sendKeys("Nagpur");
//		
//		WebElement tocity= driver.findElement(By.xpath("//label[@for='toCity']"));
//		tocity.click();
//		tocity.sendKeys("Delhi");
	}
}
