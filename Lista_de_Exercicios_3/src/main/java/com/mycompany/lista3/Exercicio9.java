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
public class Exercicio9 {
    /*
    9. Escrver um algoritimo que leia um valor inicial A, e uma razão R, e 
    imprima um asequencia em P.G. contendo 10 valores.
    */
    public static void main(String[] args){
        int valor, razao, j=0;
        valor=Integer.parseInt(JOptionPane.showInputDialog("Digite um valor: "));
        razao=Integer.parseInt(JOptionPane.showInputDialog("Digite a razão: "));
        for(int i=valor;j<10;valor*=razao){
            //JOptionPane.showMessageDialog(null,(j+1)+"° valor da sequancia: "+valor);
            System.out.println((j+1)+"°: "+valor+" ");
            j++;
        }
    }
}
