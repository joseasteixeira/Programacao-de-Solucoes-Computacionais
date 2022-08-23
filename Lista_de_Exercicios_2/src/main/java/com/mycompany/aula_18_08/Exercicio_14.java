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
public class Exercicio_14 {
    /*
    14.  Fazer um programa que recebe dois números e mostre o maior.
    */
    public static void main(String[] args){
        int numero1, numero2;
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo numero: "));
        if(numero1>numero2){
            JOptionPane.showMessageDialog(null,"O numero "+numero1+" é maior");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"O numero "+numero2+" é maior");
        }
    }
}
