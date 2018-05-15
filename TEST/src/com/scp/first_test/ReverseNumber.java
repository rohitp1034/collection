package com.scp.first_test;

public class ReverseNumber {
	 public static void main(String args[])
	   {
	      int num=123;
	      int reversenum =0;
	      while( num != 0 )
	      {
	          reversenum = reversenum * 10;
	          //System.out.println(reversenum);
	          reversenum = reversenum + num%10;
	          //System.out.println(reversenum);
	          num = num/10;
	          //System.out.println(num);
	      }

	      
	      System.out.println(reversenum);
	   }
	}


