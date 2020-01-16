package titleTestGoogle;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmtFromAStudent {
	
	public static String title;

	public static void Selectbrowser(String Browser) {

	WebDriver driver = null;



	if (Browser.equals("Chrome")) {

	WebDriverManager.chromedriver().setup();

	driver = new ChromeDriver();

	}else if (Browser.equals("Firefox")) {

	WebDriverManager.firefoxdriver().setup();

	driver = new FirefoxDriver();

	}else if (Browser.equals("IE")){

	WebDriverManager.iedriver().setup();

	driver = new InternetExplorerDriver();

	}

	driver.get("https://www.google.com");

	title = driver.getTitle();

	System.out.println(title);

	System.out.println(title.length());

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	driver.manage().window().maximize();

	driver.findElement(By.name("q")).sendKeys("Way2Automation");

	driver.findElement(By.className("gNO89b")).click();

	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();

	WebElement element = driver.findElement(By.xpath("/html/body/div[4]"));

	List<WebElement> list = element.findElements(By.tagName("a"));

	System.out.println(list.size());

	for(int i =1; i< list.size();i++) {

	System.out.println(list.get(i).getText()+"URL IS :"+ list.get(i).getAttribute("href"));

	}

	driver.close();

	}



	}


