

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import reusableComponent.GenericFunction;
public class WithExplicitWait1 {

	public static void main(String[] args) {
		WebDriver driver=GenericFunction.createInstanceOfRequiredBrowser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://online.actitime.com/uts/login.do");
		driver.findElement(By.id("username")).sendKeys("admin01");
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		driver.findElement(By.id("loginButton")).click();
		String expectedTitle="actiTIME - Enter Time-Track";
		
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(20))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(ElementNotInteractableException.class);
		
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		
		String actualTitle=driver.getTitle();
		System.out.println("Actual Title "+actualTitle);
		boolean status=expectedTitle.equals(actualTitle);
		System.out.println("is login validation successful: "+status);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink")).click();
	}

}
