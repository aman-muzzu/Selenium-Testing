package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrowser {

	public static String browser="chrome";
	
	public static WebDriver driver;//  RemoteWebDriver also we can use
	
	
	
	public static void main(String[] args) {
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		
		
		
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver=new FirefoxDriver();
		
		//WebDriverManager.edgedriver().setup();
		//EdgeDriver driver=new EdgeDriver();
		
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://mvnrepository.com/");
		String title= driver.getTitle();  //123  need to enter String
		
		
		System.out.println(title);
		System.out.println(title.length());
		
		String expectedTitle= "Google.com";
				if(title.equals(expectedTitle)) {
					System.out.println("Test cas is pass");
				}else {
					System.out.println("test case is fail");
				}
				
				driver.quit();
		
				

	}

}
