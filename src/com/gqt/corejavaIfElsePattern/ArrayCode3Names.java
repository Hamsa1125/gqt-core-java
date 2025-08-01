package com.gqt.corejavaIfElsePattern;

import java.util.Scanner;

class Arrayoperation1{
	String arr[][];
	Scanner sc=new Scanner(System.in);
	
	void createArray() {
		System.out.println("Enter the Count:");
		int cls =sc.nextInt();
		System.out.println("Enter the student Count in each class:");
		int stu= sc.nextInt();
		
		arr = new String[cls][stu];
		System.out.println("Array created");
		System.out.println("---------");		
	}
	
	void collectData() {
		for (int i=0; i<arr.length;i++) {
			System.out.println("Inside class no:" +(i+1));
			for (int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of student no:"+ (j+1));
				arr[i][j]= sc.next();
				
			}
		}
		System.out.println("Data collected");
		System.out.println("------------");
	}
	
	void displayData() {
	for (int i=0;i<arr.length;i++) {
		System.out.println("Inside class no:" +(i+1));
		for (int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the name of student no:"+ (j+1)+ "is =" + arr[i][j]);
	}
	}
	
		System.out.println("-----------");
	}

}
public class ArrayCode3Names {

	public static void main(String[] args) {
	
		Arrayoperation1 ao1 = new Arrayoperation1();
		ao1.createArray();
		ao1.collectData();
		ao1.displayData();

	}

}
