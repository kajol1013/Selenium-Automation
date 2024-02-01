package sampleMaventest;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irctc {
	@Test
	public void f() throws InterruptedException {

		// Initialisation
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='col-md-7 col-xs-12 remove-padding'])[1]/div[1]//descendant::span[2]//input[@role='searchbox']")));
	//	Thread.sleep(2000);

		// click on from serachbox
		WebElement fromtxtbox = driver.findElement(By.xpath(
				"(//div[@class='col-md-7 col-xs-12 remove-padding'])[1]/div[1]//descendant::span[2]//input[@role='searchbox']"));
		fromtxtbox.click();
		fromtxtbox.sendKeys("Nagpur");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div)[36]/ul//li[3]/span[@class='ng-star-inserted']")));

		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//div)[36]/ul//li[3]/span[@class='ng-star-inserted']")).click();
		

		// click on to serachbox
		WebElement totxtbox = driver.findElement(By
				.xpath("(//div[@class='form-group ui-float-label'])[2]/descendant::span[2]/input[@role='searchbox']"));
		totxtbox.click();
		totxtbox.sendKeys("Delhi");
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ng-trigger ng-trigger-overlayAnimation ng-tns-c57-9 ui-autocomplete-panel ui-widget ui-widget-content ui-corner-all ui-shadow ng-star-inserted']/ul//li[2]/span[@class='ng-star-inserted']")));

		driver.findElement(By.xpath("//div[@class='ng-trigger ng-trigger-overlayAnimation ng-tns-c57-9 ui-autocomplete-panel ui-widget ui-widget-content ui-corner-all ui-shadow ng-star-inserted']/ul//li[2]/span[@class='ng-star-inserted']")).click();
		

		// click on calendar
		driver.findElement(
				By.xpath("(//div[@class='form-group ui-float-label'])[3]/descendant::span[2]/input[@type='text']"))
				.click();

		String month = driver.findElement(By.xpath(
				"//div[@class='ui-datepicker-title ng-tns-c58-10']/span[1][@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']"))
				.getText();
		System.out.println(month);
		String year = driver.findElement(By.xpath(
				"//div[@class='ui-datepicker-title ng-tns-c58-10']/span[2][@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']"))
				.getText();
		System.out.println(year);

		while (!(month.equals("May") && year.equals("2024"))) {
			driver.findElement(By.xpath(
					"//a[@class='ui-datepicker-next ui-corner-all ng-tns-c58-10 ng-star-inserted']/span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']"))
					.click();
			month = driver.findElement(By.xpath(
					"//div[@class='ui-datepicker-title ng-tns-c58-10']/span[1][@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']"))
					.getText();
			System.out.println(month);
			year = driver.findElement(By.xpath(
					"//div[@class='ui-datepicker-title ng-tns-c58-10']/span[2][@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']"))
					.getText();
			System.out.println(year);
		}
		// selecting date
		driver.findElement(By.xpath("//tbody //tr//td/a[text()='25']")).click();
      //  Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='form-group'])[1]/descendant::div[1][@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']")));

		//Dropdown classes
		
		WebElement D1 = driver.findElement(By.xpath("(//div[@class='form-group'])[1]/descendant::div[1][@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
		D1.click();
	//	Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ui-dropdown-items-wrapper ng-tns-c65-11']//ul/descendant::li[3][@role='option']")));

		driver.findElement(By.xpath("//div[@class='ui-dropdown-items-wrapper ng-tns-c65-11']//ul/descendant::li[3][@role='option']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
//        Select S1 = new Select(D1);
//        S1.selectByVisibleText("AC 2 Tier (2A)");
	}

}
