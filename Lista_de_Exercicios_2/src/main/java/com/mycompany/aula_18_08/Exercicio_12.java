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
public class Exercicio_12 {
    /*
    12. Fazer um programa que recebe o salário de um funcionário e o percentual 
    de aumento, calcula e mostra o valor do aumento e o novo salário.
    */
    public static void main(String[] args){
        float salario, novoSalario=0, percentualAumeno;
        salario=Float.parseFloat(JOptionPane.showInputDialog("Informe o salario atual:"));
        percentualAumeno=Float.parseFloat(JOptionPane.showInputDialog("Informe o percentual de aumento:"));
        novoSalario=salario+(salario*percentualAumeno/100);
        JOptionPane.showMessageDialog(null,"O novo salario é R$ "+novoSalario);
    }
}
