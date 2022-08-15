/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosaulaprogramacao;

import java.util.Scanner;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_3 {
    /*
    3. Calcular o pagamento de comissão de vendedores de peças, levando-se em
    consideração que sua comissão será de 5% do total da venda e que você tem os
    seguntes dados: preço unitario da peça e quantidade vendida.
    */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double preco, comissao=0;
        int quantidade;
        System.out.println("Digite o preço da unidade: ");
        preco=scan.nextDouble();
        System.out.println("Digite a quantidade: ");
        quantidade=scan.nextInt();
        comissao=(preco*0.05d)*quantidade;
        System.out.println("Total em comissão: "+comissao);
    }
}
