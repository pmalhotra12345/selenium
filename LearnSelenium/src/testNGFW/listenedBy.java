package testNGFW;

//package com.javatpoint;  
import org.testng.Assert;  
import org.testng.annotations.Listeners;  
import org.testng.annotations.Test;  
@Listeners(testNGFW.Listeners.class)  

public class listenedBy  
{  
      
 @Test  
 public void test_to_success()  
 {  
     Assert.assertTrue(true);  
 }  
 
 @Test  
 public void test_to_zail()  
 {  
     Assert.assertTrue(false);  
 }  
  
}  