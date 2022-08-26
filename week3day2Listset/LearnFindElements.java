package week3day2Listset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFindElements {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER);
		
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
	System.out.println(price);
	
	List<String> phonePrice=new ArrayList<String>();
	for(int i=0;i<price.size();i++) {
		String text=price.get(i).getText();
		phonePrice.add(text);
		
	}
		
	System.out.println(phonePrice);
	Collections.sort(phonePrice);
	System.out.println(phonePrice);
	driver.close();
	}

}
