package selenium;

import org.openqa.selenium.WebDriver;

public class classflipkart {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ambes\\Downloads\\chromedriver-win64 (1)\\chromedriver.exe");                                                                                                                        ")
WebDriver driver=new chromeDriver();
Driver.get("https://www.youtube.com/");
System.out.println(driver.getTitle());
System.out..println(driver.getCurrentURL());
driver.quit();

	}

}
