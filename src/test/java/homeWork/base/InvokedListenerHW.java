package homeWork.base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.*;
import org.testng.internal.invokers.InvokedMethodListenerInvoker;

public class InvokedListenerHW implements IInvokedMethodListener {

    public void afterInvocation(IInvokedMethod method, ITestResult result) {
        //System.out.println("This method is invoked after every config method - " + method.getTestMethod().getMethodName());

        if (result.getStatus() == ITestResult.FAILURE) {
            ITestContext iTestContext = result.getTestContext();
            WebDriver wd = (WebDriver) iTestContext.getAttribute("WebDriver");

            try {
                byte[] srcFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.BYTES);
                saveScreenshot(srcFile);
            } catch (NoSuchSessionException ex) {

            }
        }
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] saveScreenshot(byte[] screenshot) {
        return screenshot;
    }

    @Attachment(value = "{0}", type = "text/plain")
    private static String saveTextLog(String message) {
        return message;
    }

}