/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_5_3;

import java.util.Scanner;

/**
 *
 * @author mfrancomartinez
 */
public class Boletin_5_3_class {
int num;
public void comparar (){
Scanner sc = new Scanner (System.in);
System.out.println("Inserte el número:");
num = sc.nextInt();
if (num == 0){
    System.out.println("0");
}
else{ 
    if (num>0){
    System.out.println("+");
}
else{
    System.out.println("-");
}
}   
}
}
