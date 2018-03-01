/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_5_5;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_5_5 {
static double num1;
static double num2;
static double num3;
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Inserta el primer número:");
num1 = sc.nextDouble();
System.out.println("Inserta el segundo número:");
num2 = sc.nextDouble();
System.out.println("Inserta el tercer número:");
num3 = sc.nextDouble();

if (num1>num2){
    if (num3>num1){
        System.out.println("El tercer numero es el mayor.");
    }
    else{
        System.out.println("El primer numero es el mayor.");
    }
}
else{
    if (num3>num2){
        System.out.println("El tercer numero es el mayor.");
    }
    else{
        System.out.println("El segundo numero es el mayor.");
    }
}
    }
    
}
