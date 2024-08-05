package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class3 {
	public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","https://play.google.com/store/apps/details?id=com.android.chrome&hl=en_IN");	
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.youtube.com/");
    //implicit wait
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    WebElement txtmail=driver.findElement(By.xpath(""));
    txtmail.sendKeys("");
    }

}
