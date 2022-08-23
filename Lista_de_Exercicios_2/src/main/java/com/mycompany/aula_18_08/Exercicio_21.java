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
public class Exercicio_21 {
    /*
    21. Sabe-se que um ano é bissexto se for divisível por 400 ou se for 
    divisível por 4 e não for divisível por 100. Por exemplo: 1988, 1992, 1996, 
    2020. Determinar se um determinado ano lido é bissexto.
    */
    public static void main(String[] args){
        int ano=Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
        if((ano%400==0)||(ano%4==0&&ano%100!=0)){
            JOptionPane.showMessageDialog(null,"O ano "+ano+" é bissexto!");
        }
        else{
            JOptionPane.showMessageDialog(null,"O ano "+ano+" não é bissexto!");
        }
    }
}
