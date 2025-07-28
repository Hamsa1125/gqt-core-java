package com.gqt.corejavapatterns;

public class Pattern30 {

	public static void main(String[] args) {
		
		
		       int n = 5; // Number of rows

		        for (int i = 1; i <= n; i++) {
		            // Print spaces
		            for (int s = 1; s <= n - i; s++) {
		                System.out.print(" ");
		            }

		            // Print ascending numbers
		            for (int j = 1; j <= i; j++) {
		                System.out.print(j);
		            }

		            // Print descending numbers
		            for (int j = i - 1; j >= 1; j--) {
		                System.out.print(j);
		            }

		            // Move to next line
		            System.out.println();
		        }
		    }
		
		
		

	}


