package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebElements {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://template12.iweensoft.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*WebElement username = driver.findElement(By.id("identifierId"));   // here we are using reference.
		username.sendKeys("amanmuzzu@gmal.com");
		
		WebElement button=driver.findElement(By.id("//*[@id=\"identifierNext\"]/div/button/div[3]"));
		button.click();*/
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kavitha");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Thanks@112233");
		
		//Thread.sleep(2000);  // this is hardcoded and get many issues with this, so we use implicit, explicit wait line 21
		
		
		
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
		
		
		
		
		
	}

	
}
