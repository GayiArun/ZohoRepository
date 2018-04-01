package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.Utils.BaseTest;
import com.Utils.CommonFunctions;



public class Deals_TestCase extends BaseTest{
	@Test
	public void Dealstest() throws InterruptedException
	{
		drv.findElement(By.xpath("//div[@class='qicon']/span[1]")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//a[@id='submenu_Potentials']")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//input[@id='Crm_Potentials_AMOUNT']")).sendKeys("50000");
		Thread.sleep(2000);
		drv.findElement(By.xpath("//input[@id='Crm_Potentials_POTENTIALNAME']")).sendKeys("MyDealsforUnderwares");
		Thread.sleep(2000);
		drv.findElement(By.xpath("//input[@id='Crm_Potentials_CLOSINGDATE']")).click();
		Thread.sleep(2000);
		CommonFunctions.datepick("05/16/2018", drv, "//span[@id='nm']", "//td[@class='cdate' and text()='", "']");
		Thread.sleep(2000);
		drv.findElement(By.xpath("//img[@id='Crm_Potentials_ACCOUNTID_img'][1]")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//a[text()='King']")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//span[@id='select2-Crm_Potentials_STAGE-container']//span[@class='disablefalse']")).click();
		Thread.sleep(2000);
		CommonFunctions.selectdropdown(drv, "//ul[@id='select2-Crm_Potentials_STAGE-results']//li", "Value Proposition");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)drv;
		jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(3000);
		drv.findElement(By.xpath("//input[@id='savePotentialsBtn_Bottom']")).click();
		Thread.sleep(3000);
		String act=drv.findElement(By.xpath("//tr[@id='detailViewButtonLayerMainTableRow']//td[@id='dv_title']//div[@id='topSectionTitle']//span[@id='headervalue_POTENTIALNAME']//span[@id='headervalue_POTENTIALNAME']//span[@id='subvalue_POTENTIALNAME']")).getText();
		System.out.println(act);
		sft.assertTrue(act.contains(act));
		drv.findElement(By.xpath("//span[@id='CustomizeTools']")).click();
		Thread.sleep(3000);
		drv.findElement(By.xpath("//html//div[@id='customizedd']/ul/li[2]/a[1]")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//div[@id='fromDeletepopupButtons']//input[@id='deleteButton']")).click();
		Thread.sleep(2000);
		sft.assertAll();
	}

}
