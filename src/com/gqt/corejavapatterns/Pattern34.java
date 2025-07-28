package com.gqt.corejavapatterns;

import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		
		for(int i=n-1;i>=1;i--) {
			// to print space
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			// to print ascending numbers
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			//to print descending numbers
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			// to move to nextline
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			// to print space
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			// to print ascending numbers
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			//to print descending numbers
			for(int j=i-1;j>=1;j--) {
				System.out.print(j);
			}
			// to move to nextline
			System.out.println();
		}

	}

}
