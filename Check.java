package Best_Buy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Check {
	  private static final String BESTBUY_URL = "https://www.bestbuy.com/";
	    private static final int MAX_SCROLL_ATTEMPTS = 3;

	    public static void main(String[] args) {
	        WebDriver driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Consider using explicit waits for better control

	        driver.get(BESTBUY_URL);
	        driver.findElement(By.xpath("(//img[@alt='United States'])[1]")).click(); // Selecting United state

	        // Define category data with expected titles
	        String[][] categoryData = {
	                {"Top Deals", "(//a[text()='Top Deals'])[1]", "Top Deals and Featured Offers on Electronics - Best Buy"},
	                // ... other categories with expected titles ...
	                {"Best Buy Outlet", "(//a[text()='Best Buy Outlet'])[2]", "Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy"},
	                // ... other categories ...
	        };

	        for (String[] category : categoryData) {
	            verifyCategoryDeals(driver, category[0], category[1], category[2]);
	        }

	        driver.quit();
	    }

	    public static void verifyCategoryDeals(WebDriver driver, String categoryName, String categoryXpath, String expectedTitle) {
	        driver.findElement(By.xpath("//button[normalize-space()='Menu']")).click();
	        driver.findElement(By.xpath("//button[text()='Deals']")).click();

	        // Scroll to element if not found initially (uncomment if needed)
	        
	        for (int attempt = 0; attempt < MAX_SCROLL_ATTEMPTS; attempt++) {
	            try {
	                driver.findElement(By.xpath(categoryXpath)).click();
	                break;
	            } catch (NoSuchElementException e) {
	                scrollToElement(driver, categoryXpath);
	                System.out.println("Element not found in viewport, retrying scroll attempt: " + (attempt + 1));
	            }
	        }
	        

	        // Use explicit wait for reliable click
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(categoryXpath))).click();

	        String title = driver.getTitle();

	        if (title.equalsIgnoreCase(expectedTitle)) {
	            System.out.println("Test passed: " + categoryName + " Page Title verified");
	        } else {
	            System.out.println("Test failed: Expected Title is " + expectedTitle + " but Actual title is " + title);
	        }

	        driver.navigate().back();
	    }

	    private static void scrollToElement(WebDriver driver, String xpath) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(xpath)));
	    }
	}



