package com.gqt.corejavapatterns;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size:");
		int n= sc.nextInt();
	char firstch ='A';
		for(int i=0;i<n;i++) {
			char ch=(char)(firstch+i);
			int ch1=2*i+1;
			for(int j=0;j<n-i-1;j++) {				
				System.out.print(" ");
			}	
		
			for(int j=0;j<ch1;j++) 
			{				
				System.out.print(ch +"");
				
			}
			System.out.println();

	}
	}

}
