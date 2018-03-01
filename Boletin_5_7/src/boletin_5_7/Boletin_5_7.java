/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_5_7;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_5_7 {
static String figura;
static double lado;
static double base;
static double altura;
static double radio;
static double area;
static double PI = 3.1416;
    public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Inserte la forma de la figura de la que desea calcular el area:");
figura = sc.nextLine();
if (null == figura){
    System.out.println("opcion incorrecta");
}
else switch (figura) {
        case "triangulo":
            System.out.println("Inserte el valor de la base:");
            base = sc.nextDouble();
            System.out.println("Inserte el valor de la altura:");
            altura = sc.nextDouble();
            area = ((base*altura)/2);
            System.out.println("El valor del area es: "+area);
            break;
        case "cuadrado":
            System.out.println("Inserte el valor del lado:");
            lado = sc.nextDouble();
            area = (lado*lado);
            System.out.println("El valor del area es: "+area);
            break;
        case "circulo":
            System.out.println("Inserta el valor del radio:");
            radio = sc.nextDouble();
            area = (PI*radio*radio);
            System.out.println("El valor del area es: "+area);
            break;
        default:
            System.out.println("opcion incorrecta");
            break;
    }
    }
    
}
