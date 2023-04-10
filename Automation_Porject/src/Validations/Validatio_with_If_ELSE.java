package Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validatio_with_If_ELSE {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.like4like.org/");

		
		System.out.println(driver.getTitle());
		
		String ActualTitle = "Like4Like - Social Media Marketing - 100% FREE!";
		
		String ExpectedTitle = driver.getTitle();
		
		if (ExpectedTitle.equals(ActualTitle)) {
			System.out.println("Actual Title Matches With the Expected title");
			
		}else {
			System.out.println("Actual title is not equals to the Expected Title");
		}
		
		driver.findElement(By.linkText("Login")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		String Actual_Url = driver.getCurrentUrl();
		
		String Expected_Url = ("https://www.like4like.org/login/");
		
		if (Actual_Url.equals(Expected_Url)) {
			System.out.println("Actual URL Matches With the Expected URL");
			
		}else {
			System.out.println("Actual URL is not equals to the URL Title");
		}
		
	}

}
