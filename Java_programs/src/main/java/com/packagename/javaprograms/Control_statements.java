package com.packagename.javaprograms;

import java.util.Scanner;

public class Control_statements {
	//nested if condition
	 @SuppressWarnings("resource")
	void nestedif() {
		 int age;
		 Scanner obj1=new Scanner(System.in);
		Scanner obj2=new Scanner(System.in);
		Scanner obj3=new Scanner(System.in);
		 System.out.println("enter the age\n");
		 age=obj1.nextInt();
		
		  
		if(age>=18&&age<=50)
		{
			
			 System.out.println("enter the weight\n");
			 int weight=obj2.nextInt();
			 
			if(weight>=50&& weight<=90)
			{
				 System.out.println("enter the blood group18\n");
		int blood_group=obj3.nextInt();
			  String group1="a";
			 
			     if(blood_group==1||blood_group==2||blood_group==3||group1=="a")
			     {
				  System.out.println("general blood-group");
			     }
				  else
				  System.out.println("special blood group");
			}
		}
		else 
			System.out.print("not eligible");		
	}
	 
	 
	 
	 
	 //if else if ladder
	 void ladderif()
	 {
		// Scanner val=new Scanner(System.in);
		// System.out.print("enter the string or number special character");
		// String valuee=val.nextLine();
		 String valuee=".";
		 if(valuee=="a"||valuee=="b")
		 {
			 System.out.print("enter value is alphabet");
		 }
			 else if(valuee=="1"||valuee=="2")
			 {
				 System.out.print("enter value is number"); 
			 }
			 else
				 System.out.print("enter value is splchar");
	 }
	 
	 
	 // using ternary operator
	 
	 void ternaryop()
	 {
		 Scanner number1=new Scanner(System.in);
		 System.out.print("enter number");
		 int number=number1.nextInt();
		 //int fvalue =(number%2==0)?number:0;
		 String fvalue=(number%2==0)?"evenumber":"oddnumber";
		 System.out.print(fvalue);		  
	 }
	 
	 
	 //Switch opertator (switch fall through)
	 void switchcase()
	 {
		 Scanner value1=new Scanner(System.in);
		 System.out.print("enter the value");
		 int value=value1.nextInt();
		 switch(value)
		 {
		 case 10:
			 System.out.println("10");
		 case 20:
			 System.out.println("20");
		 case 30:
			 System.out.println("30");
		 case 40:
			 System.out.println("40");
			 default:
				 System.out.println("not in all");
		 }
	 }
	 
	 //switch case using enum
	 
	 public  enum days {sun,mon,tue,wed,thu,fri,sat}
	public void switchenumcase() {

		 days[] week=days.values();
		 for(days now:week)
		 {
			 switch(now)
			 {
			 case sun:
				 System.out.println("sunday");
				 break;
			 case mon:
				 System.out.println("monday");
				 break;
			 case tue:
				 System.out.println("tuesday");
				 break;
			 case wed:
				 System.out.println("wednesday");
				 break;
			 case thu:
				 System.out.println("thursday");
				 break;
			 case fri:
				 System.out.println("friday");
				 break;
			 case sat:
				 System.out.println("saturday");
				 break;
				default:
					System.out.println("not valid");
				 
			 }
				 
		 }
		 
	 }
	 

	
	//switch case in switch case
	void nestedswitch() {
		Scanner digits=new Scanner(System.in);
		System.out.print("enter any number like 10,20,30,40,50");
		int digit=digits.nextInt();
		switch(digit)
		{
		case 10:
			Scanner digits1=new Scanner(System.in);
			System.out.println("u have entered to in beteen 10 numbers enter number 0-10");
			int number=digits.nextInt();
			switch(number) {
			case 1:
				System.out.println("entered number is no 1");
				break;
			case 2:
				System.out.println("entered no is 2");
				break;
			case 3:
				System.out.println("entered number is 3");
				break;
			}
			break;
		case 20:
			System.out.println("entered number is in between 10-20");
			break;
			default:
				System.out.println("no valid number");
			
		}
	}
	
	//wapper switch cases Byte, Short, Integer and Long
	
	
	void wapperswitch()
	{ 
		byte b1=28;
		switch (b1)
		{
		case (28):
			System.out.print("not valid");
		break;
		case (-28):
			System.out.print(" valid");
		break;
		default:
			System.out.print("enter valid number");
		}
		
	}
	
	
}
