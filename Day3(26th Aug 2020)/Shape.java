package com.kowsi;

import java.util.Scanner;


	class Shape
	{
		String shapename;
		Shape()
		{
			
		}
		double calculateArea()
		{
			return 0;
		}
	}
	class Square extends Shape
	{
		
		private Object side;
		Square(int side)
		{
			
			this.side=side;
		}
		double calculateArea(int side)
		{
			int a=side*side;
			return a;
		}
	}
	class Rectangle extends Shape
	{
		
		private int len,br;
		Rectangle(int len,int br)
		{
		this.len=len;
		this.br=br;
		}
		double calculateArea(int len,int br)
		{
			int area=len*br;
			return area;
		}
	}
	class Circle extends Shape
	{
		private int r;
		Circle(int r)
		{
		this.r=r;
		}
			double calculateArea(int r)
			{
				this.r=(22/7)*r*r;
				return this.calculateArea();
			}
		
	}


	

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Sample Input and Output 1:");

		System.out.println("1. Rectangle");

		System.out.println("2. Square");

		System.out.println("3. Circle");

		System.out.println("Area Calculator --- Choose your shape");
		int n = s.nextInt();
		switch(n)
		{
		case 1:
			int side=s.nextInt();
			Square sq=new Square(side);
			sq.calculateArea();
			System.out.println("Area of Square is:");
			break;
		case 2:
			int length=s.nextInt();
			int breadth=s.nextInt();
			Rectangle re=new Rectangle(length,breadth);
			re.calculateArea();
			System.out.println("Area of Rectangle is:");
			break;
		case 3:
			int rad=s.nextInt();
			Circle c=new Circle(rad);
			c.calculateArea();
			System.out.println("Area of Circle is:");
			break;
		default:
			System.out.println("Invalid");
			break;

	}

}
}


	
