package com.gqt.corejavaIfElsePattern;

import java.util.Scanner;

public class IfPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Count:");
		int n=sc.nextInt();
		for(int i=0; i<n;i++) {
		
			for (int j=0;j<=i;j++) {
				if (i==0 || i==n-1 || j==0 || j==i) {
				System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}


	}

}
