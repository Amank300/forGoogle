package titleTestGoogle;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownList {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// 1//driver.get("http://www.way2automation.com/way2auto_jquery/index.php");
		driver.get("https://www.wikipedia.org");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// 1//driver.findElement(By.name("country")).sendKeys("Germany");
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));

		Select select = new Select(dropdown);
		// select.selectByVisibleText("Eesti");;
		select.selectByValue("hi");

		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println("Total Values are" + values.size());
		System.out.println(values.get(7).getText());

		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i).getAttribute("lang")+"   "+values.get(i).getAttribute("value"));

		}
		//driver.close();

	}

}
