package TestNG_Package;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	public static ExtentReports GetReportObject ()
	{
		
		ExtentReports extent = new ExtentReports ();
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		System.out.println(path);
		ExtentSparkReporter reporter = new ExtentSparkReporter (path);
		reporter.config().setReportName("Jawwy Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Noha Hegazy");
	
		return extent;
		
	}
}
