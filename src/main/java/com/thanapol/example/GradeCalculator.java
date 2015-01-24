/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thanapol.example;

import java.util.Scanner;

/**
 *
 * @author Muhammad
 */
public class GradeCalculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you score hear : ");
        float score = scanner.nextFloat();

        int A = (int)(score%101/80)*4;
        int B = (int)(score%101%90%80/70)*3;
        int C = (int)(score%101%90%80%70/60)*2;
        int D = (int)(score%101%90%80%70%60/50)*1;
        int F = (int)(score%101%90%80%70%60%50/40)*0;
        int error = (int)(score/101)*5;
        int total = A + B + C + D + F + error;

        switch (total) {
            case 0:
                System.out.println("You get grade F");
                break;
            case 1:
                System.out.println("You get grade D");
                break;
            case 2:
                System.out.println("You get grade C");
                break;
            case 3:
                System.out.println("You get grade B");
                break;
            case 4:
                System.out.println("You get grade A");
                break;
            default:
                System.out.println(" Error !!");
        }

    }
}
    

