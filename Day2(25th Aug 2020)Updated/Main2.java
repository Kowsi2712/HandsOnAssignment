package com.kowsi;
import java.io.*;
import java.util.*;

public class Player
{
	 public String name;
	 public String country;
	 public String skill;
}

private static String name;
private static String country;
private static String skill;
public class Main2
{
public static void main(String args[])
{
	Player p1=new Player();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Player name");
	name=s.nextLine();
	System.out.println("Enter the Country name");
	country=s.nextLine();
	System.out.println("Enter the Skill");
	skill = s.nextLine();
	System.out.println("Player details");
	 System.out.println("Player name:" +name);
	 System.out.println("Country name:" +country);
	 System.out.println("Skill: " +skill);
}
}
