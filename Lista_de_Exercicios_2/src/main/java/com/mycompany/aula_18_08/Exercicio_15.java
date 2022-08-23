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
public class Exercicio_15 {
    /*
    15.  Fazer um programa que recebe três números e mostra-os em ordem crescente.
    */
    public static void main(String[] args){
        float numero1, numero2, numero3, aux;
        numero1=Float.parseFloat(JOptionPane.showInputDialog("Informe o primeiro numero"));
        numero2=Float.parseFloat(JOptionPane.showInputDialog("Informe o segundo numero"));
        numero3=Float.parseFloat(JOptionPane.showInputDialog("Informe o terceiro numero"));
        if(numero1>numero2){
            aux=numero1;
            numero1=numero2;
            numero2=aux;
        }
        else;
        if(numero1>numero3){
            aux=numero1;
            numero1=numero3;
            numero3=aux;
        }
        else;
        if(numero2>numero3){
            aux=numero2;
            numero2=numero3;
            numero3=aux;
        }
        else;
        JOptionPane.showMessageDialog(null,numero1+" "+numero2+" "+numero3);
    }
}
