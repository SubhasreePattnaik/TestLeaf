package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeXpath {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage(). window().maximize();
		driver.manage(). timeouts(). implicitlyWait(Duration.ofSeconds(30));
		//Login page
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		driver.findElement(By.xpath("//input[@name= 'PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//driver.findElement(By.linkText("Create Lead")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='creatLeadForm_companyName')]")).sendKeys("SIEMENS");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_firstName')]")).sendKeys("Subhasree");
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_lastName')]")).sendKeys("Patnaik");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		//Thread.sleep(3000);
		
		
		
	}

}
