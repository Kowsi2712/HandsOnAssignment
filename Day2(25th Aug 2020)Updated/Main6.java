package com.kowsi;

import java.util.Scanner;


public class ExtraType
{
	String name;
	long runs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	
}

private static String name;
private static long runs;
public class Main6 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtraType et=new ExtraType();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the extratype details");
		name=s.nextLine();
		runs=s.nextLong();
		String[] arr = name.split("#"); 
	    for (String ss : arr) 
	            System.out.println(ss); 
	}

}
