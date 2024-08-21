import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cricInfo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		Actions action =new Actions(driver);
		
		List <WebElement> mainMenuList = driver.findElements(By.xpath("//div[@class='ds-flex ds-flex-row']/div/a"));
		action.moveToElement(mainMenuList.get(0), 0, 0).perform();
		
		for(int i=0;i<mainMenuList.size();i++)
		{
			action.moveToElement(mainMenuList.get(i)).perform();
		}
	}

}
