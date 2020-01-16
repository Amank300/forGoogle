package titleTestGoogle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.findElement(By.name("q")).sendKeys("Way2Automation");
		 driver.findElement(By.name("btnK")).click();
		 driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();
	
		 List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println("Total number of links are:==" + links.size());
		 
		 for(WebElement link :links) {
			 System.out.println(link.getText()+ "====Url is=   "+ link.getAttribute("href"));
		 }
		 
		 //driver.close();
		 
	}

}
