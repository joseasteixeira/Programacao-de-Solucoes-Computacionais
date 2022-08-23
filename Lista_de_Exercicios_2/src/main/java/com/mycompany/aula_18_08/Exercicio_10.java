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
public class Exercicio_10 {
    /*
    10. Fazer um programa que recebe o preço de um produto, calcula e mostra o 
    novo preço sabendo-se que este sofreu um desconto de 10%.
    */
    public static void main(String[] args){
        float precoProduto, precoReajustado=0;
        precoProduto=Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do produto:"));
        precoReajustado=precoProduto-(precoProduto*0.1f);
        JOptionPane.showMessageDialog(null,"O prço com desconto é R$ "+precoReajustado);
    }
}
