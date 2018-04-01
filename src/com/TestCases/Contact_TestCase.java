package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.Utils.BaseTest;
import com.Utils.CommonFunctions;

public class Contact_TestCase extends BaseTest{
	@Test
	public void Create_Contacts() throws InterruptedException
	{
		String Text=drv.findElement(By.xpath("//span[@id='show-uName']")).getText();
		sft.assertTrue(Text.contains("arugse"),Text);
		drv.findElement(By.xpath("//div[@class='qicon']/span[1]")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//a[@id='submenu_Contacts']")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//span[@class='select2-selection__rendered' and @id='select2-Crm_Contacts_LEADSOURCE-container']")).click();
		Thread.sleep(2000);
		CommonFunctions.selectdropdown(drv, "//ul[@class='select2-results__options']//li//span", "Cold Call");
		Thread.sleep(2000);
		drv.findElement(By.xpath("//span[@class='select2-selection__rendered' and @id='select2-Crm_Contacts_FIRSTNAME_SALUTATION-container']")).click();
		Thread.sleep(2000);
		CommonFunctions.selectdropdown(drv, "//ul[@class='select2-results__options']//li//span", "Dr.");
		Thread.sleep(2000);
		drv.findElement(By.xpath("//input[@id='Crm_Contacts_FIRSTNAME']")).sendKeys("Arun");
		Thread.sleep(2000);
		drv.findElement(By.xpath("//input[@id='Crm_Contacts_LASTNAME']")).sendKeys("Kumar");
		Thread.sleep(2000);
		drv.findElement(By.xpath("//img[@id='Crm_Contacts_ACCOUNTID_img'][1]")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//a[text()='King']")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//input[@id='Crm_Contacts_BIRTHDAY']")).click();
		Thread.sleep(2000);
		CommonFunctions.datepick("03/10/2018", drv, "//span[@id='pm']", "//td[@class='cdate' and text()='", "']");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)drv;
		jse.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(3000);
		drv.findElement(By.xpath("//td[@id='buttonTD']/input[1]")).click();
		Thread.sleep(2000);
		String st=drv.findElement(By.xpath("//tr[@id='detailViewButtonLayerMainTableRow']//td[@id='dv_title']//div[@id='topSectionTitle']//span[@id='headervalue_LASTNAME']//span[@id='headervalue_LASTNAME']//span[@id='subvalue_LASTNAME']")).getText();
		sft.assertTrue(st.contains(st));
		Thread.sleep(2000);
		drv.findElement(By.xpath("//span[@id='CustomizeTools']")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//html//div[@id='customizedd']/ul/li[2]/a[1]")).click();
		Thread.sleep(2000);
		drv.findElement(By.xpath("//div[@id='fromDeletepopupButtons']//input[@id='deleteButton']")).click();
		Thread.sleep(2000);
		sft.assertAll();
		
	}

}
