package TestNG_Package;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {

	ExtentTest test;
	ExtentReports extent = ExtentReport.GetReportObject();

	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {

		test.log(Status.PASS, "Test Passed");
		System.out.println("The name of the testcase passed is :" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {

		test.log(Status.FAIL, "Test Failed");
		System.out.println("The name of the testcase failed is :" + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Skipped");
		System.out.println("The name of the testcase skipped is :" + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
	}

}
