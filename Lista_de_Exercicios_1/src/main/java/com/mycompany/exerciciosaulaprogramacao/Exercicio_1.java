/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosaulaprogramacao;

import javax.swing.*;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio_1 {
    /*
    1. Ler a cotção do dólar e a quantidade de dólares. 
    Converta para real e mostre o resultado.
    */
    public static void main(String[] args){
        Float dolar, quantidade, valor;
        dolar=Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do dólar: ","Digite aqui"));
        quantidade=Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de dólares: "));
        valor=dolar*quantidade;
        JOptionPane.showMessageDialog(null, "Você tem um total de R$ "+valor);
    }
}
