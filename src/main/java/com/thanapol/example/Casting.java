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
public class Casting {
     public static void main(String[] args) {
        System.out.println("Push number : ");
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();
        System.out.println("number : "+input);
        if(input - (int)input == 0)
        {
            System.out.println("output : "+(int)input);
        }
        else
        {
            System.out.println("output : "+input);
        }
    }
}
