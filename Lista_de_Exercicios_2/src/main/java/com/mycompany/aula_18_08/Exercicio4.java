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
public class Exercicio4 {
    /*
    4.  Tendo como dados de entrada a altura (h) e o sexo de uma pessoa 
    (um caracter m ou f), construir um programa que calcula seu peso ideal, 
    utilizando as seguintes fórmulas:
    Para homens: (72.7*h) - 58
    Para mulheres: (62.1*h) - 44.7
    */
    public static void main(String[] args){
        Float h, pesoIdeal=0f;
        char sexo = 0;
        h=Float.parseFloat(JOptionPane.showInputDialog("Informe sua altura:","Digite aqui"));
        sexo=JOptionPane.showInputDialog(null,"Informe seu sexo:","Digite aqui").charAt(sexo);
        if(sexo=='m'||sexo=='M'){
            pesoIdeal=(72.2f*h)-58f;
        }
        else;
        if(sexo=='f'||sexo=='F'){
            pesoIdeal=(62.1f*h)-44.7f;
        }
        else;
        JOptionPane.showMessageDialog(null,"Sue peso ideal é: "+pesoIdeal);
    }
}
