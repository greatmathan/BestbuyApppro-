package Best_Buy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBestBUy {

	public static void main(String[] args) throws InterruptedException {
		
		RemoteWebDriver Driver=new EdgeDriver();
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Driver.get("https://www.bestbuy.com/");
		Driver.manage().window().maximize();
		
		//select us site
		Driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[2]/a[2]")).click();
		Thread.sleep(1000);
		//menu
		
//		Driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/header/div[2]/div/nav")).click();
//		//Select Deals Button
//		Driver.findElement(By.xpath("//button[text()='Deals']")).click();
//		//*checking
//		//Driver.findElement(By.xpath("/html/body/main/div[2]/div[3]/div/div/div/aside/div/div[2]/div[1]/button")).click();
//		
//		Thread.sleep(1000);
//		//Select to Best Buy outlet
//		//Driver.findElement(By.xpath("(//a[text()='Best Buy Outlet'])[1]")).click();
//		//**
//		WebElement element = Driver.findElement(By.xpath("(//a[text()='Best Buy Outlet'])[1]"));
//		Actions actions = new Actions(Driver);
//		actions.moveToElement(element).click().build().perform(); 
//		Driver.findElement(By.xpath("(//a[text()='Best Buy Outlet'])[1]")).click();
//		//**
//		//Get Title Verification
//		String Best_Buy=Driver.getTitle();
//		//Giving Expected Title
//		String ExpectBestBuy="Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy";
//		//Checking If title Verification
//		
//		if(Best_Buy.equalsIgnoreCase(ExpectBestBuy)) {
//			System.out.println("Test Passed : Best Buy Outlet: Clearance Electronics Outlet Store is Verified 4 ");
//		}else {
//			System.out.println("Test Failed : Unexpected Found " + Best_Buy);
//		}
		// Navigate To Back Main Menu
				/*Driver.navigate().back();
				Driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/header/div[2]/div/nav/button")).click();
				//Select Deals Button
				Driver.findElement(By.xpath("//button[text()='Deals']")).click();
				//Select a Text Apple Shopping Event
				Driver.findElement(By.xpath("(//a[text()='Apple Shopping Event'])[1]")).click();
				//Apple Get Title
				String Apple=Driver.getTitle();
				String AppleTitle="Apple Shopping Event – Best Buy";
				if(Apple.equalsIgnoreCase(AppleTitle)) {
					System.out.println("Test Case Passed: Apple Shopping Event Title is Verified");
				}else {
					System.out.println("Test Failed :  UnExpected Found " + Apple);
				}
				// nvigate Back To Menu
				Driver.navigate().back();
				Thread.sleep(2000);
				// Select Menu Button
				Driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/header/div[2]/div/nav")).click();
				
				//Select Deals Button
				Driver.findElement(By.xpath("//button[text()='Deals']")).click();
				//Select Video Games text
				Driver.findElement(By.xpath("//a[text()='Video Games & VR']")).click();
				// Get Title
				
			String Video=Driver.getTitle();
			String VideoTitle="Top Deals on Video Games and Consoles - Best Buy";//expected
			if(Video.equalsIgnoreCase(VideoTitle)) {
				System.out.println("Test Passed : Top Deals on Video Games and Consoles - is Verified " );
			}else {
				System.out.println("Test Failed :  UnExpected Element Found  " );
			}
			Driver.navigate().back();
			Thread.sleep(2000);
			// Select Menu Button
			Driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/header/div[2]/div/nav")).click();
			
			//Select Deals Button
			Driver.findElement(By.xpath("//button[text()='Deals']")).click();
			//Select CellPhone Text
			Driver.findElement(By.xpath("//a[text()='Cell Phones']")).click();
			//Get Tile Cellphone
			String Cell=Driver.getTitle();
			String CellPhone="Top Deals on Cell Phones and Accessories - Best Buy";
			if(Cell.equalsIgnoreCase(CellPhone)) {
				System.out.println("Test Passed : Top Deals on Cell Phones and Accessories - is Verified ");
				}else {
					System.out.println("Test Failed :UnExpected Found "+ Cell);
					
				}*/
			//Navigate To Main Menu 
			//Driver.navigate().back();
		// Select main menu
			Driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/header/div[2]/div/nav/button")).click();
		
			//Select Deals Button
			Driver.findElement(By.xpath("//button[text()='Deals']")).click();
			
			//imp*Scroll Down 
			JavascriptExecutor Js1 = (JavascriptExecutor) Driver;
			Js1.executeScript("window.scrollBy(0,1000)");
	    	Thread.sleep(2000);
			
	    	//Select text
			Driver.findElement(By.xpath("//a[text()='PC Gaming']")).click();
			
			
			
//			try {
//				Driver.findElement(By.xpath("(//a[text()='PC Gaming'])")).click();
//			} catch (NoSuchElementException e) {
//				e.printStackTrace();
//
//				Driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/header/div[2]/div/nav")).click();
//			}
			
			
				 
			
			//get Title
			String Gaming=Driver.getTitle();
			String GamingTitile="Top Deals on PC Gaming Electronics - Best Buy";
			if(Gaming.equalsIgnoreCase(GamingTitile)) {
				System.out.println("Test Passed : Top Deals on PC Gaming Electronics - Best Buy ");
			}else {
				System.out.println("Test Failed : UnExpected Found " + Gaming);
			}
	}
}
