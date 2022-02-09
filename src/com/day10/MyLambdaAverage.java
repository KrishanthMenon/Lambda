package com.day10;

import java.util.*;
interface Average{  
    public void avg();  
}  
  
public class MyLambdaAverage {  
    public static void main(String[] args) {  
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter 2 nos: ");
        int a=s.nextInt(), b=s.nextInt();
        Average d2=()->{  
        	float av=(a+b)/2 ;
            System.out.println("Average: "+av);  
        };  
        d2.avg();  
    }  
}  
