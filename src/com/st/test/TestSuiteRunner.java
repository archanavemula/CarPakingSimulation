package com.st.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
 /**
  * Test the test suite using the test runner.
  * 
  * @author archana
  *
  */
public class TestSuiteRunner {
 
    public static void main(String[] args) {
 
        Result result = JUnitCore.runClasses(AllTests.class);
        for (Failure fail : result.getFailures()) {
            System.out.println(fail.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests finished successfully...");
        }
    }
}
