package com.mycompany.fewkeywords;

public class FinalExample {
    
    // Final variable
    private final int finalVariable = 10;
    
    // Final method
    public final void finalMethod() {
        System.out.println("Final method called");
        System.out.println("Final variable value: " + finalVariable);
    }
    
   
    
    public static void main(String[] args) {
        FinalExample obj = new FinalExample();
        
        // Accessing final variable
        System.out.println("Final variable value: " + obj.finalVariable);
        
        // Trying to modify final variable (will result in a compilation error)
       //  obj.finalVariable = 20;
        
        // Calling final method
        obj.finalMethod();
        
        // Trying to override final method (will result in a compilation error)
        // class SubClass extends FinalExample {
        //    public void finalMethod() {
        //        // Method implementation
        //    }
        // }
        
        // Creating an instance of the final class
        FinalClass finalObj = new FinalClass();
        finalObj.finalMethod();  // Trying to call finalMethod from the subclass will give
    }
}

