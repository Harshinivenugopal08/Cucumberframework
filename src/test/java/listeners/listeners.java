package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        if (result.getMethod().getRetryAnalyzerClass() == null) {
            result.getMethod().setRetryAnalyzerClass(iretryanalyser.class);
        }
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Execution Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Execution Finished: " + context.getName());
    }
}

