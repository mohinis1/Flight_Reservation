package com.mercury.tours;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mercury_Sign_On {
	
	@Test
	public void Sign_On_Successful_Login()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user1\\SeleniumTraining\\Workspace\\Mercury_Tours\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demouat.com/mercurywelcome.php");
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("testing");
		driver.findElement(By.name("login")).click();
		driver.quit();
		
	}

}
