package com.day10;

import java.util.*;
interface Ascii{  
    public void asciivalue();  
}  
  
public class MyLambdaCharNumber {  
    public static void main(String[] args) {  
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter character: ");
          
        Ascii d2=()->{  
        	char c = s.next().charAt(0);
            System.out.println("ASCII Value: "+(int)c);  
        };  
        d2.asciivalue();  
    }  
}  
