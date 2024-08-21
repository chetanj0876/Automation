import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.GenericFunction;
public class saucedemo {

	public static void main(String[] args) {
		
		WebDriver driver=GenericFunction.createInstanceOfRequiredBrowser("chrome");
		driver.get("https://www.saucedemo.com/");
		
		WebElement usernameInput=driver.findElement(By.id("user-name"));
		usernameInput.clear();
		usernameInput.sendKeys("standard_user");
		
		WebElement passwordInput=driver.findElement(By.id("password"));
		passwordInput.clear();
		passwordInput.sendKeys("secret_sauce");
		
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
