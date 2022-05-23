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
public class megaado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner dev = new Scanner(System.in);
        int orcamento, clima = 0, transporte = 0, condicao = 0;

        System.out.println("Viagem para o Guarujá!!!");
        String disponibilidade;
        System.out.println("Tenho disponibilidade? Digite SIM ou NÃO.");
        disponibilidade = dev.next();

        if (disponibilidade.equals("Sim") || disponibilidade.equals("sim") || disponibilidade.equals("SIM")) {
            System.out.println("Tenho orçamento para esta viagem? \nDigite o valor do seu orçamento.");
            orcamento = dev.nextInt();
            if (orcamento >= 1500) {
                System.out.println("Quais são as condições climáticas? Digita a temperatura para FDS:");
                clima = dev.nextInt();
            }
        }
        if (clima >= 23) {
            System.out.println("A viagem será de Carro ou de Onibus? [1] CARRO PRÓPRIO e [2] para )ONIBUS.");
            transporte = dev.nextInt();
            if (transporte == 1) {
                System.out.println("Verificar condições do carro e abastecer");
                System.out.println("Boa viagem, aproveite bem o seu final de semana!!!");
            } else {
                System.out.println("Verificar a disponibilidade do onibus para ir viajar.");
                System.out.println("Boa viagem, aproveite bem o seu final de semana!!!");
            }
        } else {
            System.out.println("Viagem cancelada!!!");
        }
    }
}
