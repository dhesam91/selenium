package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class SwitchToTab {
	
	WebDriver driver;
	
	
	@Test(priority=0)
	public void firsttab() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  driver = new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://google.com");
		  System.out.println(driver.getTitle());
		  Thread.sleep(2000);
		  
		  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		  
		  driver.get("https://www.yahoo.com/");
		  System.out.println(driver.getTitle());
	}
		  @Test(priority=1)
			public void secondtab() throws InterruptedException {
			  
				  driver.get("https://www.yahoo.com/");
				  System.out.println(driver.getTitle());
				  Thread.sleep(2000);
		
	}

}
