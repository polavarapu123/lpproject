package locatorActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class locatorsActions {
	WebDriver driver;
	//WebElement menu1;
	By searchField = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");
	
    By GoogleSearchBtn = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]");
                                //  //*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]
    By websiteLink = By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3/span");
    //By menu1 = By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[3]/a");
    
	public locatorsActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void searchFor(String keyword) {
		driver.findElement(searchField).sendKeys(keyword);
	}
	
	public void GooglesearchBtnClick() {
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();
		driver.findElement(GoogleSearchBtn).click();
	}
	
	public void openWebsite() {
	driver.findElement(websiteLink).click();	
	}
	
	public void mouseovermenu() {
		WebElement menu = driver.findElement(By.xpath("//*[@id=\"navbar-collapse-1\"]/ul/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
	}
}
