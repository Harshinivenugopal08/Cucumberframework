package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class iretryanalyser implements IRetryAnalyzer {
    private int count = 0;
    private static final int maxTry = 2;

    public boolean retry(ITestResult result) {
        if (count < maxTry) {
            count++;
            return true; // Retry the test
        }
        return false; // Stop retrying
    }
}
