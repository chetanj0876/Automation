import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class eclipsexp {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("p")).sendKeys("selenium");
		
		List<WebElement> suggList=driver.findElements(By.cssSelector("ul[class=sa-list]>li>span"));
		System.out.println("Suggestion count "+suggList.size());
		
		for(int i=0;i<suggList.size();i++)
		{
			suggList=driver.findElements(By.cssSelector("ul[class=sa-list]>li>span"));
			WebElement element=suggList.get(i);
			String suggestion=element.getText();
			System.out.println(suggestion);
		}

	}

}
