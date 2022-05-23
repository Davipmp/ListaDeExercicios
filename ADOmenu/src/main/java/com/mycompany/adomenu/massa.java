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
public class massa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        double altura, peso, massa;
        
       
        System.out.println("CALCULANDO MASSA CORPOREA !!!");
        
        System.out.println("Digite o sua altura: ");
        altura = input.nextDouble();
        System.out.println("Digite seu peso: ");
        peso = input.nextDouble();
        
        altura = (altura*2);
        
        massa = (peso/altura);
        
        
        if (massa<26) {
            System.out.println("Grau de Obesidade >Normal<!! \n" + massa);
        }else{
            if (massa>26 || massa<30){
                System.out.println("Grau de >OBESO< ! \n" + massa);
            }else {
                if (massa>30){
                    System.out.println("Grau de >OBESIDADE< \n " + massa);
                }
            }
        }
        
        
    }
    
}
