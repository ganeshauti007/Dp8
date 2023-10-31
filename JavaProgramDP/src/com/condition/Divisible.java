package com.condition;
import java.util.*;
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		if (num%3==0 && num%9==0)
		{
			System.out.println("Number is divisibel by both");
		}
	
		else if (num%3==0)
		{
			System.out.println("Number is divisible by 3");
		}
		else if (num %9==0)
		{
			System.out.println("Number is divisible by 9");
			}
		else 
		{
			System.out.println("number is invalid");
		}
		
		
	}

}
