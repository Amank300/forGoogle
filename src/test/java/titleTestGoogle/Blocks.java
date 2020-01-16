package titleTestGoogle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Blocks {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[10]"));
		List<WebElement> links = block.findElements(By.tagName("a"));
		System.out.println("Total no. of links are --" + links.size());
		for (WebElement link : links) {
			System.out.println(link.getText() + "---URL---" + link.getAttribute("href"));
		}

		//try {
			//Thread.sleep(1000);
//		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
	//		e.printStackTrace();
		//}
		driver.close();
}
	
}