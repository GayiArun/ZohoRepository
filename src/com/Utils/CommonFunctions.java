package com.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {
	
	public static void selectdropdown(WebDriver drv,String xpath,String Text)
	{
		List<WebElement> li=drv.findElements(By.xpath(xpath));
	    System.out.println(li.size());
	    for(int i=0;i<li.size();i++){
	    	System.out.println(li.get(i).getText());
	    	if(li.get(i).getText().contains(Text)){
	    		li.get(i).click();
	    		break;
	    	}
	   
	    }
	}
	
	public static void datepick(String date,WebDriver drv,String Navele,String fstele,String scndele)
	{
		Date d=new Date(date);
		SimpleDateFormat sp=new SimpleDateFormat("MMMM/dd/yyyy");
		String dat=sp.format(d);
		System.out.println(dat);
		String split[]=dat.split("/");
		System.out.println(split[0]+" "+split[1]+ " "+split[2]);
		String month=split[0]+" "+split[2];
		System.out.println(month);
		String fnl=fstele+split[1]+scndele;
		System.out.println(fnl);
				
		while(true)
		{
			try {//                  //span[text()='March 2018']
				drv.findElement(By.xpath("//span[text()='"+month+"']")).isDisplayed();
				drv.findElement(By.xpath(fnl)).click();
				break;
			} catch (Exception e) {
				drv.findElement(By.xpath(Navele)).click();
			}
			
		}
		
	}

}
