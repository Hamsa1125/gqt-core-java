package com.gqt.corejavapatterns;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int n=sc.nextInt();
		String k="";
		for(int i=1;i<=n;i++) {
			k+=(i%2);
						System.out.println(k);
			
	}

}
}
