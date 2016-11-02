package com.rodan.base;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RodanBase {

		protected WebDriver driver;
		
		@BeforeTest
		public void beforeTest()
		{
		driver = new FirefoxDriver(); //creating object for firefox
		driver.manage().window().maximize();  //command to maximize the window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		@AfterTest
		public void afterTest() throws InterruptedException
		{
		Thread.sleep(1000);
		driver.quit();
		}
}
