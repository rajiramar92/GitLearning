package fblog.org;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;



public class FailedClasss implements IRetryAnalyzer{
  int min=0;int max=3;
	public boolean retry(ITestResult arg0) {
     if(min<max) {
    	 
    	  min++;
    	  return false;
    	 
     }

		
		
		return true;
	}
	

}
