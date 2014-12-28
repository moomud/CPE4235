package com.thanapol.example;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Muhammad
 */
public class ShowMaxNunber {
   
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1 : ");
        int no1 = scanner.nextInt();
        System.out.print("Number 2 : ");
        int no2 = scanner.nextInt();
        System.out.print("Number 3 : ");
        int no3 = scanner.nextInt(); 
        int maxinum = no1;
        
        if(maxinum < no2){
            maxinum = no2;
        }
        else if (maxinum < no3){
            maxinum = no3;
        }    
        System.out.println("Maxinum value is : "+maxinum);
     
    }
}
        
    


    

