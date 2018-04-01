package com.Utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

public class BaseTest {
	public static WebDriver drv;
	public static SoftAssert sft;

	@BeforeClass
	public WebDriver setups() {
		sft = new SoftAssert();
		/*
		String st2 = "E:\\Gayathri\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", st2);
		drv = new ChromeDriver();*/
		
		String st2 = "E:\\Gayathri\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", st2);
		drv = new FirefoxDriver();
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return drv;
	}

	@BeforeMethod
	public void Login() throws InterruptedException {
		drv.get(Constants.url);
		Thread.sleep(5000);
		drv.findElement(By.xpath("//a[@class='signin']")).click();
		Thread.sleep(5000);
		drv.findElement(By.xpath("//input[@name='lid']")).sendKeys(Constants.userid);
		drv.findElement(By.xpath("//input[@id='pwd']")).sendKeys(Constants.pwd);
		drv.findElement(By.xpath("//div[@id='signin_submit']")).click();
		Thread.sleep(5000);
		drv.findElement(By.xpath("//div[@class='app-nm'][contains(text(),'CRM')]")).click();
		Thread.sleep(5000);

	}

	@AfterMethod
	public void Logout() throws InterruptedException {
		drv.findElement(By.xpath("//div[@id='profileIcon']/img")).click();
		Thread.sleep(3000);
		drv.findElement(By.xpath("//a[text()='Sign Out']")).click();
		Thread.sleep(3000);

	}

	@AfterClass
	public void teardownresources() {
		drv.quit();
	}

}
