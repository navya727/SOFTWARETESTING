package HandlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup {

	public static void main(String[] args)  throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(4000);
		String parentwindow=driver.getWindowHandle(); //TO CAPTURE ID OF THE PARENTWINDOW
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		System.out.println(parentwindow);
		String childwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//h3[text()='New Window']")).click();
		System.out.println(childwindow);
		
			
		// TODO Auto-generated method stub

	}

}
