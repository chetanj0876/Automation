
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_browser {

	public static void main(String[] args) {
		
		ChromeDriver cd= new ChromeDriver();
		String url ="https://demo.vtiger.com/crm-demo/";
		cd.get(url);
		
		String title=cd.getTitle();
		System.out.println("Application Title: "+title);
		System.out.println("No. of character in application title: "+title.length());
		String currenturl=cd.getCurrentUrl();
		System.out.println("Application URL: "+currenturl);
		if (url.equals(currenturl))
		{
			System.out.println("Actual URL: "+url+ " == "+"Expected URL: "+currenturl);
		}
		else
		{
			System.out.println("Actual URL: "+url+ " == "+"Expected URL: "+currenturl);	
		}
		System.out.println("Verify if correct URL is opened: "+url.equals(currenturl));
		String pagesource=cd.getPageSource();
		System.out.println("Page Source Length: "+pagesource.length());
		cd.quit();
	}

}
