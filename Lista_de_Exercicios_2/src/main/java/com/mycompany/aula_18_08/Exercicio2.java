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
public class Exercicio2 {
    /*
    2. Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior, 
    segundo a legislação brasileira. Escreva uma versão com if/else e outra com 
    o operador ternário.
    */
    public static void main(String[] args){
        Integer idade1=Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
        
        //---->CODIGO USANDO IF/ELSE<----//
        if(idade1>=18){
            JOptionPane.showMessageDialog(null, "Maior de idade!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Menor de idade!");
        }
        
        //---->CODIGO USANDO OPERADOR TERNARIO<----//
        Integer idade2=Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
        String maiorIdade=idade2>=18?"Maior de idade!":"Menor de idade!";
        JOptionPane.showMessageDialog(null, maiorIdade);
        
    }
   
}
