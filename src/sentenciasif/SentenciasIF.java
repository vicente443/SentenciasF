/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciasif;

import java.util.Scanner;

/**
 *
 * @author chent
 */
public class SentenciasIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner miConsola=new Scanner(System.in);
System.out.println("1.- Lea dos números e indique cuál es el mayor de ambos");
int valor1=0;
int valor2=0;
System.out.println("ingrese el valor uno");
valor1=miConsola.nextInt();
System.out.println("ingrese el valor dos");
valor2=miConsola.nextInt();
        if (valor1>valor2) {
        System.out.println("El "+valor1 +" es el mayor" );    
        }else{
         System.out.println("El "+valor2 +" es el mayor");    
        }   
System.out.println("2.- Lea dos números e indique cuál es el mayor y cuál es el menor de ambos."); 
int num1=0;
int num2=0;
 System.out.println("ingrese el valor uno");
num1=miConsola.nextInt();
System.out.println("ingrese el valor dos");
num2=miConsola.nextInt();
        if (num1>num2) {
        System.out.println("El "+num1 +" es mayor y el "+ num2+ " es menor" );    
        }else{
         System.out.println("El "+num2 +" es mayor y el "+ num1+ " es menor");    
        }  
System.out.println("3.- Lea dos números e indique cuál es el mayor, cuál es el menor y en su caso decir si son iguales.");
int a=0;
int b=0;
 System.out.println("ingrese el valor uno");
a=miConsola.nextInt();
System.out.println("ingrese el valor dos");
b=miConsola.nextInt();
        if (a>b) {
        System.out.println("El "+ a +" es mayor y el "+ b + " es menor" );    
        }else if(b>a){
         System.out.println("El "+ b +" es mayor y el "+ a + " es menor");  
         
        }else{
            System.out.println("los valores ingresados son iguales ");
        }
System.out.println("4.- Escriba un programa que con base al año actual y lea un año cualquiera y que escriba cuántos años han pasado desde ese año o cuántos años faltan para llegar a ese año" );
 int actual=0;
 int cualquiera=0;
 int ope=0;
System.out.println("Ingrese el año actual");
actual=miConsola.nextInt();
System.out.println("Se a establecido el año "+actual);
System.out.println("Ingrese un año cualquiera");
cualquiera=miConsola.nextInt();

 if (actual>cualquiera) {
     ope=actual-cualquiera;
   System.out.println("Han pasado "+ ope + " años desde el "+ cualquiera);    
        }else if(actual<cualquiera){
            ope=cualquiera-actual;
         System.out.println("Faltan "+ ope + " años para el "+ cualquiera);  
         
        }else{
            System.out.println("Estas en el presente año");
        }
    System.out.println("5.");
    int num=0;
    System.out.println("Escriba un numero");
    num=miConsola.nextInt();
    if (num>0) {
   System.out.println("Es positivo");    
        }else{
            System.out.println("Es negativo");
        }
  System.out.println("6.");
  int cifra=0;
  System.out.println("Ingrese un numero");
  cifra=miConsola.nextInt();
  if (cifra>=10 && cifra<=99) {
   System.out.println("Tiene dos cifras");    
        }else{
            System.out.println("Distinto de dos cifras");
        }
    }
    
}
