import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleElements1 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Link count: "+links.size());
		
		for(int i=0;i<links.size();i++) {
			WebElement element=links.get(i);
			String linkUrl=element.getAttribute("href");
			System.out.println("Link "+i+" "+linkUrl);
		}
	}

}
