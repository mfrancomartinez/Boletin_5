/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_5_1;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_5_1_class {
    static float numero;
 Scanner sc = new Scanner(System.in);
 public void positivo_negativo (){
     System.out.println("Inserte el numero:");
     numero = sc.nextFloat();
     if (numero>=0){
    System.out.println("El número es positivo");
}
    else{
    System.out.println("El número es negativo");
            }
 }   
}
