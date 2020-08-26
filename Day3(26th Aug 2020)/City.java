package com.kowsi;

import java.util.Scanner;

class City
	{
		public void validate(String city)
		{
			  int a=city.length();
			  char[] ci = city.toCharArray();
			boolean res=Character.isLetter(ci[0])&& Character.isLetter(ci[1])&& Character.isLetter(ci[a-1])&&Character.isLetter(ci[a-2]);
			  if(true)
		      {
		    	  System.out.println("valid");
		         }
		    	 else
		    	 {  
		    	    System.out.println("invalid");
		    	  } 	
		
		}
		
public class Main2 {

	public static void main(String[] args) 
	{
		City c=new City();
		Scanner s=new Scanner(System.in);
		String city=s.nextLine();
		c.validate(city);		     
	}
}

