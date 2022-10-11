package com.retry_Analyser.base;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Utility implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		int start_Point = 1;
		int end_Point = 3;
		
		if (start_Point <= end_Point) {
			
			start_Point++;
			
			return true;
			
		}
		return false;
	}

}
