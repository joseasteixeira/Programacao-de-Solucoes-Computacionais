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
public class Exercicio_5 {
    /*
    5. ler as dimenssoes de um retangulo (base e altura), calcular e 
    escrever a área de retangulo.
    */
    public static void main(String[] args){
        Integer base=Integer.parseInt(JOptionPane.showInputDialog("Informe a base: ","Digite aqui"));
        Integer altura=Integer.parseInt(JOptionPane.showInputDialog("Informe a altura: ","Digite aqui"));
        JOptionPane.showMessageDialog(null,"A área do retangul é: "+(base*altura)+" m^2");
    }
}
