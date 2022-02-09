package com.day10;

import java.util.*;
interface Sum{  
    public void total();  
}  
  
public class MyLambdaSum {  
    public static void main(String[] args) {  
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter 2 nos: ");
        int a=s.nextInt(), b=s.nextInt();
          
        Sum d2=()->{  
            System.out.println("Sum: "+(a+b));  
        };  
        d2.total();  
    }  
}  
