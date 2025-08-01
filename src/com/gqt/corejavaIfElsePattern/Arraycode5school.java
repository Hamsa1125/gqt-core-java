package com.gqt.corejavaIfElsePattern;

import java.util.Scanner;

class Arrayoperation4{
	String arr[][][];
	Scanner sc=new Scanner(System.in);
	
	
	void createArray() {
		System.out.println("Enter the Count of school:");
		int scl =sc.nextInt();
       arr = new String[scl][][];
       
       for (int i=0;i<arr.length;i++) {
    	   System.out.println("Enter the count of class:"+(i+1));
    	   arr[i]=new String[sc.nextInt()][];
     
       for (int j = 0; j<arr[i].length; j++) {
           System.out.println("Enter the number of students in class " + (j + 1) + " of school " + (i + 1) + ":");
           int cls = sc.nextInt();
           arr[i][j] = new String[cls];
       }
       }
		System.out.println("Array created");
		System.out.println("---------");		
	}
	
	void collectData() {
		for (int i=0; i<arr.length;i++) {
			System.out.println("Inside school no:" +(i+1));
			for (int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the class no of students:"+ (j+1));				
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the name of  the Students :"+ (k+1));	
					arr[i][j][k]= sc.next();
				}
				
			}
		}
		System.out.println("Data collected");
		System.out.println("--------");
		}

	
	void displayData() {
	for (int i=0;i<arr.length;i++) {
		System.out.println("Inside school no:" +(i+1));
		for (int j=0;j<arr[i].length;j++) {
			System.out.println("Inside the class no:"+ (j+1)+ "is =" + arr[i][j]);
			for (int k=0;k<arr[i][j].length;k++) {
				System.out.println("Enter the name of the student:"+(k+1)+ "is =" + arr[i][j][k]);
	}
	}
	
		System.out.println("-----------");
	}

}
	
}
public class Arraycode5school {

	public static void main(String[] args) {
		
		Arrayoperation4 ao4 = new Arrayoperation4();
		ao4.createArray();
		ao4.collectData();
		ao4.displayData();
	}

}

