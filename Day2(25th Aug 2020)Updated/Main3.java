package com.kowsi;

import java.util.Scanner;

public class Delivery
{
    long over;
    long ball;
    long runs;
    String batsman;
    String bowler;
    String nonstriker;
	public void displayDeliveryDetails() {
		// TODO Auto-generated method stub
		System.out.println("Delivery details");
		System.out.println("Over : "+over);
		System.out.println("Ball :"+ball);
		System.out.println("Runs : "+runs); 
		System.out.println("Batsman :"+batsman); 
		System.out.println("Bowler : "+bowler);
		System.out.println("NonStriker :"+nonstriker); 
		
	}
}


private static long over;
private static long ball;
private static long runs;
private static String batsman;
private static String bowler;
private static String nonstriker;


public class Main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delivery d1=new Delivery();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the over");
		over=s.nextLong();
		System.out.println("Enter the ball");
		ball=s.nextLong();
		System.out.println("Enter the runss");
		runs=s.nextLong();
		System.out.println("Enter the batsman name");
		batsman=s.nextLine();
		System.out.println("Enter the bowlerman name");
		bowler=s.nextLine();
		System.out.println("Enter the nonstriker name");
		nonstriker=s.nextLine();
		d1.displayDeliveryDetails();

	}

}
