package org.LoginFunctionality;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomTestListener implements ITestListener{
	
	public void onTestSuccess(ITestResult result) {
        System.out.println( result.getName() + ":Login Successfull");
	}
	public void onTestFailure(ITestResult result) {
        System.out.println(result.getName() + ": Login Failed due to invalid credentilas");
    }
	

}
