package com.gqt.corejavaIfElsePattern;

import java.util.Scanner;

public class ArrayCode1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the student count:");
		int n= sc.nextInt();
		
// creating an array to store n students
		int arr[] =new int[n];
		
// collecting and storing  marks of n number of students
		
		for( int i=0; i<arr.length;i++) {
			 System.out.println("Enter th marks of the student no:" +(i+1));
			 arr[i]=sc.nextInt();	
		}
		System.out.println("......");
// Display marks stored inside the array		
		for( int i=0; i<arr.length;i++) {
			 System.out.println(" the marks of the student no:" +(i+1) + "is =" + arr[i]);
		

	}

}
}
