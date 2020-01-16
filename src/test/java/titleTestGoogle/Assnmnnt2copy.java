package titleTestGoogle;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;

public class Assnmnnt2copy {

	public static void main(String[] args) {

		// ---------------------------------------------------------------

		// Setting up ChromeDriver

		WebDriverManager.chromedriver().setup();

		// Creating an Object with Reference as WebDriver(superClass) from ChromDriver
		// Class

		WebDriver Driver = new ChromeDriver();

		// ---------------------------------------------------------------

		Driver.get("http://qa.way2automation.com/");

		Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Started");

		// new WebDriverWait(Driver,
		// 20).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#load_form
		// > h3")));

		// new WebDriverWait(Driver,
		// 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#load_form
		// > fieldset:nth-child(5) > input[type=text]"))).click();

		//

		// Checking visibility of Registration box

		new WebDriverWait(Driver, 20)
				.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("#load_box"))));

		// Checking visibility of elements in the Registration box

		new WebDriverWait(Driver, 20)
				.until(ExpectedConditions
						.elementToBeClickable(By.cssSelector("#load_form > fieldset:nth-child(10) > input[type=text]")))
				.sendKeys("Username");

		new WebDriverWait(Driver, 20)
				.until(ExpectedConditions
						.elementToBeClickable(By.cssSelector("#load_form > fieldset:nth-child(6) > input[type=tel]")))
				.sendKeys("telephone");

		new WebDriverWait(Driver, 20)
				.until(ExpectedConditions
						.elementToBeClickable(By.cssSelector("#load_form > fieldset:nth-child(7) > input[type=email]")))
				.sendKeys("abc@email.com");

		new WebDriverWait(Driver, 20).until(ExpectedConditions.elementToBeClickable(
				By.cssSelector("#load_form > fieldset:nth-child(8) > select > option:nth-child(101)"))).click();

		new WebDriverWait(Driver, 20)
				.until(ExpectedConditions.elementToBeClickable(
						By.cssSelector("#load_form > fieldset:nth-child(11) > input[type=password]")))
				.sendKeys("Password");
		;

		new WebDriverWait(Driver, 20)
				.until(ExpectedConditions
						.elementToBeClickable(By.cssSelector("#load_form > fieldset:nth-child(9) > input[type=text]")))
				.sendKeys("City");
		;

		new WebDriverWait(Driver, 40).until(ExpectedConditions.elementToBeClickable(By.name("name")))
				.sendKeys("Anupam");

		System.out.println("data filled. Clicking Submit.");

		//

		// Clicking the Submit button

		new WebDriverWait(Driver, 30).until(ExpectedConditions
						.elementToBeClickable(By.xpath("/html/body/div[4]/div/div/div/div/div/form/div/div[2]/input")))
				.click();

		//Driver.close();

		System.out.println("Assignment 2 completed.");

	}

}
