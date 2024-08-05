package selenium;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class class6 {

		public static void main(String[] args) throws InterruptedException {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\Victus\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				Thread.sleep(3000);
				
				WebElement un=driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
				un.sendKeys("Admin");
				WebElement pw=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
				pw.sendKeys("admin123");
				WebElement log=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
				log.click();			
				
			

		}

	}

