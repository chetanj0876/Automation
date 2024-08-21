import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.GenericFunction;
public class swagLabs {

	public static void main(String[] args) {
		
		WebDriver driver=GenericFunction.createInstanceOfRequiredBrowser("chrome");
		driver.get("https://www.saucedemo.com/");
		
		String expectedLoginPage="https://www.saucedemo.com/";
		String actualLoginPage=driver.getCurrentUrl();
		System.out.println("Validation of Login Page :"+expectedLoginPage.equals(actualLoginPage));
		
		WebElement usernameInput=driver.findElement(By.id("user-name"));
		usernameInput.sendKeys("standard_user");
		
		System.out.println("Username input field visible "+usernameInput.isDisplayed());
		System.out.println("Username input field editable "+usernameInput.isEnabled());
		String defaultvalueUN=usernameInput.getAttribute("placeholder");
		System.out.println("default value of username field is "+defaultvalueUN);
		
		WebElement passwordInput=driver.findElement(By.id("password"));
		passwordInput.sendKeys("secret_sauce");
		
		System.out.println("Username input field visible "+passwordInput.isDisplayed());
		System.out.println("Username input field editable "+passwordInput.isEnabled());
		String defaultvaluePWD=passwordInput.getAttribute("placeholder");
		System.out.println("default value of password field is "+defaultvaluePWD);
		
		driver.findElement(By.className("submit-button")).click();
		
		String expectedURl="https://www.saucedemo.com/inventory.html";
		String currentURl=driver.getCurrentUrl();
		System.out.println("Home page Url validation : "+(expectedURl.equals(currentURl)));
		
		String expectedURlContent="login";
		System.out.println("Home page Title validation : "+(!expectedURlContent.contains(currentURl)));
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
		driver.close();
		
		

	}

}

