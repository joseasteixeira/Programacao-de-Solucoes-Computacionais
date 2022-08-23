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
public class Exercicio5 {
    /*
    5.  Fazer um programa que recebe três números inteiros, calcula e mostra 
    a soma desses números.
    */
    public static void main(String[] args){
        Integer numero, soma=0;
        for(int i=0;i<3;i++){
            numero=Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"° numero:","Digite aqui"));
            soma+=numero;
        }
        JOptionPane.showMessageDialog(null,"A soma dos três números é: "+soma);
    }
}
