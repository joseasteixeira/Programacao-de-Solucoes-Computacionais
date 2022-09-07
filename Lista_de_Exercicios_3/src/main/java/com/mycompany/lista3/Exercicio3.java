/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista3;

import javax.swing.*;

/**
 *
 * @author Jose Teixeira
 */
public class Exercicio3 {
    /*
    3. Desenvolver um algoritimo que leia um numero nao determinado de valores
    e calcule e escreva a media aritimetica dos valores lidos, a quantidade de
    valores positivos, a quantidade de valores negativos, e o percentual de 
    valores negativos e positivos;
    */
    public static void main(String[] args){
        int quantidadeValores;
        double valor, soma=0, quantidadePositivo=0, quantidadenegativo=0,
               percentualPositivo=0, percentualNegativo;
        quantidadeValores=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de numeros: "));
        for(int i=0;i<quantidadeValores;i++){
            valor=Double.parseDouble(JOptionPane.showInputDialog("Informe o "+(i+1)+"° valor: "));
            soma+=valor;
            if(valor>0){
                quantidadePositivo++;
            }
            if(valor<0){
                quantidadenegativo++;
            }
        }
        JOptionPane.showMessageDialog(null,"Média aritimética: "+(soma/quantidadeValores));
        JOptionPane.showMessageDialog(null,"Quantidade de valores positivos: "+quantidadePositivo);
        JOptionPane.showMessageDialog(null,"Quantidade de valores negativos: "+quantidadenegativo);
        JOptionPane.showMessageDialog(null,"Percentual de valores positivos: "+(quantidadePositivo/quantidadeValores*100));
        JOptionPane.showMessageDialog(null,"Percentual de valores negativos: "+(quantidadenegativo/quantidadeValores*100));
    }
}
