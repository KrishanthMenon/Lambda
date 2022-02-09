package com.day10;

import java.util.*;
interface PositiveNegative{  
    public void total();  
}  
  
public class MyLambdaOddEven {  
    public static void main(String[] args) {  
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter a number: ");
        int a=s.nextInt();
        int positive;
        
        PositiveNegative d2=()->{  
        	if(a%2==0)
            {
            	System.out.println("Even");
            }
            else
            {
            	System.out.println("Odd");
            }
			System.out.println("Even number: "+ (a %2==0));  
        };  
        d2.total();  
    }  
}  
