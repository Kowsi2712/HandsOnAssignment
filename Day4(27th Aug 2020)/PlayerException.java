package com.kowsi;
import java.util.Scanner;

class InvalidAgeRangeException extends Exception
{
	private int age;
	InvalidAgeRangeException(int a)
	{
		age=a;
	}
	@Override
	public String toString() {
		return "Custom Exception:InvalidAgeRangeException ";
	}
	
}
public class PlayerException {
public static void check(int a) throws InvalidAgeRangeException
	{
			throw new InvalidAgeRangeException(a);
		
	}

	public static void main(String[] args) {
		try
		{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the player name");
		String ply=s.nextLine();
		System.out.println("Enter the player age");
		int a=s.nextInt();
		if(a>19)
		{
			System.out.println("Player name :" +ply+ " Player age :" +a);
			return;
		}
		check(a);
		}
		catch(InvalidAgeRangeException e)
		{
			System.out.println(e);
		}

	}

}
