package com.mycompany.adomenu;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author davi_
 */
public class enel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
        
        double valor;
        double resultado1;
        double resultado2;
        double resultado3;
        
        System.out.println("Digite o valor de consumo em kWh: ");
        valor = input.nextDouble();
        
        resultado1 = (valor*0.20);
        resultado2 = (valor*0.25);
        resultado3 = (valor*0.30);
        
        if (valor<59.5){
            System.out.println("O valor minimo de consumo custara R$11,90. ");
        }else{
            if (valor<150){
                System.out.println("Seu valor a ser pago e R$: " + resultado1);
            }else{
                if (valor>=500){
                    System.out.println("Seu valor a ser pago e R$: " + resultado3);
                }else{
                    if (valor>=150 || valor<500){
                        System.out.println("Seu valor a ser pago e R$: " + resultado2);
                    }
                }
            }
        }
        
    }
}
