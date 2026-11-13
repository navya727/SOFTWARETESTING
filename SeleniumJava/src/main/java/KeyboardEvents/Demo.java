package KeyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		//ENTER
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(4000);
//		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
//		search.sendKeys("Laptops"+Keys.ENTER);
		
		//BACKSPACE
//		search.sendKeys("stylish shirts");
//		Thread.sleep(4000);
//		search.sendKeys(Keys.BACK_SPACE);
//		search.sendKeys(Keys.CLEAR);
		
		//COPY PASTE
//		driver.get("https://demoqa.com/text-box");
//		WebElement address=driver.findElement(By.id("currentAddress"));
//		address.sendKeys("XYZ Apartment,Kochi");
//		address.sendKeys(Keys.CONTROL+"a");
//		address.sendKeys(Keys.CONTROL+"c");
//		WebElement p=driver.findElement(By.id("permanentAddress"));
//		p.sendKeys(Keys.CONTROL+"v");
		
		//SHIFTKEY
//		driver.get("https://demoqa.com/automation-practice-form");
//		Thread.sleep(4000);
//		WebElement email=driver.findElement(By.id("userEmail"));
//		email.sendKeys("abcd"+Keys.SHIFT+2);
//		email.sendKeys("gmail.com");
		
		//ARROWUP AND ARROW DOWN
//		driver.get("https://demoqa.com/select-menu");
//		Thread.sleep(4000);
//		WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
//		 dropdown.sendKeys(Keys.ARROW_DOWN);
//		 dropdown.sendKeys(Keys.ARROW_DOWN);
//		 dropdown.sendKeys(Keys.ARROW_DOWN);
//		 dropdown.sendKeys(Keys.ARROW_DOWN);
//		 dropdown.sendKeys(Keys.ARROW_UP);
//		 
		
		//DELETE
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Laptops");
		search.sendKeys(Keys.CONTROL+"a");
		search.sendKeys(Keys.DELETE);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
