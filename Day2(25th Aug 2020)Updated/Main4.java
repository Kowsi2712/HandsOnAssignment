package com.kowsi;
import java.util.Scanner;

public class Player
{
	public String name;
	public String country;
	public String skill;
	}

private static String name;
private static String country;
private static String skill;
public class Main4 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Player p1=new Player();
		System.out.println("Enter the player details");
        name=s.nextLine();
        country=s.nextLine();
        skill=s.nextLine();
        String[] s1=new String[3];
        s1[0]=name;
        s1[2]=country;
        s1[3]=skill;
        String[] s2=string.split(",");
        System.out.println("Enter the player details");
        System.out.println("Enter the Player name "+s1[0]);
        System.out.println("Enter the country name"+s1[1]);
        System.out.println("Enter the skill"+s1[2]);
       
	}

}
