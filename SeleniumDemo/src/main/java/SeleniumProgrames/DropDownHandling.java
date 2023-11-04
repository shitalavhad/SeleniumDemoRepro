package SeleniumProgrames;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.By;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {

	public static void main(String[] args) {
		
		//lunch the browser
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//open the applictaion
		driver.get("   ");
		
		//locate the element or drp
		WebElement animalDrp=driver.findElement(By.xpath("  "));
		
		//create the instance of the Select class
		Select select=new Select(animalDrp);
		
		select.selectByIndex(1);
		
		select.selectByVisibleText("string");
		
		select.selectByValue("string");
		select.deselectByIndex(1);
		
		

	}

}
