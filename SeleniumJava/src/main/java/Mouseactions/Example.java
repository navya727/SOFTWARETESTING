package Mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example {

	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		//MOUSE HOVERING
//		Thread.sleep(4000);
//		Actions act=new Actions(driver);
//		WebElement a=driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
//		act.moveToElement(a).build().perform();
//		
//		//RIGHT CLICK
//		driver.get("https://demoqa.com/buttons");
//		Thread.sleep(4000);
//		Actions act=new Actions(driver);
//		WebElement rc=driver.findElement(By.id("rightClickBtn"));
//		act.contextClick(rc).build().perform();
//		
//		//DOUBLE CLICK
//		WebElement dc=driver.findElement(By.id("doubleClickBtn"));
//		act.doubleClick(dc).build().perform();
//		
		//DRAG AND DROP
//		driver.get("https://demoqa.com/droppable");
//		Thread.sleep(4000);
//		Actions act=new Actions(driver);
//		WebElement src=driver.findElement(By.id("draggable"));
//		Thread.sleep(4000);
//		WebElement target=driver.findElement(By.id("droppable"));
//		act.dragAndDrop(src, target).build().perform();
//		
		
	//CLICK AND HOLD
//		WebElement src=driver.findElement(By.id("draggable"));
//     	Thread.sleep(4000);
//    	WebElement target=driver.findElement(By.id("droppable"));
//		act.clickAndHold(src);
//		act.moveByOffset(200,0);
//		act.release().build().perform();
		
		//SCROLL BY PIXEL
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");//scroll down
//		Thread.sleep(4000);
//		js.executeScript("window.scrollBy(0,-500)");//scroll up
//		
		//SCROLL UPTO A PARTICULAR WEBELEMENT
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//div[text()='Back to top']"));
		Thread.sleep(4000);
		act.scrollToElement(ele).build().perform();
		
		
		
		// TODO Auto-generated method stub

	}

}
