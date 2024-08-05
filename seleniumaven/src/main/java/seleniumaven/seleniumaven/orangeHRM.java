package seleniumaven.seleniumaven;

import org.testng.annotations.BeforeTest;

public class orangeHRM {
	WebDriver deiver=new ChromeDriver();
	String driverPath = "C:\\Users\\ambes\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";
	
	@BeforeTest
	void navigate()
	driver.get("https://firstcrystore.in/");
	

}
