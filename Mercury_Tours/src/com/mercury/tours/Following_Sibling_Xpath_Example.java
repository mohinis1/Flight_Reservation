package com.mercury.tours;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Following_Sibling_Xpath_Example {
	ChromeDriver driver;
  @Test
  public void Sign_On() {
	  driver.navigate().to("http://newtours.demouat.com/mercurywelcome.php");
	  //below is following sibling example
	  driver.findElement(By.xpath("//td[@width='67']//following-sibling::td[1]/a")).click();
	  //below is preceeding -sibling example
	  driver.findElement(By.xpath("//td[@width='77']//preceding-sibling::td[1]/a")).click();
  }
  @BeforeTest
  public void LaunchBrowser() {
	  String absolutePath=System.getProperty("user.dir");
		String filePath=absolutePath+"\\Drivers"+"\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", filePath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://newtours.demouat.com/mercurywelcome.php");
  }

  @AfterTest
  public void CloseBrowser() {
	  driver.quit();
  }

}
