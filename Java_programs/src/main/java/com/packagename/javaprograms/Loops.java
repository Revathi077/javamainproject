package com.packagename.javaprograms;

import java.util.Arrays;

public class Loops {
	void nestedforloop()
	{		
	//nested for loop
		int t=6;
	for(int i=1;i<=t;i++){
		for(int j=t;j>=i;j--){
		System.out.print("* ");
		}
	
	System.out.println();
	}
	}
	
	//for loop
	void foreachloop(){
		int num[]= {100,2,3,4,5,6,7,80};
	int	n=num.length;
	    Arrays.sort(num);
	int max=num[n-1];
		
		for(int i:num)
		{
		   if(max%2==0) 
		  
			max=n-1;
			
		else {
			
			System.out.println(max);
			break;
		}
		}
	}
	
	
	//labeled for loop
	void labledforloop() {
a:
	for(int i=0;i<=3;i++)
	{
         b:
        	 for(int j=0;j<=3;j++)
        	 {
        		 if(i==1)
        			 break a;
        		 System.out.println(+i);
        		 System.out.print(+j);
        	 }
        	 
	}
	}
	
	
	//infinity loop(exit click ctrl+c
 void unlimitedloop()
 {
	for(;;)
	{
		System.out.println("hello");
	}
	
 }
 
 
 
 //while loop
 void whileloop() {
	 int num[]= {5,8,9,2,4,13,7,6};
	 Arrays.sort(num);
	int max=num.length;
	System.out.println(max);
	int i=0;
	 
	 while(i<=max)
	 {
		 int maxnum=num[max-1];
		 System.out.println(maxnum);
		 
	        if(maxnum%2==0) 
		{
			//System.out.println("the even no");
		}
	        else
	        {
	        	System.out.println("the highest odd no is"+maxnum);
	        	break;
	        }
		i++;
		
	 }
 }
 //while infinity loop
 void whileinfinity()
 {
	 while(true)
	 {
		 System.out.print("hello");
	 }
 }

 //do while loop
 void dowhile() {
	 String names[]= {"rama","duatt","papa","aaa","bbb"};
	 Arrays.sort(names);
	 int len=names.length;
	len=len+1;
	 int i=1;
	  do
	  {
	String name=names[i];
		System.out.print(name);
		i++;
			  }while(i<=len);
 }
 
 
 
 //continue stmt
 
 
 
}