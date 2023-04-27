package section16_TestNGTutorial.Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * ITestListener interface which implements TestNG listeners
 */

public class testNG_Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
	    // not implemented
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	    // not implemented
		System.out.println("onTestSuccess from testNG_Listeneres");
	}

	@Override
	public void onTestFailure(ITestResult result) {
	    // not implemented
		System.out.println("onTestFAILURE from testNG_Listeneres - Failed Test Case name: "+result.getName());
    }

	@Override
	public void onTestSkipped(ITestResult result) {
	    // not implemented
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	}

	@Override
	public void onStart(ITestContext context) {
	    // not implemented
	}

	@Override
	public void onFinish(ITestContext context) {
	    // not implemented
	}
}
