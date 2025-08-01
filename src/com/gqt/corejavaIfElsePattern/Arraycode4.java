package com.gqt.corejavaIfElsePattern;

import java.util.Scanner;

class Arrayoperation3{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	
	void createArray() {
		System.out.println("Enter the School Count:");
		int Scl =sc.nextInt();
		System.out.println("Enter the Count of class in each school:");
		int cls =sc.nextInt();       
       System.out.println("Enter the student Count in each class:");
		int stu= sc.nextInt();
		arr = new String[Scl][cls][stu];
		
		System.out.println("Array created");
		System.out.println("---------");
       
	}
	
	void collectData() {
		for (int i=0; i<arr.length;i++) {
			System.out.println("Inside school no:" +(i+1));
			for (int j=0;j<arr[i].length;j++) {
				System.out.println("inside class no:"+ (j+1));
				for (int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of the student:"+(k+1));
					arr[i][j][k]= sc.next();
				}
			
				
			}
		}
		System.out.println("Data collected");
		System.out.println("------------");
	}
	
	void displayData() {
	for (int i=0;i<arr.length;i++) {
		System.out.println("Inside school no:" +(i+1));
		for (int j=0;j<arr[i].length;j++) {
			System.out.println("inside class no:"+ (j+1));
			for (int k=0;k<arr[i][j].length;k++) {
			System.out.println("Enter the name of student no:"+ (k+1)+ "is =" + arr[i][j][k]);
			}
	}
	}
	
		System.out.println("-----------");
	}

}

public class Arraycode4 {

	public static void main(String[] args) {
		Arrayoperation3 ao3 = new Arrayoperation3();
		ao3.createArray();
		ao3.collectData();
		ao3.displayData();

	

	}

}
