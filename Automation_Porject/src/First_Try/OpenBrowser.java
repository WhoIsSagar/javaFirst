package First_Try;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.quit();
		
			WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://amazon.com");
		driver.quit();
		

		WebDriver driver2 = new SafariDriver();
		driver2.manage().window().maximize();
		driver2.get("https://amazon.com");
		driver.quit();
	}

}
