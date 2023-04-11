package Tutorial_Ninja;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
	/*	  for (int i = 1; i <= 5; i++) {
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Sagar"+i);
		driver.findElement(By.id("input-lastname")).sendKeys("Selenium"+i);
		driver.findElement(By.id("input-email")).sendKeys("sagaralex00012@gmail.com"+i);
		driver.findElement(By.id("input-telephone")).sendKeys("1236476789"+i);
		driver.findElement(By.id("input-password")).sendKeys("Sagar123"+i);
		driver.findElement(By.id("input-confirm")).sendKeys("Sagar123"+i);
		driver.findElement(By.name("agree")).click();
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		  }
		  */
		  for (int j = 1; j <= 5; j++) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		  	driver.get("https://tutorialsninja.com/demo/");
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
			driver.findElement(By.id("input-email")).sendKeys("sagaralex00012@gmail.com"+j);
			driver.findElement(By.id("input-password")).sendKeys("Sagar123"+j);
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
			
			
		  }
		
	}
	

}
