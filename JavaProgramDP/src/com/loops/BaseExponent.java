package com.loops;
import java.util.*;
public class BaseExponent {

	public static void main(String[] args) {
		// WAC for given base and Exponent
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base number");
     int base=sc.nextInt();
     System.out.println("Enter the exponent");
     int expo=sc.nextInt();
     int power=1;
     
     for (int i=1; i<=expo; i++)
     {
    	 power=power*base;
    	 
     }
     System.out.println((base+"to the power"+expo+"="+power));
	}

}
