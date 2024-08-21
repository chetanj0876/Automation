

import org.openqa.selenium.chrome.ChromeDriver;

public class FB {

	public static void main(String[] args) {
		
		ChromeDriver cd= new ChromeDriver();
		String url="https://www.facebook.com/";
		cd.get(url);
		String expectedtitle="Facebook – log in or sign up";
		String title=cd.getTitle();
		System.out.println("Application Title: "+title);
		System.out.println("No. of character in application title: "+title.length());
		String currenturl=cd.getCurrentUrl();
		System.out.println("Application URL: "+currenturl);
		if (title.equals(expectedtitle))
		{
			System.out.println("Actual Title: "+title+ " == "+"Expected Title: "+expectedtitle);
		}
		else
		{
			System.out.println("Actual Title: "+title+ " == "+"Expected Title: "+expectedtitle);	
		}
		System.out.println("Verify if correct page is opened: "+title.equals(expectedtitle));
		String pagesource=cd.getPageSource();
		System.out.println("Page Source Length: "+pagesource.length());
		cd.close();
	}

}

