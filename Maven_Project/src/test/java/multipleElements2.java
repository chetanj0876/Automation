import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleElements2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> suggList=driver.findElements(By.cssSelector("ul[class=G43f7e]>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
		System.out.println("Suggestion count "+suggList.size());
		
		for(int i=0;i<suggList.size();i++)
		{
			suggList=driver.findElements(By.cssSelector("ul[class=G43f7e]>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
			WebElement element=suggList.get(i);
			String suggestion=element.getText();
			System.out.println(suggestion);
		}

	}

}
