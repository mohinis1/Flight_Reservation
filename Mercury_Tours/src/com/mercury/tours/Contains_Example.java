package com.mercury.tours;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Contains_Example {
	//ChromeDriver driver;
	//ChromeOptions options=new ChromeOptions();
	FirefoxDriver driver=new FirefoxDriver();
	
  @Test
  public void Sign_On() throws InterruptedException {
	  driver.findElement(By.linkText("SIGN-ON")).click();
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("testing");
		//driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.name("findFlights")).click();
		Thread.sleep(6000);
		
		//Radio button Oneway
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		
		Select SelectPass = new Select(driver.findElement(By.name("passCount")));
		SelectPass.selectByValue("4");
		
		Select oselect=new Select(driver.findElement(By.name("fromPort")));
		oselect.selectByValue("London");
		driver.findElementByXPath("//input[@value='Business']").click();
		//Continue button
		driver.findElementByName("findFlights").click();
		
		String depart=driver.findElement(By.xpath("//td[@class='title']//font[contains(text(),'DEPART')]")).getText();
		
		
		
		
  }
  @BeforeTest
  public void LaunchBrowser() {

	    String absolutePath=System.getProperty("user.dir");
	    String filePath=absolutePath+"\\Drivers"+"\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", filePath);
		//String filePath=absolutePath+"\\Drivers"+"\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", filePath);
		//driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://newtours.demouat.com");
  }

  @AfterTest
  public void CloseBrowser() {
	  driver.quit();
  }

}
