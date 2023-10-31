package com.condition;
import java.util.Scanner;

public class additionusingswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the 2 number");
		int num2=sc.nextInt();
		System.out.println("1.add \n 2.sub \n 3.multi \n 4.divi");
		System.out.println("Enter your choice from above menu");
		int choice=sc.nextInt();
		
		switch (choice)
		{
		case 1:System.out.println("addition"+(num1+num2));
		break;
		case 2:System.out.println("substraction"+(num1-num2));
		break;
		case 3:System.out.println("multiplication"+(num1*num2));
		break;
		case 4:System.out.println("dividation    "+(num1/num2));
		break;
		default:System.out.println("Invalid choice5");
		}

	}

}
