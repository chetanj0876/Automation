import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownExample2 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dropDown=driver.findElement(By.id("multiselect1"));
		Select select=new Select(dropDown);
		System.out.println("is this dropdown allow multiple selection "+select.isMultiple());
		
		List<WebElement> skillList=select.getOptions();
		System.out.println("Skill count: "+skillList.size());
		
		for(int i=0;i<skillList.size();i++)
		{
			System.out.println(skillList.get(i).getText());
		}
		
		select.selectByIndex(0);
		select.selectByValue("swiftx");
		select.selectByVisibleText("Audi");
		
		List<WebElement> selectedOptions=select.getAllSelectedOptions();
		for(WebElement element:selectedOptions)
		{
			System.out.println(element.getText());
		}
		
		//select.deselectAll();
		select.deselectByIndex(0);
		select.deselectByValue("swiftx");
		select.deselectByVisibleText("Audi");
		selectedOptions=select.getAllSelectedOptions();
		System.out.println("After deselect count "+selectedOptions.size());
	}

}
