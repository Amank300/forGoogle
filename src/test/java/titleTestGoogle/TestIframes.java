package titleTestGoogle;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIframes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_toisostring");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	
		List<WebElement> frames =  driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		for(WebElement frame:frames) {
			
			System.out.println(frame.getAttribute("id"));
		}
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.cssSelector("body > button")).click();
	
	    
	
	}

}
