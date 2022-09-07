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
public class Exercicio5 {
    /*
    5. Faça um algoritimo estruturado que leia uma quantidade nao determinada de 
    números positivos. Calcule a quantidade de numeros pares e impares, a media
    de valores pares e impares, e a media geral dos numeros lidos. O numero que 
    encerrara a leitira sera zero.
    */
    public static void main(String[] args){
        int numero, QuantidadePares=0, QuantidadeImpares=0,aux=0;
        double somaPares=0, somaImpares=0, somaGeral=0;
        do{
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite um número positivo ou 0 para encerrar!"));
            if(numero%2==0&&numero!=0){
                somaPares+=numero;
                QuantidadePares++;
            }
            if(numero%2!=0){
                somaImpares+=numero;
                QuantidadeImpares++;
            }
            somaGeral+=numero;
            aux++;
        }while(numero!=0);
        JOptionPane.showMessageDialog(null,"Quantidade de numeros pares: "+QuantidadePares);
        JOptionPane.showMessageDialog(null,"Quantidade de numeros impares: "+QuantidadeImpares);
        JOptionPane.showMessageDialog(null,"Media dos numeros pares: "+(somaPares/QuantidadePares));
        JOptionPane.showMessageDialog(null,"Media dos numeros impares: "+(somaImpares/QuantidadeImpares));
        JOptionPane.showMessageDialog(null,"Media geral: "+(somaGeral/(aux-1)));
    }
}
