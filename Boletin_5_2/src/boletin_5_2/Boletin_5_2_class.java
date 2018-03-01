
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_5_2;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_5_2_class {
    private static short num1;
    private static short num2;
    
    public void comparar(){
        Scanner sc = new Scanner (System.in);
System.out.println("Inserte el primer numero:");
num1 = sc.nextShort();
System.out.println("Inserte el segundo numero:");
num2 = sc.nextShort();

if (num1>=num2){
    
    System.out.println(num1-num2);
}
else{
    System.out.println(num1+num2);
}
    }
    
}
