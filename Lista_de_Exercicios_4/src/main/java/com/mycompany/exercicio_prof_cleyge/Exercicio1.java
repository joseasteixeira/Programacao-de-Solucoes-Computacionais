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
public class Exercicio1 {
    /*
    1. Elabore uma classe que receba dez nomes de pessoas, armazene esses nomes 
    em um array de dez elementos, sorteie um ganhador e imprima o seu nome em tela.

    */
    public static void main(String[] args){
        String[] nomesPessoas=new String[10];
        int numeroSorteado;
        for(int i=0;i<nomesPessoas.length;i++){
            nomesPessoas[i]=JOptionPane.showInputDialog("Informe o "+(i+1)+"° nome: ");
        }
        numeroSorteado=(int)(Math.random()*nomesPessoas.length);
        JOptionPane.showMessageDialog(null,"A pessoa sorteada foi: "+nomesPessoas[numeroSorteado]);
    }
}
