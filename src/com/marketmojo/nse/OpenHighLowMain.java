package com.marketmojo.nse;

import java.util.List;

public class OpenHighLowMain {

	public OpenHighLowMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> s1;
		OpenHighLow open = new OpenHighLow();
		s1 = open.openHighTest();
		System.out.println("In main method");
		
		for(String s: s1)
		{
			System.out.println("open low element :"+s);
		}
		System.out.println("after for-each");
		//display open low
	/*	for(int i =0; i< s1.length;i++)
		{
			System.out.println("Open low element is : "+s1[i]);
		}
*/
	}

}
