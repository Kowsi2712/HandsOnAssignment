package com.kowsi;
import java.util.Scanner;
public class Over {
	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of Over");
		int num=s.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter the number of runs for each over");
		
		for(int i=0;i<num;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Enter the over number");
		int p=s.nextInt();
		for(int i=0;i<=num;i++)
		{
			if((i+1)==p)
			{
				System.out.println("Runs scored in this over :"+arr[i+1]);
				break;
			}
		}
		}
		catch (ArrayIndexOutOfBoundsException | NegativeArraySizeException  e)
		{ 
		System.out.println(e);
		}
  }
}
