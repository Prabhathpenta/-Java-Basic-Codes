package com.mypractice;

public class FinalVariableExample {
    final int finalValue;           // Declare a final variable

   
    public FinalVariableExample(int value) {  // Constructor to assign value to the final variable
        finalValue = value;
    }

    public static void main(String[] args) {
        
        FinalVariableExample example = new FinalVariableExample(10); // Create an instance of the class and 
        															//assign value using the constructor

        System.out.println("Final Value: " + example.finalValue);
    }
}