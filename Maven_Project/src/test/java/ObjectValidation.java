import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusableComponent.GenericFunction;
public class ObjectValidation {

	public static void main(String[] args) {
		
		WebDriver driver=GenericFunction.createInstanceOfRequiredBrowser("chrome");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/uts/login.do");
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		System.out.println("Username input field visibility status :"+userNameInputField.isDisplayed());
		System.out.println("Username input field editable status :"+userNameInputField.isEnabled());
		String defaultValueOfUserNameInputField=userNameInputField.getAttribute("placeholder");
		System.out.println("Username input field value : "+defaultValueOfUserNameInputField);
		
		WebElement keepMeLoginCheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		System.out.println("CB visiblity status: "+keepMeLoginCheckBox.isDisplayed());
		System.out.println("CB selectable status: "+keepMeLoginCheckBox.isSelected());
		System.out.println("CB default selection status :"+keepMeLoginCheckBox.isSelected());
		keepMeLoginCheckBox.click();
		System.out.println("afet selection CB: "+keepMeLoginCheckBox.isSelected());
		
		WebElement loginB=driver.findElement(By.id("loginButton"));
		System.out.println("Visibility status: "+loginB.isDisplayed());
		System.out.println("enable or not: "+loginB.isEnabled());
		System.out.println("button name : "+loginB.getTagName());
		
	}

}
