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
public class Exercicio_19 {
    /*
    19.  Ler um número inteiro e exibir o seu antecessor e o seu sucessor.
    */
    public static void main(String[] args){
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        JOptionPane.showMessageDialog(null,"O antecessor de "+numero+" é: "+(numero-1)+
                                           "\nO sucessor de "+numero+" é: "+(numero+1));
    }
}
