package com.gqt.corejavapatterns;

import java.util.Scanner;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {            // Loop for rows
	            for (int j = 1; j <= i; j++) {        // Print dashes
	                System.out.print("- ");
	            }
	            for (int k = i; k <= n; k++) {        // Print at-signs
	                System.out.print("# ");
	            }
	            System.out.println();                 // Move to next line
	        }

	        sc.close();
	}

}
