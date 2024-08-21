import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reusableComponent.GenericFunction;
public class swagLabsAutofill {

	public static void main(String[] args) {
		
		WebDriver driver=GenericFunction.createInstanceOfRequiredBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		
		String expectedLoginPage="https://www.saucedemo.com/";
		String actualLoginPage=driver.getCurrentUrl();
		System.out.println("Validation of Login Page :"+expectedLoginPage.equals(actualLoginPage));
		
		String userNames=driver.findElement(By.id("login_credentials")).getText();
		String userList[]=userNames.split("\n");
		
		for(int i=1;i<userList.length;i++)
		{
			driver.findElement(By.id("user-name")).sendKeys(userList[i]);
			String password=driver.findElement(By.className("login_password")).getText();
			String passwordList[]=password.split("\n");
			driver.findElement(By.id("password")).sendKeys(passwordList[1]);
			driver.findElement(By.id("login-button")).click();
			
			
			if(driver.getCurrentUrl().contains("inventory.html"))
			{
				System.out.println("login successful with "+userList[i]);
				driver.findElement(By.id("react-burger-menu-btn")).click();
				driver.findElement(By.id("logout_sidebar_link")).click();
			}
			else{
				driver.findElement(By.id("user-name")).clear();
				driver.findElement(By.id("password")).clear();
			}
			
		
		}
	}

}

