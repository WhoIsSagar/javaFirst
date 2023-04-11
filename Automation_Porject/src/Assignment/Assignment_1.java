package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_1 {

	public static void main(String[] args) {
	
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the website
        driver.get("https://tutorialsninja.com/demo/");
        
        // Click on the My Account link to go to the login page
        WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
        myAccountLink.click();
        
        // Click on the Register button to go to the registration page
        WebElement registerButton = driver.findElement(By.linkText("Register"));
        registerButton.click();
        
        // Create accounts for 5 users
        for (int i = 1; i <= 5; i++) {
            // Fill in the registration form
            WebElement firstNameInput = driver.findElement(By.id("input-firstname"));
            firstNameInput.sendKeys("User" + i);
            
            WebElement lastNameInput = driver.findElement(By.id("input-lastname"));
            lastNameInput.sendKeys("Lastname" + i);
            
            WebElement emailInput = driver.findElement(By.id("input-email"));
            emailInput.sendKeys("user" + i + "@example.com");
            
            WebElement telephoneInput = driver.findElement(By.id("input-telephone"));
            telephoneInput.sendKeys("123456789" + i);
            
            WebElement passwordInput = driver.findElement(By.id("input-password"));
            passwordInput.sendKeys("password");
            
            WebElement confirmPasswordInput = driver.findElement(By.id("input-confirm"));
            confirmPasswordInput.sendKeys("password");
            
            WebElement agreeCheckbox = driver.findElement(By.name("agree"));
            agreeCheckbox.click();
            
            // Submit the registration form
            WebElement continueButton = driver.findElement(By.cssSelector("input[type='submit'][value='Continue']"));
            continueButton.click();
            
            // Validate the login
            WebElement myAccountLink2 = driver.findElement(By.linkText("My Account"));
            myAccountLink2.click();

            WebElement logoutLink = null;
            try {
                logoutLink = driver.findElement(By.linkText("Logout"));
            } catch (Exception e) {
                // Logout link not found
            }
            
            if (logoutLink != null && logoutLink.isDisplayed()) {
                System.out.println("User" + i + " was successfully registered and logged in.");
                
                // Log out
                logoutLink.click();
            } else {
                System.out.println("User" + i + " was not able to log in.");
            }
        }
        
        // Close the ChromeDriver instance
        driver.quit();
    }
}