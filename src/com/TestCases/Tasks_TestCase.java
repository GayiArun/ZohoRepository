package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.Utils.BaseTest;
import com.Utils.CommonFunctions;

public class Tasks_TestCase extends BaseTest {
	@Test
	public void TasksTests() throws InterruptedException
	{
		drv.findElement(By.xpath("//div[@class='qicon']/span[1]")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//a[@id='submenu_Tasks']")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//input[@id='Crm_Tasks_SUBJECT']")).sendKeys("SprintTasks");
		Thread.sleep(2000);
		drv.findElement(By.xpath("//input[@id='Crm_Tasks_DUEDATE']")).click();
		Thread.sleep(2000);
		CommonFunctions.datepick("05/16/2018", drv, "//span[@id='nm']", "//td[@class='cdate' and text()='", "']");
		Thread.sleep(2000);
		drv.findElement(By.xpath("//span[@class='disablefalse'and text()='Not Started']")).click();
		Thread.sleep(2000);
		CommonFunctions.selectdropdown(drv, "//ul[@id='select2-Crm_Tasks_STATUS-results']//li", "Waiting for input");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)drv;
		jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(3000);
		drv.findElement(By.xpath("//input[@id='saveTasksBtn_Bottom']")).click();
		Thread.sleep(3000);
		String Act=drv.findElement(By.xpath("//span[@id='headervalue_SUBJECT']//span[@id='subvalue_SUBJECT']")).getText();
		sft.assertTrue(Act.contains(Act));
		drv.findElement(By.xpath("//span[@id='CustomizeTools']")).click();
		Thread.sleep(3000);
		drv.findElement(By.xpath("//html//div[@id='customizedd']/ul/li[2]/a[1]")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//div[@id='fromDeletepopupButtons']//input[@id='deleteButton']")).click();
		Thread.sleep(2000);
		sft.assertAll();
	}
}
