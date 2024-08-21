import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssValidationWithPosition {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/uts/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("loginButton")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		String expectedErrormsg="Username or Password is invalid. Please try again.";
		wait.until(ExpectedConditions.textToBe(By.className("errormsg"), expectedErrormsg));
		
		WebElement errorMsg =driver.findElement(By.className("errormsg"));
		String actualErrorMsg=errorMsg.getText();
		
		System.out.println("Error msg Validation "+expectedErrormsg.equals(actualErrorMsg));
		
		System.out.println("Error msg color code in RGBA format "+errorMsg.getCssValue("color"));
		System.out.println("Error msg font family "+errorMsg.getCssValue("font-family"));
		System.out.println("Error msg font size "+errorMsg.getCssValue("font-size"));
		
		Point errorMsgPoint=errorMsg.getLocation();
		int errorMsg_x=errorMsgPoint.getX();
		int errorMsg_y=errorMsgPoint.getY();
		System.out.println("Error msg  x and y cordinates are "+errorMsg_x+","+errorMsg_y);
		
		WebElement userNameInputField=driver.findElement(By.id("username"));
		Point userNameInputFieldPoint=userNameInputField.getLocation();
		int userNameInputField_x=userNameInputFieldPoint.getX();
		int userNameInputField_y=userNameInputFieldPoint.getY();
		System.out.println("Username Input Field X and Y Cordinates are "+userNameInputField_x+","+userNameInputField_y);
		
		System.out.println("Is error msg displayed above username input field? "+(errorMsg_y < userNameInputField_y));
		
	}

}
