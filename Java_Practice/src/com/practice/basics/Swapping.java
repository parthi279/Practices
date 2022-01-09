package com.practice.basics;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
        int a,b,temp;
        Scanner sin = new Scanner(System.in);
        System.out.println("Enter a:");
        a = sin.nextInt();
        System.out.println("Enter b:");
        b = sin.nextInt();
        
        System.out.println("Before swapping:"+"\n"+"a value is "+a+"\n"+"b value is "+b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping:"+"\n"+"a value is "+a+"\n"+"b value is "+b);
        
        //without 3rd varaiable
        a = a + b; //11
        b = a - b; //6
        a = a - b; //5
        
        System.out.println("Swapping without 3rd variable:"+"\n"+"a value is "+a+"\n"+"b value is "+b);
        sin.close();
    }

}
