package test;


import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class mavenBasic {
	
	@Ignore
	public void demo1() {
		System.out.println("Hello World");
		assert 1==1;
	}

	@Test
	public void demo2() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("naresh");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\'u_0_2\']")).click();
		
	}
	

	
}
