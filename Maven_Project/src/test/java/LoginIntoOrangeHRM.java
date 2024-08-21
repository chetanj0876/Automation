import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import reusableComponent.GenericFunction;
public class LoginIntoOrangeHRM {

	public static void main(String[] args) {
	WebDriver driver=GenericFunction.createInstanceOfRequiredBrowser("chrome");
	driver.get("https://demowebshop.tricentis.com/login");
	
	WebElement emailinput=driver.findElement(By.id("Email"));
	emailinput.clear();
	emailinput.sendKeys("tester01@vomoto.com");
	
	WebElement passwordinput=driver.findElement(By.id("Password"));//.clear cannot be used
	passwordinput.clear();
	passwordinput.sendKeys("Abc@12345");
	
	WebElement loginButton=driver.findElement(By.className("login-button"));
	loginButton.click();
	
	String expectedUrlContent="login";
	String currentUrl=driver.getCurrentUrl();
	System.out.println("Home page validation status: "+(!currentUrl.contains(expectedUrlContent)));

	}

}
