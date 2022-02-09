package com.day10;

import java.util.*;
interface Square{  
    public void sqr();  
}  
  
public class MyLambdaSquare {  
    public static void main(String[] args) {  
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter no: ");
        int a=s.nextInt();
          
        Square s1=()->{  
            System.out.println("Square of number: "+(a*a));  
        };  
        s1.sqr();  
    }  
}  
