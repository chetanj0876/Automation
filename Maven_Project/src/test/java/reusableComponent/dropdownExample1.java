package reusableComponent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownExample1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement skillsDropdown=driver.findElement(By.id("Skills"));
		Select skillSelect=new Select(skillsDropdown);
		System.out.println("Does this dropdown allow multiple selection "+skillSelect.isMultiple());
		System.out.println("Already selected value in dropdown: "+skillSelect.getFirstSelectedOption().getText());
		skillSelect.selectByIndex(3);
		System.out.println("After 1st selection selected value is: "+skillSelect.getFirstSelectedOption().getText());
		skillSelect.selectByValue("AutoCAD");
		System.out.println("After 2nd selection selected value is: "+skillSelect.getFirstSelectedOption().getText());
		skillSelect.selectByVisibleText("Backup Management");
		System.out.println("After 3rd selection selected value is: "+skillSelect.getFirstSelectedOption().getText());
		List<WebElement> skillList=skillSelect.getOptions();
		System.out.println("Skill :"+skillList.size());
		
		for(int i=0;i<skillList.size();i++)
		{
			System.out.println(skillList.get(i).getText());
		}
		
		
	}

}
