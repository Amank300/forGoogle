package titleTestGoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.way2automation.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Started");
		WebDriverWait wait= new WebDriverWait(driver, 20);
		//System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/input"))).getText());
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/input"))).sendKeys("jhgkjdhf");
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/input")).sendKeys("asdffgg");
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[6]/input")).sendKeys("456465");
		
		
		WebElement dropdownIndia = driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select"));
		
		Select select = new Select(dropdownIndia);
		select.selectByVisibleText("India");
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"load_form\"]/div/div[2]/input"))).click();
		
		//driver.findElement(By.xpath("//*[@id=\"load_form\"]/div/div[2]/input")).click();
		
		driver.quit();
	}

}
