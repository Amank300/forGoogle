package titleTestGoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2onFF {

	public static void main(String[] args) {

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qa.way2automation.com");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		// driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[1]/input")).click();
		WebElement name = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[1]/input"));
		name.sendKeys("kjlkjlkj");
		// driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[1]/input")).sendKeys("jkjlkjlkj");
		// driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")).click();
		WebElement phone = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[2]/input"));
		phone.sendKeys("1234567893");
		WebElement email = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[3]/input"));
		email.sendKeys("asd@k.com");
		System.out.println("hello world");
		WebElement city = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[5]/input"));
		city.sendKeys("delhi");
		WebElement uname =driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[6]/input")); 
		uname.sendKeys("hjhj");
		WebElement passw =driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/fieldset[7]/input"));
		passw.sendKeys("hsh45");
		WebElement submit = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input"));
		submit.click();
	}
	

}
