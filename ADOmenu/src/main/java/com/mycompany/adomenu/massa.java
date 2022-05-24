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
        
        
        if (massa<18.50) {
            System.out.println("Você apresenta estar com Magreza e o resultado do seu IMC é: " + massa);
        }else{
            if (massa>18.50 || massa<24.90){
                System.out.println("Você apresenta estar Normal e o resultado do seu IMC  :" + massa);
            }else {
                if (massa>24.90 || massa < 30 ){
                    System.out.println("Você apresenta estar com Magreza e o resultado do seu IMC é: " + massa);
                }else {
                    System.out.println("Você apresenta estar com Magreza e o resultado do seu IMC é: ");
                    
                }
            }
        }
        
        
    }
    
}
