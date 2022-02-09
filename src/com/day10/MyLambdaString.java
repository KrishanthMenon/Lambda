package com.day10;

import java.util.*;
interface Str{  
    public void size();  
}  
  
public class MyLambdaString {  
    public static void main(String[] args) {  
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter string: ");
        String a=s.next();
          
        Str d2=()->{  
            System.out.println("String length: "+a.length());  
        };  
        d2.size();  
    }  
}  
