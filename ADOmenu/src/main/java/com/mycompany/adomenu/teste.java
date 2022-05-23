package com.mycompany.adomenu;

/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author davi_
 */
public class teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" ---- MENU ----");

        System.out.println(" 1 - Viagem Guarujá ");
        System.out.println(" 2 - Calculo do desconto ");
        System.out.println(" 3 - Calculo IMC ");
        System.out.println(" 4 - Calculo da Tarifa da conta de luz ");
        System.out.println(" 5  - Calculo da tarifa de água e esgoto  ");
        System.out.println(" 6 - Créditos ao desenvolvedor do programa  ");
        System.out.println(" 7 - Sair do programa ");

        System.out.println(" Escolha uma opção do Menu: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1: {
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
                        break;
                    }
                } else {
                    System.out.println("Viagem cancelada!!!");
                    break;
                }

            }
            case 2: {
                Scanner dev1 = new Scanner(System.in);
                int produtos;
                double desconto;
                double valor;
                double valorTotal;

                System.out.println("Digite a quantidade de produtos: ");
                produtos = dev1.nextInt();
                System.out.println("Digite o valor unitário:");
                valor = dev1.nextDouble();

                if (produtos >= 10) {
                    desconto = ((valor * produtos) * (10) / 100);
                    valorTotal = (valor * produtos) - desconto;
                    System.out.println("Desconto de 10%: R$" + String.format("%.2f", desconto));

                } else {
                    valorTotal = (valor * produtos);
                }
                System.out.println("Valor Total: R$" + String.format("%.2f", valorTotal));
                break;
            }
            case 3: {
                Scanner dev2 = new Scanner(System.in);

                double altura, peso, massa;
                System.out.println("CALCULANDO MASSA CORPOREA !!!");

                System.out.println("Digite o sua altura: ");
                altura = dev2.nextDouble();
                System.out.println("Digite seu peso: ");
                peso = dev2.nextDouble();

                altura = (altura * 2);

                massa = (peso / altura);

                if (massa < 26) {
                    System.out.println("Grau de Obesidade >Normal<!! \n" + massa);
                    break;
                } else {
                    if (massa > 26 || massa < 30) {
                        System.out.println("Grau de >OBESO< ! \n" + massa);
                        break;
                    } else {
                        if (massa > 30) {
                            System.out.println("Grau de >OBESIDADE< \n " + massa);
                            break;
                        }
                    }
                }

            }
            case 4: {
                Scanner dev3 = new Scanner(System.in);

                double valor;
                double resultado1;
                double resultado2;
                double resultado3;

                System.out.println("Digite o valor de consumo em kWh: ");
                valor = dev3.nextInt();

                resultado1 = (valor * 0.20);
                resultado2 = (valor * 0.25);
                resultado3 = (valor * 0.30);

                if (valor < 59.5) {
                    System.out.println("O valor minimo de consumo custara R$11,90. ");
                    break;
                } else {
                    if (valor < 150) {
                        System.out.println("Seu valor a ser pago e R$: " + resultado1);
                        break;
                    } else {
                        if (valor >= 500) {
                            System.out.println("Seu valor a ser pago e R$: " + resultado3);
                            break;
                        } else {
                            if (valor >= 150 || valor < 500) {
                                System.out.println("Seu valor a ser pago e R$: " + resultado2);
                                break;
                            }
                        }
                    }
                }
            }
            case 5: {
                Scanner dev5 = new Scanner(System.in);
                float valorConta, valorConta2, valorConta3, consumoConta1, esgoto = 0, total;

                System.out.println("Digite o consumo : ");
                consumoConta1 = dev5.nextFloat();
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
                    break;
                }

            }
            case 6: {
                System.out.println("DAVI, desenvolveu os exercicios da mega ADO ");
                break;
            }
            case 7: {
                System.out.println("Você saiu do programa! ");
                break;
            }

        }
    }
}
