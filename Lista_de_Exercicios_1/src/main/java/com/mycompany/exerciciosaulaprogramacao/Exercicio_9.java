/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosaulaprogramacao;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_9 {
    /*
    9. Ler o salário mensal atual de um funcionário e o percentual de reajuste. 
    Calcular e exibir o valor do novo salári
    */
    public static void main(String[] args){
        Double salario=Double.parseDouble(JOptionPane.showInputDialog("Informe o salario atual: ","Digite aqui"));
        Float porcentagem=Float.parseFloat(JOptionPane.showInputDialog("Informe a porcentagem de reajuste: ","Digite aqui"));
        JOptionPane.showMessageDialog(null,"O salario com reajuste é de R$ "+(salario+(salario*porcentagem/100)));
    }
}
