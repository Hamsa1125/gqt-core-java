package com.gqt.corejavaIfElsePattern;

import java.util.Scanner;

public class AlphabetsUniversalPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr the Count:");
		int n=sc.nextInt();
		 //i = number of rows
for(int i=0;i<n;i++) {
			
			for(int j=0;j<n-4;j++) {
				if( i==0 || j==0 || i== (n/2) || j==(n-5)){
					
					System.out.print("$ ")	;				
				}
				else {
				System.out.print("  ");
				}
			}
			System.out.print("     ");
			
// to print B
			for(int j=0;j<n;j++) {
				if(i==0 || i==(n-1) || j==0 || j==(n-1) || i== (n/2)) {
					
					System.out.print("$ ")	;				
				}
				else {
				System.out.print("  ");
				}
			}				
			
			System.out.print("    ");
			
// to Print C
			// to print Alphabet C
			
						for(int j=0;j<n;j++) {
							if(i==0 || i==(n-1) || j==0 ) {
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
					}
			}
						System.out.print("    ");
						
						
//to print Alphabet D				

						for(int j=0;j<n;j++) {
							if( (i==0 && j<5)|| (i==(n-1) && j<5) || j==0  || (j==(n/2) && i>=1 && i<(n-1))){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}		
						System.out.print("    ");
						
	// to Print Alphabet E
						
						for(int j=0;j<n;j++) {
							if(i==0 || j==0  || i==(n-1) || i== (n/2)){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}

						System.out.print("    ");
						
						
// to Print Alphabet F
						
						for(int j=0;j<n;j++) {
							if(i==0 || j==0   || i== (n/2)){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
						
		// to Print Alphabet G
						
						for(int j=0;j<n;j++) {
							if( (i==0 && j<5)|| (i==(n-1)  && j<5 )  || j==0|| (j==(n/2) && i>5) || (i==(n/2) && j>5) ){
								
								System.out.print("* ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						
						System.out.print("    ");
// to Print Alphabet H
						

						for(int j=0;j<n;j++) {
							if(j==0 || j==(n-1) || i== (n/2)) {
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
					
// to Print Alphabet I
						
						for(int j=0;j<n;j++) {
							if(i==0 || j==(n/2) || i==(n-1)) {
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
						
				
// to Print Alphabet J	
						for(int j=0;j<n;j++) {
							if(   i==0 || j==(n/2) ||i-j==(n/2) ) {
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						
						System.out.print("    ");
						
// to Print Alphabet K
						
						for(int j=0;j<n;j++) {
							if(   j==0 || i+j==(n/2) ||i-j==(n/2) ) {
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
						
// to Print Alphabet L
						for(int j=0;j<n;j++) {
							if( i==(n-1) || j==0 ) {
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
						
// to Print Alphabet M
						for(int j=0;j<n;j++) {
							if(   j==0 || j==(n-1) || ((i==j) && (i<5)) ||( i+j==(n-1)  && (i<6)) ) {
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
						
// to Print Alphabet N

						for(int j=0;j<n;j++) {
							if( j==0  ||  j==(n-1) || i==j ){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
						
						
// to Print Alphabet O
						for(int j=0;j<n;j++) {
							if(i==0 || i==(n-1) || j==0 || j==(n-1)) {
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
// to Print Alphabet P

						for(int j=0;j<n-5;j++) {
							if( i==0 || j==0 || i== (n/2) || (j==(n/2) && (i<5)) ){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
// to Print Alphabet Q

						for(int j=0;j<n;j++) {
							if( (i==0 && j<5)|| (i==j && j>1 && j<9 )  || (j==0 && i<5) || (i==(n/2) && j<5) || (j==(n/2) && i<5) ){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
// to Print Alphabet R
						for(int j=0;j<n-5;j++) {
							if( i==0 || j==0 || i== (n/2) || (j==(n/2) && (i<5)) || i-j==(n/2)  ){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
// to Print Alphabet S
						for(int j=0;j<n;j++) {
							if( (i==0 && j<5)|| (i==(n-1) && j<5)  || (j==0 && i<5) || (i==(n/2) && j<5) || (j==(n/2) && i>5) ){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
// to Print Alphabet T
						for(int j=0;j<n;j++) {
							if(i==0   || j== (n/2)){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
// to Print Alphabet U
						for(int j=0;j<n;j++) {
							if( j==0  || j==(n/2) || (i==(n-1) && j<=5) ){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
// to Print Alphabet V

						for(int j=0;j<n;j++) {
							if(i-j==(n/2) || i+j==(n-1)+(n/2)){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
// To print Alphabet W	
						for(int j=0;j<n;j++) {
							if( j==0  || j==(n-1)  || (i==j && j>5) || (i+j==(n-1) && j<5) ){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}

						
						System.out.print("    ");
// to Print Alphabet X
						for(int j=0;j<n;j++) {
							if(i==j  || i+j==(n-1) ){
								
								System.out.print("$ ")	;				
							}
							else {
							System.out.print("  ");
							}
						}
						System.out.print("    ");
						
// to Print Alphabet Y
						
      for(int j=0;j<n;j++) {
	        if( i+j==(n-1)  || (i==j && i<5)  ){
		
	       	System.out.print("$ ")	;				
	       }
	          else {
	     System.out.print("  ");
	    }
                  }
  	System.out.print("    ");
//to Print Alphabet Z
        	for(int j=0;j<n;j++) {
	             	if( i==0  || i==(n-1) || i+j==(n-1)  ){
			
		      	System.out.print("$ ")	;				
		      }
		          else {
		      System.out.print("  ");
	      	}
	  }


						System.out.println("    ");
		}


		}


	}


