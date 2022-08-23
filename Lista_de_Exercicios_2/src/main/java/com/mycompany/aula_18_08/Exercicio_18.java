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
public class Exercicio_18 {
    /*
    18.  Ler um valor em real e a cotação do dólar. Em seguida, exibir o valor 
    correspondente em dólares.
    */
    public static void main(String[] args){
        double valorEmReal=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor em real:"));
        double cotacaoDolar=Double.parseDouble(JOptionPane.showInputDialog("Informe a cotação do dolar:"));
        JOptionPane.showMessageDialog(null,"Você possui US$ "+valorEmReal/cotacaoDolar);
    }
}
