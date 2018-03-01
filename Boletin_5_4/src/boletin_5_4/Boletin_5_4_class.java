/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_5_4;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_5_4_class {
public static String nom1;
public static String nom2;
public static double peso1;
public static double peso2;
public void compararpeso (){
Scanner sc = new Scanner (System.in);
Scanner sx = new Scanner (System.in);
System.out.println("Inserte el nombre del primer sujeto:");
nom1 = sc.nextLine();
System.out.println("Inserte el peso del primer sujeto:");
peso1 = sc.nextDouble();
System.out.println("Inserte el nombre del segundo sujeto:");
nom2 = sx.nextLine();
System.out.println("Inserte el peso del segundo sujeto:");
peso2 = sc.nextDouble();

if (peso1 == peso2){
    System.out.println("El peso de ambos sujetos es el mismo.");
}
else if (peso1>peso2){
    System.out.println("El peso de "+nom1+" es mayor, la diferencia de peso es:"+(peso1-peso2));
    }
    else{
        System.out.println("El peso de "+nom2+" es mayor, la diferencia de peso es:"+(peso2-peso1));
    }
}
}
