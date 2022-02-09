package com.day10;

import java.util.*;
interface Max{  
    public void max();  
}  
  
public class MyLambdaMax {  
    public static void main(String[] args) {  
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter 2 nos: ");
        int a=s.nextInt(), b=s.nextInt();
          
        Max m=()->{  
            if (a>b)
            {
            	System.out.println("Maximum is "+a);
            }
            else if (b>a)
            {
            	System.out.println("Maximum is "+b);
            }
            else if (a==b)
            {
            	System.out.println("Both are equal. Maximum number is "+a);
            }
        };  
        m.max();  
    }  
}  
