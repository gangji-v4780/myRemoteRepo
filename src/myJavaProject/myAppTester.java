 /**
 * Software Engineering - Summer 2020 
 */
package myJavaProject;

import java.util.Scanner;
public class myAppTester {
	
 public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
	  int n=0;
	  System.out.println("Hello Software Engineering World");
	  System.out.println("Input your number and press enter: ");
	  n = input.nextInt();
	  System.out.print("Reverse of the input number is:");
	  reverseMethod(n); 
	  System.out.println("Your First Number is: ");
	  firstNum = input.nextInt();
	  
	  System.out.println("Your Second Number is: ");
	  secondNum = input.nextInt();
	  
	  myTestMethod(firstNum,secondNum);
	  System.out.println();

	  // add a line below to call your myTestMethod from here  then remove the block comment symbols  

	}
	
	//This is a method to reverse the number by recursion
	public static void reverseMethod(int num) {
	       if (num < 10) {
		   System.out.println(num);
		   return;
	       }
	       else {
	           System.out.print(num % 10);
	           reverseMethod(num/10);     // recursive call
	       }
	   }


	    
	      // add your test method in this space then remove the block comment symbols
	//This is a method to add two numbers       
	public static void myTestMethod(int firstNumber,int secondNumber){
	    	   
	    	   int sum;
	    	   sum = firstNumber + secondNumber;
	    	   System.out.println("The Sum of Two Numbers is: " +sum);
	    	   
	  
		   }
	 
	   

}
