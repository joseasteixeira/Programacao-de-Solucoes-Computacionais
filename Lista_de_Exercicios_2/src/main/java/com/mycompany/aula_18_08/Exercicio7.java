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
public class Exercicio7 {
    /*
    7. Fazer um programa que calcula e mostra a área de um triângulo, sabendo que:
    área = (base * altura) / 2.
    */
    public static void main(String[] args){
        float base, altura, area=0;
        base=Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da base:"));
        altura=Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da altura:"));
        area=(base*altura)/2;
        JOptionPane.showMessageDialog(null,"A area do triangulo é: "+area);
    }
}
