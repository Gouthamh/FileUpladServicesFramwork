package test;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.IRetryAnalyzer;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListenerClass implements IAnnotationTransformer {
    
    @Override
    public void transform(ITestAnnotation testannotation, Class testClass, Constructor testConstructor, Method testMethod) {
        
       
            testannotation.setRetryAnalyzer(test.RetryAnalyzer.class);
        
    }
}
