package SeleniumProgrames;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//how to lunch the browser
		WebDriver driver=new ChromeDriver();
		
		//how to open the application
		driver.get("  ");
		
		//how to get the current url of the applications
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Page current url is  :"+currentUrl);
		
		//how to get title of the page
		String title=driver.getTitle();
		System.out.println("Pabe title is  :"+title);
		
		//how to resize youer browser
		Dimension dimension=new Dimension(500,600);
		driver.manage().window().setSize(dimension);
		
		//how to change the position of the browser
		Point point=new Point(200,300);
		driver.manage().window().setPosition(point);
		
		
		//how to maximize the browser
		driver.manage().window().maximize();
		
		//how to minimize the browser
		//driver.manage().window().minimize();----->this method are not supported selenium 3 version for upadation piont
		
		//how to close the  browser
		driver.close();
		
		//how to close all window this window open by selenium webdriver
		driver.quit();
		
		//purpose for the navigate method
		driver.navigate().to("  ");//open the appliction
		
		driver.navigate().back();//click backword button
		
		driver.navigate().forward();//click forword
		
		driver.navigate().refresh();//click on refresh button
		
		
		
	}

}
