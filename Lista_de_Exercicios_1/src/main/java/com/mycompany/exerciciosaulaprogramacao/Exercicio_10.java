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
public class Exercicio_10 {
    /*
    10. O custo de um carro novo ao consumidor é a soma do custo de fábrica com
    a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
    Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
    ler o custo de fábrica de um carro, calcular e escrever o custo final ao 
    consumidor.
    */
    public static void main(String[] args){
        Double custoFabricante=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do fabricante: ","Digite aqui"));
        JOptionPane.showMessageDialog(null,"O custo final ao consumidor é de R$ "+(custoFabricante+(custoFabricante*0.28d)+(custoFabricante*0.45d)));
    }
}
