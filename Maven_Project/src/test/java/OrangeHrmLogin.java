import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponent.GenericFunction;
public class OrangeHrmLogin {

	public static void main(String[] args) {
		WebDriver driver=GenericFunction.createInstanceOfRequiredBrowser("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String expectedLoginPage="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actualLoginPage=driver.getCurrentUrl();
		System.out.println("Validation of Login Page :"+expectedLoginPage.equals(actualLoginPage));
		
		WebElement usernameinput=driver.findElement(By.name("username"));
		
		System.out.println("Username input field visible "+usernameinput.isDisplayed());
		System.out.println("Username input field editable "+usernameinput.isEnabled());
		String defaultvalueUN=usernameinput.getAttribute("placeholder");
		System.out.println("default value of username field is "+defaultvalueUN);
		
		usernameinput.clear();
		usernameinput.sendKeys("Admin");
		
		
		WebElement passwordInput=driver.findElement(By.name("password"));
		
		
		System.out.println("Username input field visible "+passwordInput.isDisplayed());
		System.out.println("Username input field editable "+passwordInput.isEnabled());
		String defaultvaluePWD=passwordInput.getAttribute("placeholder");
		System.out.println("default value of password field is "+defaultvaluePWD);
		
		passwordInput.clear();
		passwordInput.sendKeys("admin123");
		
		WebElement lb= driver.findElement(By.className("oxd-button"));
		System.out.println("Visibility status: "+lb.isDisplayed());
		System.out.println("enable or not: "+lb.isEnabled());
		System.out.println("button name : "+lb.getText());
		lb.click();
		
		String expectedHomePage="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actualHomePage=driver.getCurrentUrl();
		System.out.println("Validation of Home Page :"+expectedHomePage.equals(actualHomePage));
		
	
		
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.className("oxd-userdropdown-link")));
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		
		
		
		//driver.close();*/
	}

}
