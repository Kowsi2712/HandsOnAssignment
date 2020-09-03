package com.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Sumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		float avg=0;
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		Integer a[] = new Integer[n];
		for(int i=0; i<n; i++)
		{
		    a[i] = sc.nextInt();
		}
		
		ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(a));
		
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/n;
		System.out.println(sum);
		System.out.print(avg);

	}

}
