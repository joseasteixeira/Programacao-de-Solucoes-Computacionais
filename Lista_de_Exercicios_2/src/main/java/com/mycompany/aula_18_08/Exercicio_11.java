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
public class Exercicio_11 {
    /*
    11. Fazer um programa que recebe o salário-base de um funcionário, calcula 
    e mostra o salário a receber, sabendo-se que esse funcionário tem 
    gratificação de 5% sobre o salário-base e paga imposto de 7% sobre o 
    salário-base.
    */
    public static void main(String[] args){
        double salarioBase, salarioAReceber=0;
        salarioBase=Double.parseDouble(JOptionPane.showInputDialog("Informe o salario base:"));
        salarioAReceber=salarioBase+(salarioBase*0.05d)-(salarioBase*0.07d);
        JOptionPane.showMessageDialog(null,"O salario a receber é R$ "+salarioAReceber);
    }
}
