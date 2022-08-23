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
public class Exercicio9 {
    /*
    9. Fazer um programa que recebe um número positivo, calcula e mostra:
    a) O número digitado ao quadrado;
    b) O número digitado ao cubo;
    c) A raiz quadrada do número digitado.
    */
    public static void main(String[] args){
        double numero, quadrado=0, cubo=0, raiz=0;
        numero=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero:"));
        quadrado=Math.pow(numero,2);
        cubo=Math.pow(numero,3);
        raiz=Math.sqrt(numero);
        JOptionPane.showMessageDialog(null,"O quadrado do numero é: "+quadrado+
                                           "\nO cubo do numero é: "+cubo+
                                           "\nA raiz quadrada do numero é: "+ raiz);
    }
}
