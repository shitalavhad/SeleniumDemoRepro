package SeleniumProgrames;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethod {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("   ");
		
		//SendKeys method
		WebElement textField=driver.findElement(By.xpath("  "));
		textField.sendKeys("shital");
		
		//Click metods
		WebElement radioButton=driver.findElement(By.xpath("  "));
		radioButton.click();
		
		//clear method
		WebElement passwordField=driver.findElement(By.xpath("  "));
		passwordField.clear();
		 
		//getText()Method
		WebElement logo=driver.findElement(By.xpath("  "));
		String logoInfo=logo.getText();
		System.out.println(logoInfo);
		
		//getAttriubute()method
		WebElement loginButton=driver.findElement(By.xpath("   "));
		loginButton.getAttribute("value");
		System.out.println(loginButton);

		
		
	

	}

}
