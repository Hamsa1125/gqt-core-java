package com.gqt.corejavapatterns;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		int k=3,m=4;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=k;j++) {
				if((i+j)%2==0){
				System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
