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
public class Exercicio_20 {
    /*
    20. Usando switch-case, escrever um programa que lê um inteiro entre 1 e 7 
    e exibe o dia da semana correspondente a esse número. Isto é, domingo se 1, 
    segunda-feira se 2, e assim por diante.
    */
    public static void main(String[] args){
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre de 1 a 7:"));
        switch(numero){
            case 1:JOptionPane.showMessageDialog(null,"Domingo!");
            break;
            case 2:JOptionPane.showMessageDialog(null,"Segunda-Feira!");
            break;
            case 3:JOptionPane.showMessageDialog(null,"Terça-Feira!");
            break;
            case 4:JOptionPane.showMessageDialog(null,"Quarta-Feira!");
            break;
            case 5:JOptionPane.showMessageDialog(null,"Quinta-Feira!");
            break;
            case 6:JOptionPane.showMessageDialog(null,"Sexta-Feira!");
            break;
            case 7:JOptionPane.showMessageDialog(null,"Sabado!");
            break;
            default:
        }
    }
}
