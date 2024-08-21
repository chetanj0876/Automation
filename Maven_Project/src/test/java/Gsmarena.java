import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsmarena {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.gsmarena.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		                                                  //* from all the class name present is brandname present 
		List<WebElement> phoneNames=driver.findElements(By.cssSelector("div[class*='brandmenu-v2']>ul>li>a"));
		System.out.println("Total No. of Phones present are: "+phoneNames.size());
		
		for (int i=0;i<phoneNames.size();i++)
		{
			WebElement pElement=phoneNames.get(i);
			
			String Pname=pElement.getText();
			System.out.println("Phone availabe "+Pname);
		}
	
		WebElement samsung=driver.findElement(By.cssSelector("aside>div>ul>*:nth-child(1)"));
		samsung.click();
		
		List<WebElement> samsungphones=driver.findElements(By.cssSelector("div[class=makers]>ul>li"));
		System.out.println("Total no. of phones available :"+samsungphones.size());
		
		for(int j=0;j<samsungphones.size();j++)
		{
			WebElement selement=samsungphones.get(j);
			
			String Sphones=selement.getText();
			
			System.out.println("Names of samsung phones available :"+Sphones);
		}
	}

}
