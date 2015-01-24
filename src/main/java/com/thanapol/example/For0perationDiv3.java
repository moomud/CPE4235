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
public class For0perationDiv3 
{
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Enter size  n : ");
       
        int size = scanner.nextInt();
        int count = 0;
        
        for(int i=1;i<=size;i++){
            if(i%3 == 0){
                count++;
            }
        }
        
        System.out.println("Result is "+count);
    }
    
}