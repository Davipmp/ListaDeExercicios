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
public class sabesp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);

        float valorConta, valorConta2, valorConta3, consumoConta1, esgoto = 0, total;

        System.out.println("Digite o consumo : ");
        consumoConta1 = dev.nextFloat();

        if (consumoConta1 > 0 && consumoConta1 <= 10) {
            valorConta = (float) (consumoConta1 * 2.90);
            esgoto = valorConta;
            total = valorConta + esgoto;
            System.out.println("O valor de sua conta é : R$ " + valorConta + " e o valor de esgoto é : R$ " + esgoto);
            System.out.println("O valor total de sua conta é R$ " + total);

        } else if (consumoConta1 > 10) {
            valorConta = (float) ((consumoConta1 * 2.90) / 2);
            valorConta2 = (float) (consumoConta1 - 10);
            valorConta3 = (float) (valorConta2 * 4.54);
            total = valorConta + valorConta3;
            System.out.println("O valor de sua conta é : R$ " + total + " e o valor de esgoto é : R$ " + total);
            total = total + total;
            System.out.println("O valor total de sua conta é R$ " + total);
        }
    }
}