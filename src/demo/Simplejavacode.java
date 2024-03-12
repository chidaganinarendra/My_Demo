package demo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simplejavacode {
	
	WebDriver driver;
	
	@Test
	public void open_Browser() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win32 (2)\\chromedriver-win32\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("https://www.google.co.in/");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	}
	   
	   @Test(priority=1)
		public void Google() {  
	  WebElement web  = driver.findElement(By.id("APjFqb"));
	  web.sendKeys("NarendraChidagani");
	  
	
	}
}

/*Scanner sc = new Scanner(System.in);
System.out.println(" Enter the values");

int a = sc.nextInt();
int b = sc.nextInt();

System.out.println(a + b);*/