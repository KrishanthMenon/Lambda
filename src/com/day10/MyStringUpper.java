package com.day10;

import java.util.*;
interface StrUpper{  
    public void upper();  
}  
  
public class MyStringUpper {  
    public static void main(String[] args) {  
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter string: ");
        String a=s.next();
          
        StrUpper d2=()->{  
            System.out.println("String uppercased: "+a.toUpperCase());  
        };  
        d2.upper();  
    }  
}  
