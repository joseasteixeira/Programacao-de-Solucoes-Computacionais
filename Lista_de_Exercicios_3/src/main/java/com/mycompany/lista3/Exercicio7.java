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
public class Exercicio7 {
    /*
    7. escrever um algoritimo que leia um valor para uma variavel N de 1 a 10 e
    calcule a tabuada de N. Mostre a tabuada na forma: 0*N=0, 1*N=1N, 2*N=2N, ..., 10*N=10N.
    */
    public static void main(String[] args){
        double n=Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        for(int i=0;i<=10;i++){
            JOptionPane.showMessageDialog(null,i+"*"+n+"= "+(i*n));
        }
        
    }
}
