package titleTestGoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivers {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("asdffgg");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("password")).sendKeys("luluyluylu");
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span")).click();
		//*[@id="passwordNext"]/span
		//*[@id="passwordNext"]/span/span
		WebDriverWait  wait = new WebDriverWait(driver, 5);
		System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"headingText\"]"))).getText());
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div[2]"))).getText());
		System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"headingText\"]"))).getText());
		//System.out.println(driver.findElement(By.xpath("//*[@id=\"headingText\"]/span")).getText());
	}

}
