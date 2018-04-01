package com.Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	int cnt=0;
	int limit=2;

	@Override
	public boolean retry(ITestResult arg0) {
		while (cnt<limit)
		{
			cnt++;
			return true;
		}
		return false;
	}

}
