import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleElements3 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> driverNames=driver.findElements(By.cssSelector("h4[class=card-title]>a"));
		List<WebElement> driverPrices=driver.findElements(By.cssSelector("div[class=card-block]>h5"));
		
		for(int i=0;i<driverNames.size();i++)
		{
			WebElement device=driverNames.get(i);
			WebElement price=driverPrices.get(i);
			
			String Ddevice=device.getText();
			String Pprice=price.getText();
			System.out.println(Ddevice+"\n"+Pprice+"\n"+device+"\n"+price);
		}

	}

}
