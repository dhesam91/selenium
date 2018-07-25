package com.qa.test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Library.Utility;
import Library.Utility1;

public class MultipleWindow {
	
	 ExtentReports extent;
	 ExtentTest logger;
	 WebDriver driver;
	  Set<String> AllWindowHandles = driver.getWindowHandles();
	  String window1 = (String) AllWindowHandles.toArray()[0];
	  String window2 = (String) AllWindowHandles.toArray()[1];
	

	@Test(priority=0)
	public void google() {
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
	}
	

	@Test(priority=1)
	public void yahoo() {
		driver.get("https://yahoo.com/");
	}
}