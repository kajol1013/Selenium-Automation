package sampleMaventest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class one {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//opening wesite in maximize mode
		driver.get("https://phptravels.com/demo");
		driver.manage().window().maximize();
		
		String num1= driver.findElement(By.xpath("//div[@class='d-flex mt-4 mt-lg-0']/child::h4/child::span[1]")).getText();
		String num2= driver.findElement(By.xpath("//div[@class='d-flex mt-4 mt-lg-0']/child::h4/child::span[2]")).getText();
		System.out.println("num1: " +num1 +" , " +"num2: " +num2 );
		int total = Integer.parseInt(num1) + Integer.parseInt(num2);
		System.out.println(total);
		
	WebElement w1	= driver.findElement(By.id("number"));
	w1.click();
	w1.sendKeys(Integer.toString(total));
	}
}


