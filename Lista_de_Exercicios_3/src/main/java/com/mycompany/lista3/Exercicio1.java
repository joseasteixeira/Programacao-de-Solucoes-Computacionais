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
public class Exercicio1 {
    /*
    1. Desenvolver um algoritimo que efetue a soma de todos os números ímpares
    que são multiplos de três e que se encontram no conjunto de numeros de 1 ate 500.
    */
    public static void main(String[] args){
        int i=1, soma=0;
        while(i<500){
            if((i%2!=0)&&(i%3==0)){
                soma+=i;
                System.out.println(i);
            }
            i++;
        }
        JOptionPane.showMessageDialog(null,"A soma dos numeros impares e mutiplos de três é: "+soma);
    }
}
