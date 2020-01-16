package titleTestGoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {


	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
	driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys("way2automation.com");
	driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf.emcav > div.UUbT9 > div.aajZCb > div.tfB0Bf > center > input.gNO89b")).click();
	driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.r > a > h3")).click();
	WebElement menu = driver.findElement(By.cssSelector("#navbar-collapse-1 > ul > li:nth-child(7) > a"));
	//WebElement menu = driver.findElement(By.cssSelector("#navbar-collapse-1 > ul > li:nth-child(7) > ul"));
	Actions action = new Actions(driver);
	action.moveToElement(menu).perform();
	//driver.findElement(By.cssSelector("#navbar-collapse-1 > ul > li:nth-child(8) > ul > li:nth-child(2) > a")).click();
	driver.findElement(By.linkText("Practice site 1")).click();
	
	driver.close();
	
	}

}
