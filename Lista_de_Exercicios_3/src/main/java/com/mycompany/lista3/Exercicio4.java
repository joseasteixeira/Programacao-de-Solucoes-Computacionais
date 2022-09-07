/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio4 {
    /*
    4. Escrever um algoritimo que leia uma quantidade descinhecida de numeros
    e conte quantos deles estao nos seguintes intervalos: [0-25], [26-50], [50-75]
    e [76-100]. A entrada de dados deve terminar quando form lido um numero negativo.
    */
    public static void main(String[] args){
        double numero;
        int intervalo1=0, intervalo2=0, intervalo3=0, intervalo4=0;
        do{
            numero=Double.parseDouble(JOptionPane.showInputDialog("Digite um número positivo para continuar,"+
                                                                  "ou digite um numero negativo para finalizar"));
            if(numero>=0&&numero<=25){
                intervalo1++;
            }else;
            if(numero>=26&&numero<=50){
                intervalo2++;
            }else;
            if(numero>=51&&numero<=75){
                intervalo3++;
            }else;
            if(numero>=76&&numero<=100){
                intervalo4++;
            }else;
        }
        while(numero>=0);
        JOptionPane.showMessageDialog(null,intervalo1+" números estaão no intervalo [0-25]");
        JOptionPane.showMessageDialog(null,intervalo2+" números estaão no intervalo [26-50]");
        JOptionPane.showMessageDialog(null,intervalo3+" números estaão no intervalo [51-75]");
        JOptionPane.showMessageDialog(null,intervalo4+" números estaão no intervalo [76-100]");
    }
}
