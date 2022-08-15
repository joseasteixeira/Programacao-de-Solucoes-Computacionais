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
public class Exercicio_2 {
    /*
    2. Ler 4 números, calcular o quadrado para cada um, somar todos os 
    quadrados e mostrar o resultado.
    */
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int valor, total=0;
        for(int i=0;i<4;i++){
            System.out.println("Digite o "+(i+1)+"° valor: ");
            valor=scan.nextInt();
            total+=valor*valor;
        }
        System.out.println("O valor total é: "+total);
    }
}
