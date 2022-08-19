package week2day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sree");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pattnaik");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("babyangelsubhasree@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Testing123");
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByValue("8");
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByValue("4");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1994");
		driver.findElement(By.xpath("//label[contains(text(),'Female')]/following-sibling::input[@type='radio']")).click();
		
		
		
		
	}

}
