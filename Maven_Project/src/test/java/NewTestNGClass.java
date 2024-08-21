import java.time.Duration;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NewTestNGClass {
  @Test
  public void OrangeHRMCreation() throws InterruptedException {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().window().fullscreen();
	  
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	  driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
	  driver.findElement(By.className("orangehrm-login-button")).click();
	  
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
	  driver.findElement(By.xpath("//button[text()=' Add ']")).click();
	  
	  
	  driver.findElement(By.name("firstName")).sendKeys("Chetan");
	  driver.findElement(By.name("lastName")).sendKeys("J");
	  
	  
	  Actions a=new Actions(driver);
	  WebElement empid=driver.findElement(By.xpath("//label[text()='Employee Id']//following::input"));
	  Thread.sleep(3000);
	  a.doubleClick(empid).sendKeys("1001").build().perform();
	  driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
	  driver.findElement(By.xpath("//label[text()='Employee Id']//following::input")).sendKeys("1001");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[text()=' Search ']")).click();
	  
	  
	  
	 
  }
}
