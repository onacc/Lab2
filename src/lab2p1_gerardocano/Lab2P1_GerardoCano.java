/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_gerardocano;

import java.util.Scanner;


public class Lab2P1_GerardoCano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        do{
            Scanner read = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("Ejercicio 1 MCD");
            System.out.println("Ejercicio 2 Sumatoria");
            System.out.println("Ejercicio 3 Supermercado");
            System.out.println("Ingrese una opcion ");
            opcion = read.nextInt();
            if(opcion == 1){
                int num1 , num2, mcd;
                System.out.println("Ingrese el primer numero");
                num1 = read.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 = read.nextInt();
                do {
                    if (num1 > num2 ){
                        mcd = num1 - num2;
                        num1 = mcd;
                    }//fin if
                    else{  
                        mcd = num2 - num1;
                        num2 = mcd;
                    }//fin del else
                } while ( num1 != num2);
                System.out.print("El MCD es " + mcd);
                System.out.println(" ");
            }//fin opcion 1
            if (opcion ==2){
               double n = 1 , k , v1 =0;
               double vf = 0.0;
                System.out.println("Ingrese valor k ");
                k = read.nextInt();
               do {
                   v1 += (n/n+1);
                   vf = (double)Math.pow(v1, n);
                           
                   n++;
               }while (n <= k);
                System.out.println("Respuesta = " + vf);
            }
            if (opcion == 3){
                System.out.println("Supermercado");
                System.out.println("Ingrese tipo de cliente");
                System.out.println("Tipo 0");
                System.out.println("Tipo 1");
                System.out.println("Tipo 2");
                double tc , preciou, totalp , preciof , cantidadf = 0, cantidadp;
                //int cantidadf  , cantidadp;
                tc = read.nextInt();
                if(tc == 0){
                    System.out.println("Ingrese precio de la unidad del producto ");
                    preciou = read.nextDouble();
                    System.out.println("Ingrese Cantidad de producto ");
                    cantidadp = read.nextInt();
                    if ( cantidadp<=19 && cantidadp>=10 ){
                        cantidadf = cantidadp-2;
                    }
                    if(cantidadp>20){
                        cantidadf = cantidadp-5;
                    }
                    preciof = cantidadf*preciou;
                    totalp =  preciof; 
                    //System.out.println(""+cantidadf);
                    System.out.println("Precio final = " + totalp);
                }
                
                if (tc == 1){
                     System.out.println("Ingrese precio de la unidad del producto ");
                    preciou = read.nextDouble();
                    System.out.println("Ingrese Cantidad de producto ");
                    cantidadp = read.nextInt();
                    if ( cantidadp<=29 && cantidadp>=20 ){
                        cantidadf = cantidadp-2;
                    }
                    if(cantidadp>30){
                        cantidadf = cantidadp-5;
                    }
                    preciof = cantidadf*preciou;
                    totalp =  (preciof - preciof*0.1);
                    System.out.println("Precio final = " + totalp);
                }//fin tc1
                if (tc == 2 ){ System.out.println("Ingrese precio de la unidad del producto ");
                    preciou = read.nextDouble();
                    System.out.println("Ingrese Cantidad de producto ");
                    cantidadp = read.nextInt();
                    if ( cantidadp<=39 && cantidadp>=39 ){
                        cantidadf = cantidadp-2;
                    }
                    if(cantidadp>40){
                        cantidadf = cantidadp-5;
                    }
                    preciof = cantidadf*preciou;
                    totalp =  (preciof - preciof*0.3);
                    System.out.println("Precio final = " + totalp);
                    
                }//fin tc 2
            }//fin opcion 3 
        }while(opcion != 0);
    }//fin main
    
}
