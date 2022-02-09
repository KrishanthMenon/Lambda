package com.day10;

import java.util.*;
interface Positive{  
    public void total();  
}  
  
public class MyLambdaPositive {  
    public static void main(String[] args) {  
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter a number: ");
        int a=s.nextInt();
        int positive;
        
        Positive d2=()->{  
        	if(a>0)
            {
            	System.out.println("Positive");
            }
            else if (a==0)
            {
            	System.out.println("Zero");
            }
            else
            {
            	System.out.println("Negative");
            }
			System.out.println("Number is positive/equal to zero: "+ (a>=0));  
        };  
        d2.total();  
    }  
}  
