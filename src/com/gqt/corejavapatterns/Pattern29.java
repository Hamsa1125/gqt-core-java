package com.gqt.corejavapatterns;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size:");
		int n= sc.nextInt();
		char ch;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n-i;j++) {				
				System.out.print(" ");
			}
			ch='A';
			for(int k=1;k<=2*i-1;k++) 
			{				
				System.out.print(ch +" ");
				ch++;
			}
			System.out.println();
		}


	}

}
