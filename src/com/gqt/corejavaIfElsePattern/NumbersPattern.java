/**
 * 
 */
package com.gqt.corejavaIfElsePattern;

import java.util.Scanner;

public class NumbersPattern {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the count:");
		int n=sc.nextInt();

		for(int i=0;i<n;i++) {
// To print Number 1
			for(int j=0;j<n;j++) {
				if( i==(n-1) || i+j == (n/2)  || j==(n/2)) {
					
					System.out.print("$ ")	;				
				}
				else {
				System.out.print("  ");
				}
			}
			

			System.out.print("    ");
			
// To print Number 2	
			for(int j=0;j<n;j++) {
				if( (i==0 && j<5) || (j==0 && i>5) || (i==(n/2) && j<5) || (j==(n/2) && i<5) || (i==(n-1) && j<5) ){
					
					System.out.print("$ ")	;				
				}
				else {
				System.out.print("  ");
				}
			}
			System.out.print("    ");
// To print Number 3
			for(int j=0;j<n;j++) {
				if( (i==0 && j<5)  || (i==(n/2) && j<5) || j==(n/2) || (i==(n-1) && j<5) ){
					
					System.out.print("$ ")	;				
				}
				else {
				System.out.print("  ");
				}
			}
			System.out.print("    ");
			
// To print Number 4
						for(int j=0;j<n;j++) {
							if( (j==0 && i<5)  || i==(n/2)  || j==(n/2)  ){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
// To Print Number 5

						for(int j=0;j<n;j++) {
							if( (i==0 && j<5)|| (i==(n-1) && j<5)  || (j==0 && i<5) || (i==(n/2) && j<5) || (j==(n/2) && i>5) ){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
				System.out.print("    ");
				
// To print Number 6

				for(int j=0;j<n;j++) {
					if((i==0 && j<5) || j==0  || (i==(n-1) && j<5) || (i== (n/2) && j<5)  || ( j==(n/2) && i>5)){
						
						System.out.print("$ ")	;				
					}
					else {
					System.out.print("  ");
					}
				}
				System.out.print("    ");
				
				
//To print Number 7
				for(int j=0;j<n;j++) {
					if((i==0 && j<5) ||  j==(n/2) ){
						
						System.out.print("$ ")	;				
					}
					else {
					System.out.print("  ");
					}
				}
				System.out.print("    ");
				
//To print Number 8
				for(int j=0;j<n;j++) {
					if(i==0 || i==(n-1) || j==0 || j==(n-1) || i== (n/2)) {
						
						System.out.print("$ ")	;				
					}
					else {
					System.out.print("  ");
					}
				}
				System.out.print("    ");
				
//To print Number 9
				for(int j=0;j<n;j++) {
					if((i==0 && j<5) || j==(n/2) ||(j==0 && i<5)|| (i==(n/2) && j<5 )) {
						
						System.out.print("$ ")	;				
					}
					else {
					System.out.print("  ");
					}
				}
				System.out.print("    ");
			
			System.out.println("    ");
			
			
		}

		}
			

	}

