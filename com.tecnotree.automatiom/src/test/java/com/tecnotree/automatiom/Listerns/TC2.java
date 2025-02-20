package com.tecnotree.automatiom.Listerns;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public abstract class TC2 implements ITestListener{

@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	ExtentTest test = ExtendManger.getInstance().createTest(result.getMethod().getMethodName());
	Extent.setTest(test);
	System.out.println("-----------------------------");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------");

		Extent.getTest().log(Status.PASS,result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		Extent.getTest().log(Status.FAIL,result.getMethod().getMethodName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		Extent.getTest().log(Status.SKIP,result.getMethod().getMethodName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}




@Test
	public void test4() {
		System.out.println("---------------------");
	}
}
