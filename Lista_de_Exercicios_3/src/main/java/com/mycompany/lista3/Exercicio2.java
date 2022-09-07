/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio2 {
    /*
    2. Desenvolver um algoritimo que leia a altura de 15 pessoas. Este programa
    deverá calcular e mostrar:
    a) A menor altura do grupo;
    b) A maior altura do grupo;
    */
    public static void main(String[] args){
        float altura, menorAltura=0, maiorAltura=0;
        int i=1;
        altura=Float.parseFloat(JOptionPane.showInputDialog("Informe a 1° altura: "));
        menorAltura=maiorAltura=altura;
        do{
            altura=Float.parseFloat(JOptionPane.showInputDialog("Informe a "+(i+1)+"° altura: "));
            if(menorAltura>altura){
                menorAltura=altura;
            }
            if(maiorAltura<altura){
                maiorAltura=altura;
            }
            i++;
        }while(i<5);
        JOptionPane.showMessageDialog(null,"A menor altura é: "+menorAltura);
        JOptionPane.showMessageDialog(null,"A maior altura é: "+maiorAltura);
    }
}
