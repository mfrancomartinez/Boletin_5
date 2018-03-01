/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_5_6;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_5_6 {
static String nom1;
static int ventas;
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Inserte el nombre del producto:");
nom1 = sc.nextLine();
System.out.println("Inserte el numero de stock del producto:");
ventas = sc.nextInt();
if (ventas <= 100){
    System.out.println(nom1+" es un articulo de consumo bajo.");
}
else if (ventas >100 && ventas <=500){
    System.out.println(nom1+" es un artiuclo de consumo medio.");
}
else if (ventas>500 && ventas<=1000){
    System.out.println(nom1+" es un articulo de consumo alto.");
}
else{
    System.out.println(nom1+" es un articulo de primera necesidad.");
}
    }
    
}
