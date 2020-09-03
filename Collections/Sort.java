package com.java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		Integer a[] = new Integer[n];
		for(int i=0; i<n; i++)
		{
		    a[i] = sc.nextInt();
		}
		ArrayList<Integer> l = new ArrayList<Integer>(Arrays.asList(a));
	     Collections.sort(l);
	     System.out.println(l);
	}

	

}
