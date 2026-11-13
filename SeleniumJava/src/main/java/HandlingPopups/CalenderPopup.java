package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderPopup {

	public static void main(String[] args)  throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20)); //Explicit wait
		
		driver.switchTo().frame(0); //to switch focus
		WebElement datepicker=driver.findElement(By.id("datepicker"));
		datepicker.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='1']")).click();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
