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
public class Exercicio6 {
    /*
    6.  Fazer um programa que recebe três notas, calcula e mostra a média 
    aritmética dessas notas.
    */
    public static void main(String[] args){
        Integer nota, aux=0, media=0;
        for(int i=0;i<3;i++){
            nota=Integer.parseInt(JOptionPane.showInputDialog("Informe a "+(i+1)+"° nota:","Digite aqui"));
            aux+=nota;
        }
        media=aux/3;
        JOptionPane.showMessageDialog(null,"A media é: "+media);
    }
}
