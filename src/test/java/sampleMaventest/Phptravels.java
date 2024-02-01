package sampleMaventest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Phptravels {
	@Test
	public void f() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goibibo.com/hotels/hotels-in-nagpur-ct/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.);)
		
		//driver.findElement(By.id("round-trip")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		
		WebElement from = driver.findElement(By.xpath("(//input[@aria-autocomplete='list'])[1]"));
		from.click();
		from.clear();
		from.sendKeys("pune");
		driver.findElement(By.xpath("//ul//li[@id='downshift-3-item-0']/div[2]/following::li[1]/div[@class='dwebCommonstyles__BaseColumnWrap-sc-112ty3f-2 fVGWFo']")).click();
		
	
       driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
       
       String Expected = "August 2024";
       String Actual= driver.findElement(By.xpath("(//span[@class='dcalendar-newstyles__MonthName-sc-1i003by-12 izZmAz'])[1]")).getText();
        
        while(!(Actual.equals("September 2024"))) {
        	driver.findElement(By.xpath("((//span[@class='dcalendar-newstyles__CircularWrapperRight-sc-1i003by-11 WOjvm']")).click();
        	Actual= driver.findElement(By.xpath("(//span[@class='dcalendar-newstyles__MonthName-sc-1i003by-12 izZmAz'])[1]")).getText();
        }
	}
        	
        	
        	
       
		
	}

