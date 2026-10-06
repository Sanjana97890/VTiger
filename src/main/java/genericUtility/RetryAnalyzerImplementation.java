package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerImplementation implements IRetryAnalyzer 
{
	
	int count = 1;
	int maxCount = 4;
	
	@Override
	public boolean retry(ITestResult resullt) {
		while(count<=maxCount) 
		{
			count++;
			return true;
			
		}
		return false;
	}

}
