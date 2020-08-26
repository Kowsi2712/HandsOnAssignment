package com.kowsi;

import java.util.Scanner;

public class UserMainCode
    {
    	private static final String String = null;

		public boolean validate(String player)
    	{
    		 java.lang.String player;
			int a=player.length();
    		 int k=0;
			 char[] ply = player.toCharArray();
			 for(int i=1;i<a;i++)
			 {
				 if(i%2!=0 && ply[i]=='A' && ply[i]=='a')
				 {
					 return true;
				 }
				 else
				 {
					 return false;
				 }
			 }
			 if(validate(String))
			 {
				 System.out.println("Valid");
			 }
			 else
			 {
				 System.out.println("Invalid");
			 }
    	}
    

public class Main3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String player=s.nextLine();
		UserMainCode umc=new UserMainCode();
		umc.validate(player);
		
	}

}
