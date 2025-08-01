package com.gqt.corejavaIfElsePattern;

import java.util.Scanner;

public class MyName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr the Count:");
		int n=sc.nextInt();
		 //i = number of rows
		// Print H Alphabet 
    for(int i=0;i<n;i++) {
	      for(int j=0;j<n;j++) {
		if(j==0 || j==(n-1) || i== (n/2)) {
			
			System.out.print("$ ")	;				
		}
		else {
		System.out.print("  ");
		}
	}
	System.out.print("    ");
	
	// Print A Alphabet 
	for(int j=0;j<n-4;j++) {
		if( i==0 || j==0 || i== (n/2) || j==(n-5)){
			
			System.out.print("$ ")	;				
		}
		else {
		System.out.print("  ");
		}
	}
	System.out.print("     ");
	
	// Print M Alphabet 
	
	for(int j=0;j<n;j++) {
		if(   j==0 || j==(n-1) || ((i==j) && (i<5)) ||( i+j==(n-1)  && (i<6)) ) {
			
			System.out.print("$ ")	;				
		}
		else {
		System.out.print("  ");
		}
	}
	System.out.print("    ");
	
	// Print S Alphabet 
	
	for(int j=0;j<n;j++) {
		if( (i==0 && j<5)|| (i==(n-1) && j<5)  || (j==0 && i<5) || (i==(n/2) && j<5) || (j==(n/2) && i>5) ){
			
			System.out.print("$ ")	;				
		}
		else {
		System.out.print("  ");
		}
	}
	System.out.print("    ");
	
	// Print A Alphabet 
	for(int j=0;j<n-4;j++) {
		if( i==0 || j==0 || i== (n/2) || j==(n-5)){
			
			System.out.print("$ ")	;				
		}
		else {
		System.out.print("  ");
		}
	}
	System.out.println("     ");
	
}

	}

}
