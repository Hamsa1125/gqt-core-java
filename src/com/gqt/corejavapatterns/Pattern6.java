package com.gqt.corejavapatterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size:");
		int n=sc.nextInt();
		int m=1;
		for(int i=1;i<=n;i++) {
			System.out.println(m);
			m++;
		}


	}

}
