package titleTestGoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMicrowave {

	static WebDriver driver ;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		//WebDriver driver1 = new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("microwave");
	    driver.findElement(By.cssSelector("#nav-search > form > div.nav-right > div > input")).click();
	    //driver.close();
	    driver.quit();
	}

}
