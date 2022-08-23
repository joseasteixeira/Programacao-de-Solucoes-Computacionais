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
public class Exercicio1 {
    /*
    1. Faça um programa que obtém o salário de uma pessoa e diz 
    se ela está ganhando pelo menos o salário mínimo.
    */
    public static void main(String[] args){
        double minimo=1212;
        Double salario=Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salario: "));
        if(salario>=minimo){
            JOptionPane.showMessageDialog(null, "Salario maior ou igual ao salario minimo!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Salario menor que o salario minimo!");
        }
    }
}
