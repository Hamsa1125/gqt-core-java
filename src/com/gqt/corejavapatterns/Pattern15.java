package com.gqt.corejavapatterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		int m=n*n;
		for(int i=1;i<=n;i++){
		for (int j=1;j<=n;j++) {
			System.out.print(m+" ");
			m--;
		}
		System.out.println();
		}

	}

}
