/**
 * 
 */
package com.gqt.corejavaIfElsePattern;

import java.util.Scanner;

/**
 *    
- - - - $ 
- - - $ $ $ 
- - $ $ $ $ $ 
- $ $ $ $ $ $ $ 
$ $ $ $ $ $ $ $ $ 
 */
public class IfPattern3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr the Count:");
		int n=sc.nextInt();
		 //i = number of rows
		for(int i=1;i<=n;i++) {
			// j= number of 

			for(int j=1;j<=n-i;j++) {
				System.out.print("- ");
			}
			for (int j=1;j<=2*i-1;j++){
				System.out.print("$ ");
			}
		System.out.println();
			}
		}

	}

