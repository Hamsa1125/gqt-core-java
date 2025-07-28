package com.gqt.corejavapatterns;
import java.util.*;

public class Pattern20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {            // Loop for rows
            for (int j = 1; j <= n; j++) {        // Print dashes
                System.out.print("- ");
            }
            for (int k = 1; k <= n; k++) {        // Print at-signs
                System.out.print("@ ");
            }
            System.out.println();                 // Move to next line
        }

        sc.close();
    }
}


