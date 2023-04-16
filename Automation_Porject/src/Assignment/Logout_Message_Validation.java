package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout_Message_Validation {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a [@class = 'signin']")).click();
		driver.findElement(By.xpath("//input [@id = 'login1']")).sendKeys("gursagarhanjhra@rediffmail.com");
		driver.findElement(By.xpath("//input [@id = 'password' and @name = 'passwd']")).sendKeys("Newzealand1@");
		driver.findElement(By.xpath("//input [@id = 'password' and @name = 'passwd']//following-sibling ::input[@name = 'proceed']")).click();
		driver.findElement(By.xpath("//a [@class = 'rd_logout']")).click();
		boolean SuccesfullLogout = driver.findElement(By.xpath("//div [@class = 'panel']//p[1]")).isDisplayed();
		
		if (SuccesfullLogout==true  ) {
			System.out.println("The Account is Succesfully Logged Out ");
		}else {
			System.out.println("Account Not Logged Out. Please try again. ");
		}
		
	

	}

}
