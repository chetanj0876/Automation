import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.GenericFunction;
public class loginToVtiger {

	public static void main(String[] args) {
		
		WebDriver driver=GenericFunction.createInstanceOfRequiredBrowser("chrome");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String expectedLoginPage="https://demo.vtiger.com/vtigercrm/index.php";
		String actualLoginPage=driver.getCurrentUrl();
		System.out.println("Validation of Login Page :"+expectedLoginPage.equals(actualLoginPage));
		
		WebElement usernameInput=driver.findElement(By.id("username"));
		System.out.println("Username input field visible "+usernameInput.isDisplayed());
		System.out.println("Username input field editable "+usernameInput.isEnabled());
		String defaultvalueUN=usernameInput.getAttribute("placeholder");
		System.out.println("default value of username field is "+defaultvalueUN);
		usernameInput.clear();
		usernameInput.sendKeys("Admin");
		
		WebElement passwordInput=driver.findElement(By.id("password"));
		System.out.println("Username input field visible "+passwordInput.isDisplayed());
		System.out.println("Username input field editable "+passwordInput.isEnabled());
		String defaultvaluePWD=passwordInput.getAttribute("placeholder");
		System.out.println("default value of password field is "+defaultvaluePWD);
		passwordInput.clear();
		passwordInput.sendKeys("admin");
		
		driver.findElement(By.className("buttonBlue")).click();
		
		String expectedURl="https://demo.vtiger.com/vtigercrm/index.php";
		String currentURl=driver.getCurrentUrl();
		System.out.println("Home page Url validation : "+(expectedURl.equals(currentURl)));
		
		String expectedURlContent="login";
		System.out.println("Home page Title validation : "+(!expectedURlContent.contains(currentURl)));
		
		driver.findElement(By.className("userName")).click();
		
		driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
		
		driver.close();
		
		// TODO Auto-generated method stub

	}

}
