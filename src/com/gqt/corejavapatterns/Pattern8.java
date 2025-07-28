package com.gqt.corejavapatterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n=sc.nextInt();
	//	int m=1;
	//	int k=1;
		for(int i=1; i<=n;i++) {
			for( int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}


	}

}
