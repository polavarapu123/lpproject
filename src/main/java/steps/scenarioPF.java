package steps;
import java.util.concurrent.TimeUnit;
import locatorActions.locatorsActionsPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class scenarioPF {
	WebDriver driver = null;
	//locatorsActions LA ;
	
	@Given("^open the \"([^\"]*)\" page$")
	public void open_the_page(String arg1) throws Throwable  {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\executables\\chromedriver.exe");					
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();	
	       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	       //LAPF.searchFor(arg1);
	       driver.get(arg1);
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("^search for a keyword$")
	public void search_for_a_keyword() throws Throwable {
	 System.out.println("in when step");
	 locatorsActionsPF l1 = new locatorsActionsPF(driver);
	 //locatorsActions LA = new locatorsActions(driver);
	 //LAPF = new locatorsActionsPF(driver);
	 String keyword = "way2automation";
	 l1.searchFor(keyword);
	 //LA.searchFor(keyword);
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("http://www.way2automation.com/");   
	}

//	@Then("^the website opens$")
//	
//	public void the_website_opens() throws Throwable {
//		LA = new locatorsActions(driver);
//		LA.GooglesearchBtnClick();
////		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
//		LA.openWebsite();
////		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3/span")).click();
//		LA.mouseovermenu();
//		
			}

	

