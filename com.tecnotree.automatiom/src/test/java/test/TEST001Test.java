package test;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TEST001Test {

    // Make the method public and handle the InterruptedException
    public void Threads() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(3).toMillis()); // Convert Duration to milliseconds
    }

    @Test
    public void test11Test() throws InterruptedException {
        Threads();
        System.out.println("sdfds");
        Assert.assertTrue(true);
    }

    @Test(retryAnalyzer = test.RetryAnalyzer.class)
    public void test12Test() throws InterruptedException {
        Threads();

        System.out.println("sdfds");
    Assert.assertTrue(true);    
    }
@Test
    public void test13Test() throws InterruptedException {
        Threads();
        System.out.println("sdfds");
        Assert.assertTrue(false);    
    }

//    @Test
//    public void test14Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test15Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test16Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test17Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test18Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test19Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test20Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test21Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test22Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test23Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test24Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test25Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test26Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test27Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test28Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test29Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test30Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
//
//    @Test
//    public void test31Test() throws InterruptedException {
//        Threads();
//        throw new RuntimeException("Test not implemented");
//    }
}