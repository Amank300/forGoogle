package titleTestGoogle;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		for (int i=300;i<=1000;i+=20) {
			Dimension d = new Dimension(i,i);
			driver.manage().window().setSize(d);	
						
		}
		driver.close();
		driver.quit();
		
	}

}
