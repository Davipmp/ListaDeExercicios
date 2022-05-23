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
public class desconto10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);

        int produtos;
        double desconto;
        double valor;
        double valorTotal;

        System.out.println("Digite a quantidade de produtos:");
        produtos = dev.nextInt();
        System.out.println("Digite o valor unitário:");
        valor = dev.nextDouble();

        if (produtos >= 10) {
            desconto = ((valor * produtos) * (10) / 100);
            valorTotal = (valor * produtos) - desconto;
            System.out.println("Desconto de 10%: R$" + String.format("%.2f", desconto));

        } else {
            valorTotal = (valor * produtos);

        }
        System.out.println("Valor Total: R$" + String.format("%.2f", valorTotal));
    }

}