package sampleMaventest;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class autoscript {
@Test
    public void f() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chrome\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	WebElement w1= driver.findElement(By.id("src"));
	w1.click();
	w1.sendKeys("Nagpur");
	Thread.sleep(2000);
	
	WebElement w2= driver.findElement(By.id("dest"));
	w2.click();
	w2.sendKeys("Pune");
	Thread.sleep(2000);
	
	driver.findElement(By.id("onwardCal")).click();
	String text= driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div[2]")).getText();
	System.out.println(text);
	
	String[] str = text.split(" ");
	System.out.println(str[0]);
	System.out.println(str[1]);

	while(!(str[0].equals("Jun") && str[1].equals("2024"))) {
		driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]")).click();
	   text= driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div[2]")).getText();
		System.out.println(text);
		str = text.split(" ");
		System.out.println(str[0]);
		System.out.println(str[1]);
	}
	driver.findElement(By.xpath("(//span[@class='DayTilesWrapper__SpanContainer-sc-19pz9i8-0 hQhlTG'])[3]/div[3]")).click();
	driver.findElement(By.id("search_button")).click();

}
}
