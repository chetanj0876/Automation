import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import reusableComponent.GenericFunction;
public class AmazonAuto {

	public static void main(String[] args) {
		WebDriver driver=GenericFunction.createInstanceOfRequiredBrowser("chrome");
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		String Title=driver.getTitle();
		System.out.println("Title of the website is : " +Title);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		driver.findElement(By.linkText("Amazon miniTV")).click();
		
		String ExpminiTVTitle="Amazon miniTV - Watch Free Web Series, Movies, Short Films & K-Dramas Online";
		String ActMiniTVTitle=driver.getTitle();
		System.out.println("Is Title verified : "+ExpminiTVTitle.equals(ActMiniTVTitle));
		
		driver.navigate().back();
		
		String expHomePage="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actHomePage=driver.getTitle();
		System.out.println("Is Home Page Verified: "+expHomePage.equals(actHomePage));
		
		driver.findElement(By.linkText("Sell")).click();
		
		String ExpminiSellTitle="Amazon.in: : Start Selling on Amazon.in";
		String ActMiniSellTitle=driver.getTitle();
		System.out.println("Is Sell Title verified : "+ExpminiSellTitle.equals(ActMiniSellTitle));
		
		driver.navigate().back();
	
		System.out.println("Is Home Page Verified: "+expHomePage.equals(actHomePage));
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
		String ExpminiBestSellerTitle="Amazon.in Bestsellers: The most popular items on Amazon";
		String ActMiniBestSellerTitle=driver.getTitle();
		System.out.println("Is Best Sellers Title verified : "+ExpminiBestSellerTitle.equals(ActMiniBestSellerTitle));
		
		driver.navigate().back();
		
		driver.close();
		
		
	}

}
