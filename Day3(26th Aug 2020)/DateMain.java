package com.kowsi;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;

	public class UserDate
	{
	   public static boolean validate(String strDate)
	   {
		if (strDate.trim().equals(""))
		{
		    return true;
		}
		else
		{
		    SimpleDateFormat sdfrmt = new SimpleDateFormat("dd-MM-yyyy");
		    try
		    {
		        Date javaDate = sdfrmt.parse(strDate); 
		       return true;
	
		    }
		    catch (ParseException e)
		    {
		       
		        return false;
		    }
		}
		if (validate(strDate)){
		    System.out.println("valid");
		}
		else {
		   
			 System.out.println("invalid");
		}
	   }
	}


public class DateMain {
	   public static void main(String args[]){
		try
		{
		Scanner s=new Scanner(System.in);
		String date=s.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Sample u=new Sample();
		Date d=sdf.parse(date);
		Sample.validate(date);
		
	   }
		   catch(ParseException e)
		   {
			   e.printStackTrace();
		   }
	}
}
