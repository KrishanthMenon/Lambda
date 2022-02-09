package com.day10;

import java.util.*;
interface Series{  
    public void ser();  
}  
  
public class MyLambdaSeries {  
    public static void main(String[] args) {  
    	//Scanner s=new Scanner(System.in);
    	//System.out.println("Enter 2 nos: ");
        //int a=s.nextInt(), b=s.nextInt();
          
        Series d2=()->{ 
        	String  no = "";
        	for(int i=1;i<=100;i++)
        	{
        		if(true)
        		{
        			no=no+i+" ";
        		}  
        	}
        	System.out.println(no);
        };  
        d2.ser();  
    }  
}  
