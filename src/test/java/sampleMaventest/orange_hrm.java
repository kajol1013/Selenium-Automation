package sampleMaventest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.annotations.Test;

public class orange_hrm {
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	//	Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
		WebElement username= driver.findElement(By.name("username"));
		username.click();
		username.sendKeys("Admin");
		
		WebElement pass= driver.findElement(By.name("password"));
		pass.click();
		pass.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		
	//	JavascriptExecutor js= (JavascriptExecutor)driver;
	driver.findElement(By.xpath("//div[@class='oxd-sidepanel-body']//ul//li[3]/a[@href='/web/index.php/leave/viewLeaveModule']")).click();
	//js.executeScript("arguments[0].click()", w2);
		Thread.sleep(5000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));

		 driver.findElement(By.xpath("(//div[@class='oxd-date-wrapper'])[1]/div[@class='oxd-date-input']/input[@class='oxd-input oxd-input--active']")).click();
		 String month = driver.findElement(By.xpath("(//ul)[4]//li[1]/div[@class='oxd-calendar-selector-month-selected']/p[@class='oxd-text oxd-text--p']")).getText();
		 System.out.println(month);
	
		 WebElement dropdown= driver.findElement(By.xpath("(//ul)[4]//li[1]//div//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon']"));
		 dropdown.click();
		 driver.findElement(By.xpath("(//ul)[5]/li[3][@class='oxd-calendar-dropdown--option']")).click();
			
				 
		 String year = driver.findElement(By.xpath("(//ul)[4]//li[2]/div//p[@class='oxd-text oxd-text--p']")).getText();
		 System.out.println(year);
		 
		 
		
	}		

}
