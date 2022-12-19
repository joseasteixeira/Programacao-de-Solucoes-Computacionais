/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_prof_cleyge;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio2 {
    /*
    2. Faça uma classe que gere aleatoriamente mil números inteiros quaisquer e 
    os armazene num array. A seguir, peça para o usuário digitar um número a ser 
    pesquisado no array. Informe ao usuário se o número existe ou não no array.
    */
    public static void main(String[] args){
        int[] numeros=new int[1000];
        int numeroProcurado;
        boolean numeroExiste=false;
        for(int i=0;i<numeros.length;i++){
            numeros[i]=(int)(Math.random()*10000);
        }
        numeroProcurado=Integer.parseInt(JOptionPane.showInputDialog("Imforme o numero a procurar: "));
        for(int i=0;i<numeros.length;i++){
            if(numeroProcurado==numeros[i]){
                numeroExiste=true;
            }
        }
        if(numeroExiste){
            JOptionPane.showMessageDialog(null,"O número procurado está no Array!");
        }else{
            JOptionPane.showMessageDialog(null,"O número procurado não está no Array!");
        }
    }
}
