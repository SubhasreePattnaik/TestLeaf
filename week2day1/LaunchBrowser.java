package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {
  

public static void main(String[] args) throws InterruptedException  {
	
	  //connect with the BrowserDriver(exe file)
	  
	  
	  WebDriverManager.chromedriver().setup(); // check for the version and download
	  
	  /*
	   * String property = System.getProperty("webdriver.chrome.driver");
	   * System.out.println(property);
	   */
	  
	  //step :2 to launch the browser
	  
	  ChromeDriver driver= new ChromeDriver();
	  
	  //step:3 Load the Url
	  
	  driver.get("http://leaftaps.com/opentaps/control/main");
	  
	  //to maximaize the browser
	  
	  driver.manage().window().maximize();
	  
	  //to wait for the driver to locate the element
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  //step :4 enter the user name
	  
	  //if the value of the locator is not proper, it shows the exception as NoSuchElement
	  
	  driver.findElement(By.id("username")). sendKeys("demosalesManager");
	  
	  //step:5 enter the passsword
	  
	  driver.findElement(By .id("password")). sendKeys("crmsfa");
	  
	 //step:6 click the login button
	  
	  driver.findElement(By.className("decorativeSubmit")).click();
	  
	 //step:7 click Crm/sfa
	  
	  driver. findElement(By.linkText("CRM/SFA")).click();
	  
	  //STEP:8 click the leads
	  
	   driver. findElement(By .linkText("Leads")). click();
	   //step:9 confirm the title of my webpage
	   
	   String title = driver.getTitle();
	   System.out.println(title);
	   
	   //to close the browser
	  //Thread.sleep(2000);
	  // driver. close();
	   
	 driver.findElement(By.partialLinkText("Create")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subhasree");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("patnaik");
	 
	 //select the dropdown value for source
	 //1.find the element
	 //use select class to click the element
	 
	 WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select opt=new Select(source);
	 opt.selectByIndex(2);
	 
	 //SELECT THE DROPDOWN VALUE FOR SOURCE
	 //1.FIND THE ELEMENT
	 //use select class to click the element
	 
	 WebElement marCampaign = driver.findElement(By.id("createdLeadForm_marketingCampaignId"));
	 Select option=new Select(marCampaign);
	 option.selectByValue("CATRQ_AUTOMOBILE");
	 Thread.sleep(2000);
	 option.selectByVisibleText("Road and Track");
	 WebElement industryEnumId=driver.findElement(By.id("createLeadForm_industryEnumId"));
	 Select opti=new Select(industryEnumId);
	 opti.selectByIndex(3);
	 WebElement currencyUomId = driver.findElement(By.id("createLeadFprm_currencyUomId"));
	 Select optio=new Select(currencyUomId);
	 optio.selectByValue("CAD");
	 WebElement ownershipEnumId=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	 Select optioo=new Select(ownershipEnumId);
	 optioo.selectByVisibleText("OWN PARTNERSHIP");
	 
	  }
}
	  
	  
	  
