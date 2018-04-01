package com.TestCases;

import org.openqa.selenium.WebDriver;

import com.Utils.BaseTest;
import com.Utils.CommonFunctions;

public class TestDummy extends BaseTest {
	int x=10;
	public static void main(String[] args) {
		
		CommonFunctions.datepick("12/12/2018", drv, "//span[@id='nm']", "//td[@class='cdate' and text()='", "']");
	}

}
