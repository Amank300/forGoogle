package titleTestGoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyssTest
{

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("asd@gmail.com");
		driver.findElement(By.cssSelector("#initialView > div.xkfVF")).click();
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).sendKeys(Keys.chord(Keys.CONTROL+"c")).build().perform();
		//action.sendKeys(Keys.chord(Keys.CONTROL+"c")).build().perform();
		driver.findElement(By.id("identifierId")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).build().perform();
		
		
		
	}	

}
