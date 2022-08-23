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
public class Exercicio3 {
    /*
    3.  Ler um número e verificar se ele é par ou ímpar.
    */
    public static void main(String[] args){
        Integer numero=Integer.parseInt(JOptionPane.showInputDialog("Informe um numero:","Digite aqui"));
        if(numero%2==0){
            JOptionPane.showMessageDialog(null,"O numero "+numero+" é par!");
        }
        else{
            JOptionPane.showMessageDialog(null,"O numero "+numero+" é impar!");
        }
    }
}
