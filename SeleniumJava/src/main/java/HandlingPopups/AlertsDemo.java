package HandlingPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		//SIMPLE ALERT
		
//		driver.get("https://demoqa.com/alerts");
//		Thread.sleep(4000);
//		driver.findElement(By.id("alertButton")).click();
//		Alert a=driver.switchTo().alert(); 
//		Thread.sleep(4000);//ALERT DETECTION
//		a.accept();
//		
		//CONFIRMATION ALERT
		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(4000);
//		driver.findElement(By.id("confirmButton")).click();
//		Alert a=driver.switchTo().alert(); 
//		Thread.sleep(4000);
//		a.dismiss();//or accept()
		
		//PROMPT ALERT
		
		driver.findElement(By.id("promtButton")).click();
		Alert a=driver.switchTo().alert(); 
		Thread.sleep(4000);
		a.sendKeys("hii all");
		Thread.sleep(4000);
		a.accept();
		
		
		// TODO Auto-generated method stub

	}

}
