package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IdentifyingObject
{

public static void main (String[] args) throws InterruptedException 
{  
	
	
	   
//*************************** RUNNING CHROME DRIVER *****************************************************
	
	
	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	 	 

//***********************************RUNNING IN FIREFOX *************************************************
	   
	   
	//System.setProperty("webdriver.gecko.driver","/C:/seleniumjava/geckodriver");
	//WebDriver driver = new FirefoxDriver();
	
//***********************************************************************************************************
	   
	//  System.setProperty("webdriver.ie.driver", "C:\\iedriver\\IEDriverServer.exe");
				 //	 WebDriver driver = new InternetExplorerDriver();	   
	   
//************************************************************************************
	//MAC
//Sysystem.setProperty("webdriver.chrome.driver",File.seperator+"User"+File.seprator+"downloads"+File.seperator+"chromedriver");
	  // WEBDRIVER IS INTERFACE AND CHROME DRIVER AND FIREFOX DRIVER IS CLASS.
	 
//*************************************************************************************************************	  
	
	 	 String url ="http://www.xpr2t.com/Webobjects.html";
	 
//Maximize the browser
	 	 driver.manage().window().maximize();
	 	
//Open the application in the browser
	 	  driver.get(url);
	 	//  driver.navigate().to(url);   ---- ANOTHER WAY OF PASSING URL
// Hard wait for 5 sec
	 	  Thread.sleep(5000);
	 	 	 
// TEXT FIELD IDENTIFICATION
	 	 	 driver.findElement(By.id("usernameid")).sendKeys("Selenium");
	 	 	 
//************* ANOTHER WAY OF TEXT FIELD IDENTIFICATION  *********************************	 	 	 
	 	 	 WebElement usernametf= driver.findElement(By.id("usernameid"));
	 	 	usernametf.sendKeys("selenium");
//*****************************************************************************************
	 	 	 //SLEEP 
	 	 	  Thread.sleep(5000);
//GET TEXT FROM TEXTFIELD  - 2 WAYS CAN RETRIVE TEXT FROM TEXT FILED
	 	 //	  String text=driver.findElement(By.id("usernameid")).getText();
	 	 	  String text=driver.findElement(By.id("usernameid")).getAttribute("value");
	 	 	  
//PRINT THE VALUE IN THE CONSOLE
	 	 	  System.out.println("text filed value is :" +text);
//CLEAR TEXTFILED
	 	 	  driver.findElement(By.id("usernameid")).clear();
	 	 		 
//RADIO BUTTON IDENTIFICATION
	 	 	  driver.findElement(By.name("radiobutton1")).click();
	 	 	  driver.findElement(By.name("radiobutton2")).click();
	 	 	  driver.findElement(By.name("radiobutton3")).click();

	 	   	 	  
//CHECKBOX IDENTIFICATION
	 	 	 driver.findElement(By.name("checkthebox")).click();
	 	 	 
//SELECT DROP DOWN BOX
	 	 	  Select drp = new Select(driver.findElement(By.id("test")));
	 	 	  drp.selectByVisibleText("Blue");
	 	  
//SELECT MULTIPLE VALUES FROM LIST BOX
	 	 	  Select mulcountry = new Select(driver.findElement(By.name("dropdown")));
	 	 	  mulcountry.selectByVisibleText("Audi");
	 	 	  mulcountry.selectByVisibleText("Honda CRV"); 
	 	 
	 	  	  
//CLICK ON LINK 
	 		   driver.findElement(By.linkText("1.Yahoo")).click();
	 		   Thread.sleep(2000);
//NAVIGATE BROSER BACK
	 		   driver.navigate().back();
	 	       Thread.sleep(5000);
	       
// Relative XPATH  for Submit button
	 	//	   driver.findElement(By.xpath(".//input[@type='submit']")).click(); 
	 	       
// absloute path - html/body/font/p[1]/input
	 	   
	 	       driver.findElement(By.xpath("html/body/table[6]/tbody/tr[2]/td[2]/input")).click();
     
//MANAGET ALERT -  CLICK ON ALERT BUTTON
	 	       driver.findElement(By.xpath("html/body/table[9]/tbody/tr/td/button")).click();	  	
//CAPTURING THE Alert Message
	 	 	   String alertMessage = driver.switchTo().alert().getText();
	 		   System.out.println(alertMessage);
//CLICK ON ALERT OK BUTTON
	 		   driver.switchTo().alert().accept();
//Click ON CANCEL BUTTON
	 		   //driver.switchTo().alert().dismiss();
	 		   Thread.sleep(5000);

//HANDLE TABLE - CAPTURE TEXT  
	 		   
	 		    WebElement val = driver.findElement(By.xpath("html/body/table[10]/tbody/tr/td"));
	 			System.out.println("Another approach cell value :"+val.getText());
	 		      
//HANDLE FRAMES - SWITCH TO  FRAME
	 			//SWITHC TO FRAME WITH ELEMENT
	 			  WebElement  iframe= driver.findElement(By.tagName("iframe"));
	 		     driver.switchTo().frame(iframe);
	 			
//SWITCH TO FRAME - WITH TO FRAME WITH FRAME NUMBER 
	 			   //driver.switchTo().frame(0);
//GETTING NO OF FRAMES 		     
//	 			  int size = driver.findElements(By.tagName("iframe")).size();
				  // WebElement  iframe= driver.findElement(By.xpath()("iframe"));
	 		     
	 			     driver.findElement(By.linkText("REGISTER")).click();
	 			     Thread.sleep(5000);
//SWITHC TO MAIN CONTENT
	 			     driver.switchTo().defaultContent();

//JAVA SCRIPT EXECUTOR ***********************************************
	 			     
	 	   /*    // Java Script executor 
	 	       JavascriptExecutor javascript = (JavascriptExecutor) driver; 
	 		     javascript.executeScript("alert('Test Case Execution Is started Now..');"); 
	 		     Thread.sleep(2000); 
	 		     driver.switchTo().alert().accept();  */
	 	       ////To click on "Continue to this website (not recommended)." link to load original website. 
	 	       //driver.navigate().to("javascript:document.getElementById('overridelink').click()");
//*********************************************************************
	 			     
//CLOSE THE CURRENT BROWSER
	 	       driver.close();
//CLOSE ALL OPENED BROWSERS
	 	       driver.quit();

}
}