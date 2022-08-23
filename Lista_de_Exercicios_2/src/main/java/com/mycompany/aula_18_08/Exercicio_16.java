/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula_18_08;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_16 {
    /*
    16. Fazer um programa que recebe três números inteiros em ordem crescente e 
    um quarto número também inteiro que não siga esta regra. Mostra, em seguida, 
    os quatro números em ordem crescente.
    */
    public static void main(String[] args){
        int numero1, numero2, numero3, numero4, aux;
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero"));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero"));
        numero3=Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro numero"));
        numero4=Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto numero"));
        if(numero4<numero1){
            aux=numero1;
            numero1=numero4;
            numero4=numero3;
            numero3=numero2;
            numero2=aux;
        }
        else;
        if(numero4>numero1&&numero4<numero2){
            aux=numero2;
            numero2=numero4;
            numero4=numero3;
            numero3=aux;
        }
        else;
        if(numero4>numero2&&numero4<numero3){
            aux=numero3;
            numero3=numero4;
            numero4=aux;
        }
        JOptionPane.showMessageDialog(null,numero1+" "+numero2+" "+numero3+" "+numero4);
    }
}
