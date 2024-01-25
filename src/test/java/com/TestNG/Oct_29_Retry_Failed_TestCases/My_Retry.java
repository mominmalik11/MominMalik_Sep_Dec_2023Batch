package com.TestNG.Oct_29_Retry_Failed_TestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class My_Retry implements IRetryAnalyzer {

  private int retryCount = 0;
  private static final int maxRetryCount = 5;

  @Override
  public boolean retry(ITestResult result) {
    if (retryCount < maxRetryCount) {
      retryCount++;
      return true;
    }
    return false;
  }
}