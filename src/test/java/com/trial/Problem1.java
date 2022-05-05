package com.trial;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		int temp =0, pal_lenghth;
		
		System.out.println("Enter length of Palindrome");
		Scanner sc_w = new Scanner(System.in);
		pal_lenghth=sc_w.nextInt();
		
		System.out.println("Enter length of Alphabets");
		Scanner sc_x = new Scanner(System.in);
		String alpha_length = sc_x.nextLine();
		
		System.out.println("Enter length of Digits");
		Scanner sc_y = new Scanner(System.in);
		int digits=sc_y.nextInt();
		
		System.out.println("Enter length of Special characters");
		Scanner sc_z  = new Scanner(System.in);
		String spc=sc_z.nextLine();
		
		if(pal_lenghth<=20 && digits<=20 && alpha_length.length()<=20 && spc.length()<=20 )
		{
			System.out.println("Enter alphabets");
			Scanner sc_a = new Scanner(System.in);
			sc_a.nextLine();
			
			
			
		}
		
		
		
		
		

	}

}
