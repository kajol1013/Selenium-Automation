package sampleMaventest;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sample_website {
	@Test
	public void f() throws InterruptedException {
		//Initialisation
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//opening wesite in maximize mode
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		//scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
	   // Thread.sleep(2000);
		
	 	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
	    
	    // Entering input in firstname textbox
	   WebElement fname =  driver.findElement(By.name("firstname"));
	   fname.click();
	   fname.sendKeys("kajol");
	   
	
	    // Entering input in lastname textbox
	   WebElement lname=  driver.findElement(By.name("lastname"));
	   lname.click();
	   lname.sendKeys("Amesar");
	   
	   //selecting gender
	   driver.findElement(By.id("sex-1")).click();
	   
	   //selecting exp
	   driver.findElement(By.id("exp-1")).click();
	   
	   //Entering date
	   WebElement date =  driver.findElement(By.id("datepicker"));
	   date.click();
	   date.sendKeys("10/12/1995");
	   
	 //scrolling down
	 		js.executeScript("window.scrollBy(0,500)", "");
	 	   // Thread.sleep(2000);
	 		
	 	  
	 	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profession-1")));
	 		
	   //selecting profession
	   driver.findElement(By.id("profession-1")).click();
	   
	   //selecting tools
	   driver.findElement(By.id("tool-2")).click();
	   
	   //selcting dropdown
	   WebElement dropdown1 = driver.findElement(By.id("continents"));
	   Select S1 = new Select (dropdown1);
	   S1.selectByVisibleText("Africa");
	   
	   //selecting dropdown2
	   WebElement dropdown2 = driver.findElement(By.id("selenium_commands"));
	   dropdown2.findElement(By.xpath("(//option[@style='margin:0;padding-bottom:0;padding-left:0;padding-right:0'])[9]")).click();
	
	   
	   //click on submit button
	   driver.findElement(By.id("submit")).click();
	   
	}

}
