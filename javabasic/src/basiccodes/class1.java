package basiccodes;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
org.testng.annotations
public class BeforeTest {
}

@Test
public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ambes\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		@BeforeTest

		void navigate() throws InterruptedException {

			driver.get("https://firstcrystore.in/");

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			driver.manage().window().maximize();

			Thread.sleep(2000);

			//driver.manage().window().minimize();

		   // driver.quit();

		}

		void account() {

			WebElement accountlog=driver.findElement(By.xpath("//span[normalize-space()='Account']"));

			           accountlog.click();

			           

		}

		void login() {

			WebElement usname=driver.findElement(By.xpath("//input[@name='email']"));

			           usname.sendKeys("nigambrijesh540@gmail.com");

		}

		void pass() {

			WebElement password=driver.findElement(By.xpath("//input[@name='password']"));

			           password.sendKeys("Pgl@11072003");

		}

		void singinbutton() throws InterruptedException {

			WebElement singinbutton =driver.findElement(By.xpath("//button[@type='submit']"));

			           singinbutton.click();

			Thread.sleep(4000);

			Alert singbutton = driver.switchTo().alert();

			      singbutton.accept();

			   

		}

		void Accessories() throws InterruptedException {

			WebElement Accessories =driver.findElement(By.xpath("//div[@class='top-cotegories hover-product-list y-gap']"));

			           Accessories.click();

			           

		}

		

		void Breastpump() {

			WebElement Breastpump =driver.findElement(By.xpath("//li[normalize-space()='Breast Pump']"));

	                   Breastpump.click();

	                   

		        }

		void babybedwithnet() {

			WebElement babybedwithnet =driver.findElement(By.xpath("//li[normalize-space()='Baby Bed With Net']"));

			           babybedwithnet.click();

	                  

		

		}

		void BabyCradleAutomaticSwing() {

			WebElement BabyCradleAutomaticSwing =driver.findElement(By.xpath("//li[normalize-space()='Baby Cradle Automatic Swing']"));

		               BabyCradleAutomaticSwing.click();

	                   

		

		}

		void BabyhugCarSeat() {

			WebElement BabyhugCarSeat =driver.findElement(By.xpath("//li[normalize-space()='Babyhug Car Seat']"));

			           BabyhugCarSeat.click();

	                   

		

		}

		void CradleSwing() {

			WebElement CradleSwing=driver.findElement(By.xpath("//li[normalize-space()='Cradle Swing']"));

			           CradleSwing.click();

	                  

		}

	      void ElectricBabySwing() {

	    	  WebElement ElectricBabySwing=driver.findElement(By.xpath("//li[normalize-space()='Electric Baby Swing']"));

	                     ElectricBabySwing.click();

	                    

	      }

	      void Babypalna()  {

	    	  WebElement Babypalna=driver.findElement(By.xpath("//li[normalize-space()='Baby palna']"));

	    	             Babypalna.click();

	    	            

	      	}

	      void BabyBouncerandRocker()  {

	    	  WebElement BabyBouncerandRocker=driver.findElement(By.xpath("//li[normalize-space()='Baby Bouncer and Rocker']"));

	    	             BabyBouncerandRocker.click();

	    	          

	      }

	      void BabyBoosterChair()  {

	    	  WebElement BabyBoosterChair=driver.findElement(By.xpath("//li[normalize-space()='Baby Booster Chair']"));

	    	             BabyBoosterChair.click();

	    	             driver.navigate().refresh();

	    	             

	    	        }

	      void AddtoCart()   {

	    	  

	    	  WebElement AddtoCart=driver.findElement(By.xpath("//button[@class=\"btn cart-btn\"][@fdprocessedid=\"185m7\"]"));

	    	             AddtoCart.click();

	    	   WebElement adc=driver.findElement(By.xpath("//button[@class='btn btn-primary px-3 ripple-surface']"));

	    	   adc.click();
	      }

	      void Cart()  {

	    	  WebElement Cart=driver.findElement(By.xpath("//span[normalize-space()='Cart']"));

	    	             Cart.click();

	    	             driver.navigate().refresh();

	  




	}

}
