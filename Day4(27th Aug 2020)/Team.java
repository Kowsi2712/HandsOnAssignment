package com.kowsi;

import java.util.Scanner;
class TeamNameNotFoundException extends Exception
{
	String string,string1;
	TeamNameNotFoundException(String str,String str1)
	{
		string=str;
		string1=str1;
	}
	
	@Override
	public String toString() {
		return "TeamNameNotFoundException: Entered team is not a part of IPL Season 4 ";
	}
}
public class Team {
	
	public static void check(String str,String str1) throws TeamNameNotFoundException
	{
			throw new TeamNameNotFoundException(str,str1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		String s1="Chennai Super Kings";
		String s2="Deccan Chargers";
		String s3="Delhi Daredevils";
		String s4="Kings XI Punjab";
		String s5="Kolkata Knight Riders";
		String s6="Mumbai Indians";
		String s7="Rajasthan Royals";
	                 String s8="Royal Challengers Bangalore";
		System.out.println("Enter the expected winner team of IPL Season 4");
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println("Enter the expected runner team of IPL Season 4");
		String str1=s.nextLine();
		if(str.equals(s1)|| str.equals(s2)||str.equals(s3)|| str.equals(s4)||str.equals(s5)|| str.equals(s6)||str.equals(s7)|| str.equals(s8))
		{
		   if(str1.equals(s1)|| str1.equals(s2)||str1.equals(s3)|| str1.equals(s4)||str1.equals(s5)|| str1.equals(s6)||str1.equals(s7)|| str1.equals(s8))
		   {
			System.out.println("Expected IPL Season 4 winner: "+str);
			System.out.println("Expected IPL Season 4 runner: "+str1);
			return;
		   }
		}
		check(str,str1);
		}
		catch(TeamNameNotFoundException e)
		{
			System.out.println(e);
		}
	}

}
